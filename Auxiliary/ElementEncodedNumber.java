package Reika.ChromatiCraft.Auxiliary;

import java.util.ArrayList;
import java.util.Collections;

import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.DragonAPI.Libraries.Java.ReikaJavaLibrary;
import io.netty.buffer.ByteBuf;

public final class ElementEncodedNumber {

	private final int offset;
	public final int originalValue;
	private final CrystalElement[] encodedValue;

	public ElementEncodedNumber(int value) {
		this(value, 0);
	}

	public ElementEncodedNumber(int value, int bitOffset) {
		bitOffset = (bitOffset%16+16)%16;
		originalValue = value;
		offset = bitOffset;
		encodedValue = encodeValue(Math.abs(value), bitOffset);
	}

	private static CrystalElement[] encodeValue(int value, int offset) {
		byte[] vals = ReikaJavaLibrary.splitIntToHexChars(value);
		ArrayList<Byte> v = ReikaJavaLibrary.makeIntListFromArray(vals);
		Collections.reverse(v);
		while (v.get(0) == 0 && v.size() >= 1) //strip leading values
			v.remove(0);
		CrystalElement[] ret = new CrystalElement[v.size()];
		for (int i = 0; i < v.size(); i++) {
			int idx = (v.get(i)+offset)%16;
			ret[i] = CrystalElement.elements[idx];
			//ReikaJavaLibrary.pConsole(v.get(i)+" + "+offset+" = "+idx+" ("+ret[i]+")");
		}
		return ret;
	}

	public int getLength() {
		return encodedValue.length;
	}

	public CrystalElement getSlot(int idx) {
		return encodedValue[idx];
	}

	public static class EncodedPosition {

		private final int offset;
		private final ElementEncodedNumber x;
		private final ElementEncodedNumber z;

		public EncodedPosition(int o, ElementEncodedNumber ex, ElementEncodedNumber ez) {
			o = (o%16+16)%16;
			offset = o;
			x = ex;
			z = ez;
		}

		public void writeData(ByteBuf buf) {
			buf.writeInt(offset);
			buf.writeInt(x.originalValue);
			buf.writeInt(x.offset);
			buf.writeInt(z.originalValue);
			buf.writeInt(z.offset);
		}

		public static EncodedPosition readData(ByteBuf buf) {
			return new EncodedPosition(buf.readInt(), new ElementEncodedNumber(buf.readInt(), buf.readInt()), new ElementEncodedNumber(buf.readInt(), buf.readInt()));
		}

		public int totalLength() {
			return x.getLength()+z.getLength()+1;
		}

		public CrystalElement getColor(int idx) {
			if (idx == 0) {
				return CrystalElement.elements[offset];
			}
			else if (idx <= x.getLength()) {
				return x.getSlot(idx-1);
			}
			else {
				return z.getSlot(idx-1-x.getLength());
			}
		}

		public boolean isPartOfNegative(int idx) {
			if (idx == 0) {
				return false;
			}
			else if (idx <= x.getLength()) {
				return x.originalValue < 0;
			}
			else {
				return z.originalValue < 0;
			}
		}
	}

}