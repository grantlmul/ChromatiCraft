package Reika.ChromatiCraft.ModInterface;

import net.minecraft.world.World;

import Reika.ChromatiCraft.Auxiliary.Structure.NetworkOptimizerStructure;
import Reika.ChromatiCraft.Base.ChromaStructureBase;
import Reika.DragonAPI.Instantiable.Data.BlockStruct.FilledBlockArray;


public class VoidMonsterRitualStructure extends ChromaStructureBase {

	@Override
	public FilledBlockArray getArray(World world, int x, int y, int z) {
		return new NetworkOptimizerStructure().getArray(world, x, y, z);
	}

}