/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Structure.TDMaze;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import Reika.ChromatiCraft.Base.DimensionStructureGenerator;
import Reika.ChromatiCraft.Base.StructurePiece;
import Reika.ChromatiCraft.Block.Worldgen.BlockStructureShield.BlockType;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.DragonAPI.Instantiable.Data.Immutable.BlockKey;
import Reika.DragonAPI.Instantiable.Worldgen.ChunkSplicedGenerationCache;

public class LootRoom extends StructurePiece {

	private final Random rand;

	public LootRoom(DimensionStructureGenerator g, Random r) {
		super(g);
		rand = r;
	}

	@Override
	public void generate(ChunkSplicedGenerationCache world, int i, int j, int k) {
		i -= 5;
		j -= 5;
		k -= 5;

		this.generateBlocks(world, i, j, k);
		this.generateAir(world, i, j, k);

		this.placeCore(i+5, j+2, k+5);

		world.setBlock(i+5, j+3, k+5, ChromaBlocks.STRUCTSHIELD.getBlockInstance(), BlockType.GLASS.metadata);

		for (int a1 = -5; a1 <= 5; a1++) {
			for (int a2 = -5; a2 <= 5; a2++) {
				if (Math.abs(a1) == 5 || Math.abs(a2) == 5) {
					BlockKey bk = world.getBlock(i+5+a1, j+2, k+5+a2);
					if (bk == null || bk.metadata != BlockType.LIGHT.metadata) {
						parent.addBreakable(i+5+a1, j+1, k+5+a2);
						parent.addBreakable(i+5+a1, j+2, k+5+a2);
					}
				}
			}
		}
	}

	private void generateBlocks(ChunkSplicedGenerationCache world, int x, int y, int z) {
		Block sh = ChromaBlocks.STRUCTSHIELD.getBlockInstance();
		int ml = BlockType.LIGHT.metadata;
		int ms = BlockType.STONE.metadata;
		int mg = BlockType.GLASS.metadata;

		for (int i = 0; i <= 10; i++) {
			for (int k = 0; k <= 10; k++) {
				for (int d = 1; d <= 3; d++) {
					int dx = x+i;
					int dz = z+k;
					world.setBlock(dx, y-d, dz, sh, ms);
				}
			}
		}

		world.setBlock(x+0, y+0, z+0, sh, ms);
		world.setBlock(x+0, y+0, z+1, sh, ms);
		world.setBlock(x+0, y+0, z+2, sh, ms);
		world.setBlock(x+0, y+0, z+3, sh, ms);
		world.setBlock(x+0, y+0, z+4, sh, ms);
		world.setBlock(x+0, y+0, z+5, sh, ms);
		world.setBlock(x+0, y+0, z+6, sh, ms);
		world.setBlock(x+0, y+0, z+7, sh, ms);
		world.setBlock(x+0, y+0, z+8, sh, ms);
		world.setBlock(x+0, y+0, z+9, sh, ms);
		world.setBlock(x+0, y+0, z+10, sh, ms);
		world.setBlock(x+0, y+1, z+0, sh, ms);
		world.setBlock(x+0, y+1, z+1, sh, ms);
		world.setBlock(x+0, y+1, z+2, sh, ms);
		world.setBlock(x+0, y+1, z+3, sh, ms);
		world.setBlock(x+0, y+1, z+4, sh, ms);
		world.setBlock(x+0, y+1, z+5, sh, ms);
		world.setBlock(x+0, y+1, z+6, sh, ms);
		world.setBlock(x+0, y+1, z+7, sh, ms);
		world.setBlock(x+0, y+1, z+8, sh, ms);
		world.setBlock(x+0, y+1, z+9, sh, ms);
		world.setBlock(x+0, y+1, z+10, sh, ms);
		world.setBlock(x+0, y+2, z+0, sh, ms);
		world.setBlock(x+0, y+2, z+1, sh, ms);
		world.setBlock(x+0, y+2, z+2, sh, ms);
		world.setBlock(x+0, y+2, z+3, sh, ms);
		world.setBlock(x+0, y+2, z+4, sh, ms);
		world.setBlock(x+0, y+2, z+5, sh, ms);
		world.setBlock(x+0, y+2, z+6, sh, ms);
		world.setBlock(x+0, y+2, z+7, sh, ms);
		world.setBlock(x+0, y+2, z+8, sh, ms);
		world.setBlock(x+0, y+2, z+9, sh, ms);
		world.setBlock(x+0, y+2, z+10, sh, ms);
		world.setBlock(x+0, y+3, z+0, sh, ms);
		world.setBlock(x+0, y+3, z+1, sh, ms);
		world.setBlock(x+0, y+3, z+2, sh, ms);
		world.setBlock(x+0, y+3, z+3, sh, ms);
		world.setBlock(x+0, y+3, z+4, sh, ms);
		world.setBlock(x+0, y+3, z+5, sh, ms);
		world.setBlock(x+0, y+3, z+6, sh, ms);
		world.setBlock(x+0, y+3, z+7, sh, ms);
		world.setBlock(x+0, y+3, z+8, sh, ms);
		world.setBlock(x+0, y+3, z+9, sh, ms);
		world.setBlock(x+0, y+3, z+10, sh, ms);
		world.setBlock(x+0, y+4, z+0, sh, ms);
		world.setBlock(x+0, y+4, z+1, sh, ms);
		world.setBlock(x+0, y+4, z+2, sh, ms);
		world.setBlock(x+0, y+4, z+3, sh, ms);
		world.setBlock(x+0, y+4, z+4, sh, ms);
		world.setBlock(x+0, y+4, z+5, sh, ms);
		world.setBlock(x+0, y+4, z+6, sh, ms);
		world.setBlock(x+0, y+4, z+7, sh, ms);
		world.setBlock(x+0, y+4, z+8, sh, ms);
		world.setBlock(x+0, y+4, z+9, sh, ms);
		world.setBlock(x+0, y+4, z+10, sh, ms);
		world.setBlock(x+0, y+5, z+0, sh, ms);
		world.setBlock(x+0, y+5, z+1, sh, ms);
		world.setBlock(x+0, y+5, z+2, sh, ms);
		world.setBlock(x+0, y+5, z+3, sh, ms);
		world.setBlock(x+0, y+5, z+4, sh, ms);
		world.setBlock(x+0, y+5, z+5, sh, ms);
		world.setBlock(x+0, y+5, z+6, sh, ms);
		world.setBlock(x+0, y+5, z+7, sh, ms);
		world.setBlock(x+0, y+5, z+8, sh, ms);
		world.setBlock(x+0, y+5, z+9, sh, ms);
		world.setBlock(x+0, y+5, z+10, sh, ms);
		world.setBlock(x+0, y+6, z+0, sh, ms);
		world.setBlock(x+0, y+6, z+1, sh, ms);
		world.setBlock(x+0, y+6, z+2, sh, ms);
		world.setBlock(x+0, y+6, z+3, sh, ms);
		world.setBlock(x+0, y+6, z+4, sh, ms);
		world.setBlock(x+0, y+6, z+5, sh, ms);
		world.setBlock(x+0, y+6, z+6, sh, ms);
		world.setBlock(x+0, y+6, z+7, sh, ms);
		world.setBlock(x+0, y+6, z+8, sh, ms);
		world.setBlock(x+0, y+6, z+9, sh, ms);
		world.setBlock(x+0, y+6, z+10, sh, ms);
		world.setBlock(x+1, y+0, z+0, sh, ms);
		world.setBlock(x+1, y+0, z+1, sh, ms);
		world.setBlock(x+1, y+0, z+2, sh, ms);
		world.setBlock(x+1, y+0, z+3, sh, ms);
		world.setBlock(x+1, y+0, z+4, sh, ms);
		world.setBlock(x+1, y+0, z+5, sh, ms);
		world.setBlock(x+1, y+0, z+6, sh, ms);
		world.setBlock(x+1, y+0, z+7, sh, ms);
		world.setBlock(x+1, y+0, z+8, sh, ms);
		world.setBlock(x+1, y+0, z+9, sh, ms);
		world.setBlock(x+1, y+0, z+10, sh, ms);
		world.setBlock(x+1, y+1, z+0, sh, ms);
		world.setBlock(x+1, y+1, z+1, sh, ms);
		world.setBlock(x+1, y+1, z+9, sh, ms);
		world.setBlock(x+1, y+1, z+10, sh, ms);
		world.setBlock(x+1, y+2, z+0, sh, ms);
		world.setBlock(x+1, y+2, z+1, sh, ml);
		world.setBlock(x+1, y+2, z+9, sh, ml);
		world.setBlock(x+1, y+2, z+10, sh, ms);
		world.setBlock(x+1, y+3, z+0, sh, ms);
		world.setBlock(x+1, y+3, z+1, sh, ms);
		world.setBlock(x+1, y+3, z+2, sh, ms);
		world.setBlock(x+1, y+3, z+3, sh, ms);
		world.setBlock(x+1, y+3, z+4, sh, ms);
		world.setBlock(x+1, y+3, z+5, sh, ms);
		world.setBlock(x+1, y+3, z+6, sh, ms);
		world.setBlock(x+1, y+3, z+7, sh, ms);
		world.setBlock(x+1, y+3, z+8, sh, ms);
		world.setBlock(x+1, y+3, z+9, sh, ms);
		world.setBlock(x+1, y+3, z+10, sh, ms);
		world.setBlock(x+1, y+4, z+0, sh, ms);
		world.setBlock(x+1, y+4, z+10, sh, ms);
		world.setBlock(x+1, y+5, z+0, sh, ms);
		world.setBlock(x+1, y+5, z+10, sh, ms);
		world.setBlock(x+1, y+6, z+0, sh, ms);
		world.setBlock(x+1, y+6, z+1, sh, ms);
		world.setBlock(x+1, y+6, z+2, sh, ms);
		world.setBlock(x+1, y+6, z+3, sh, ms);
		world.setBlock(x+1, y+6, z+4, sh, ms);
		world.setBlock(x+1, y+6, z+5, sh, ms);
		world.setBlock(x+1, y+6, z+6, sh, ms);
		world.setBlock(x+1, y+6, z+7, sh, ms);
		world.setBlock(x+1, y+6, z+8, sh, ms);
		world.setBlock(x+1, y+6, z+9, sh, ms);
		world.setBlock(x+1, y+6, z+10, sh, ms);
		world.setBlock(x+2, y+0, z+0, sh, ms);
		world.setBlock(x+2, y+0, z+1, sh, ms);
		world.setBlock(x+2, y+0, z+2, sh, ms);
		world.setBlock(x+2, y+0, z+3, sh, ms);
		world.setBlock(x+2, y+0, z+4, sh, ms);
		world.setBlock(x+2, y+0, z+5, sh, ms);
		world.setBlock(x+2, y+0, z+6, sh, ms);
		world.setBlock(x+2, y+0, z+7, sh, ms);
		world.setBlock(x+2, y+0, z+8, sh, ms);
		world.setBlock(x+2, y+0, z+9, sh, ms);
		world.setBlock(x+2, y+0, z+10, sh, ms);
		world.setBlock(x+2, y+1, z+0, sh, ms);
		world.setBlock(x+2, y+1, z+10, sh, ms);
		world.setBlock(x+2, y+2, z+0, sh, ms);
		world.setBlock(x+2, y+2, z+10, sh, ms);
		world.setBlock(x+2, y+3, z+0, sh, ms);
		world.setBlock(x+2, y+3, z+1, sh, ms);
		world.setBlock(x+2, y+3, z+2, sh, ms);
		world.setBlock(x+2, y+3, z+3, sh, ms);
		world.setBlock(x+2, y+3, z+4, sh, ms);
		world.setBlock(x+2, y+3, z+5, sh, ms);
		world.setBlock(x+2, y+3, z+6, sh, ms);
		world.setBlock(x+2, y+3, z+7, sh, ms);
		world.setBlock(x+2, y+3, z+8, sh, ms);
		world.setBlock(x+2, y+3, z+9, sh, ms);
		world.setBlock(x+2, y+3, z+10, sh, ms);
		world.setBlock(x+2, y+4, z+0, sh, ms);
		world.setBlock(x+2, y+4, z+10, sh, ms);
		world.setBlock(x+2, y+5, z+0, sh, ms);
		world.setBlock(x+2, y+5, z+10, sh, ms);
		world.setBlock(x+2, y+6, z+0, sh, ms);
		world.setBlock(x+2, y+6, z+1, sh, ms);
		world.setBlock(x+2, y+6, z+2, sh, ms);
		world.setBlock(x+2, y+6, z+3, sh, ms);
		world.setBlock(x+2, y+6, z+4, sh, ms);
		world.setBlock(x+2, y+6, z+5, sh, ms);
		world.setBlock(x+2, y+6, z+6, sh, ms);
		world.setBlock(x+2, y+6, z+7, sh, ms);
		world.setBlock(x+2, y+6, z+8, sh, ms);
		world.setBlock(x+2, y+6, z+9, sh, ms);
		world.setBlock(x+2, y+6, z+10, sh, ms);
		world.setBlock(x+3, y+0, z+0, sh, ms);
		world.setBlock(x+3, y+0, z+1, sh, ms);
		world.setBlock(x+3, y+0, z+2, sh, ms);
		world.setBlock(x+3, y+0, z+3, sh, ms);
		world.setBlock(x+3, y+0, z+4, sh, ms);
		world.setBlock(x+3, y+0, z+5, sh, ms);
		world.setBlock(x+3, y+0, z+6, sh, ms);
		world.setBlock(x+3, y+0, z+7, sh, ms);
		world.setBlock(x+3, y+0, z+8, sh, ms);
		world.setBlock(x+3, y+0, z+9, sh, ms);
		world.setBlock(x+3, y+0, z+10, sh, ms);
		world.setBlock(x+3, y+1, z+0, sh, ms);
		world.setBlock(x+3, y+1, z+3, sh, ms);
		world.setBlock(x+3, y+1, z+4, sh, ms);
		world.setBlock(x+3, y+1, z+5, sh, ms);
		world.setBlock(x+3, y+1, z+6, sh, ms);
		world.setBlock(x+3, y+1, z+7, sh, ms);
		world.setBlock(x+3, y+1, z+10, sh, ms);
		world.setBlock(x+3, y+2, z+0, sh, ms);
		world.setBlock(x+3, y+2, z+3, sh, ms);
		world.setBlock(x+3, y+2, z+4, sh, ms);
		world.setBlock(x+3, y+2, z+5, sh, mg);
		world.setBlock(x+3, y+2, z+6, sh, ms);
		world.setBlock(x+3, y+2, z+7, sh, ms);
		world.setBlock(x+3, y+2, z+10, sh, ms);
		world.setBlock(x+3, y+3, z+0, sh, ms);
		world.setBlock(x+3, y+3, z+1, sh, ms);
		world.setBlock(x+3, y+3, z+2, sh, ms);
		world.setBlock(x+3, y+3, z+3, sh, ms);
		world.setBlock(x+3, y+3, z+4, sh, ms);
		world.setBlock(x+3, y+3, z+5, sh, ms);
		world.setBlock(x+3, y+3, z+6, sh, ms);
		world.setBlock(x+3, y+3, z+7, sh, ms);
		world.setBlock(x+3, y+3, z+8, sh, ms);
		world.setBlock(x+3, y+3, z+9, sh, ms);
		world.setBlock(x+3, y+3, z+10, sh, ms);
		world.setBlock(x+3, y+4, z+0, sh, ms);
		world.setBlock(x+3, y+4, z+3, sh, ms);
		world.setBlock(x+3, y+4, z+4, sh, ms);
		world.setBlock(x+3, y+4, z+5, sh, ms);
		world.setBlock(x+3, y+4, z+6, sh, ms);
		world.setBlock(x+3, y+4, z+7, sh, ms);
		world.setBlock(x+3, y+4, z+10, sh, ms);
		world.setBlock(x+3, y+5, z+0, sh, ms);
		world.setBlock(x+3, y+5, z+3, sh, ms);
		world.setBlock(x+3, y+5, z+4, sh, ms);
		world.setBlock(x+3, y+5, z+5, sh, ms);
		world.setBlock(x+3, y+5, z+6, sh, ms);
		world.setBlock(x+3, y+5, z+7, sh, ms);
		world.setBlock(x+3, y+5, z+10, sh, ms);
		world.setBlock(x+3, y+6, z+0, sh, ms);
		world.setBlock(x+3, y+6, z+1, sh, ms);
		world.setBlock(x+3, y+6, z+2, sh, ms);
		world.setBlock(x+3, y+6, z+3, sh, ms);
		world.setBlock(x+3, y+6, z+4, sh, ms);
		world.setBlock(x+3, y+6, z+5, sh, ms);
		world.setBlock(x+3, y+6, z+6, sh, ms);
		world.setBlock(x+3, y+6, z+7, sh, ms);
		world.setBlock(x+3, y+6, z+8, sh, ms);
		world.setBlock(x+3, y+6, z+9, sh, ms);
		world.setBlock(x+3, y+6, z+10, sh, ms);
		world.setBlock(x+4, y+0, z+0, sh, ms);
		world.setBlock(x+4, y+0, z+1, sh, ms);
		world.setBlock(x+4, y+0, z+2, sh, ms);
		world.setBlock(x+4, y+0, z+3, sh, ms);
		world.setBlock(x+4, y+0, z+4, sh, ms);
		world.setBlock(x+4, y+0, z+5, sh, ms);
		world.setBlock(x+4, y+0, z+6, sh, ms);
		world.setBlock(x+4, y+0, z+7, sh, ms);
		world.setBlock(x+4, y+0, z+8, sh, ms);
		world.setBlock(x+4, y+0, z+9, sh, ms);
		world.setBlock(x+4, y+0, z+10, sh, ms);
		world.setBlock(x+4, y+1, z+0, sh, ms);
		world.setBlock(x+4, y+1, z+3, sh, ms);
		world.setBlock(x+4, y+1, z+7, sh, ms);
		world.setBlock(x+4, y+1, z+10, sh, ms);
		world.setBlock(x+4, y+2, z+0, sh, ms);
		world.setBlock(x+4, y+2, z+3, sh, ms);
		world.setBlock(x+4, y+2, z+7, sh, ms);
		world.setBlock(x+4, y+2, z+10, sh, ms);
		world.setBlock(x+4, y+3, z+0, sh, ms);
		world.setBlock(x+4, y+3, z+1, sh, ms);
		world.setBlock(x+4, y+3, z+2, sh, ms);
		world.setBlock(x+4, y+3, z+3, sh, ms);
		world.setBlock(x+4, y+3, z+4, sh, ms);
		world.setBlock(x+4, y+3, z+5, sh, ms);
		world.setBlock(x+4, y+3, z+6, sh, ms);
		world.setBlock(x+4, y+3, z+7, sh, ms);
		world.setBlock(x+4, y+3, z+8, sh, ms);
		world.setBlock(x+4, y+3, z+9, sh, ms);
		world.setBlock(x+4, y+3, z+10, sh, ms);
		world.setBlock(x+4, y+4, z+0, sh, ms);
		world.setBlock(x+4, y+4, z+3, sh, ms);
		world.setBlock(x+4, y+4, z+7, sh, ms);
		world.setBlock(x+4, y+4, z+10, sh, ms);
		world.setBlock(x+4, y+5, z+0, sh, ms);
		world.setBlock(x+4, y+5, z+3, sh, ms);
		world.setBlock(x+4, y+5, z+7, sh, ms);
		world.setBlock(x+4, y+5, z+10, sh, ms);
		world.setBlock(x+4, y+6, z+0, sh, ms);
		world.setBlock(x+4, y+6, z+1, sh, ms);
		world.setBlock(x+4, y+6, z+2, sh, ms);
		world.setBlock(x+4, y+6, z+3, sh, ms);
		world.setBlock(x+4, y+6, z+7, sh, ms);
		world.setBlock(x+4, y+6, z+8, sh, ms);
		world.setBlock(x+4, y+6, z+9, sh, ms);
		world.setBlock(x+4, y+6, z+10, sh, ms);
		world.setBlock(x+5, y+0, z+0, sh, ms);
		world.setBlock(x+5, y+0, z+1, sh, ms);
		world.setBlock(x+5, y+0, z+2, sh, ms);
		world.setBlock(x+5, y+0, z+3, sh, ms);
		world.setBlock(x+5, y+0, z+4, sh, ms);
		world.setBlock(x+5, y+0, z+5, sh, ms);
		world.setBlock(x+5, y+0, z+6, sh, ms);
		world.setBlock(x+5, y+0, z+7, sh, ms);
		world.setBlock(x+5, y+0, z+8, sh, ms);
		world.setBlock(x+5, y+0, z+9, sh, ms);
		world.setBlock(x+5, y+0, z+10, sh, ms);
		world.setBlock(x+5, y+1, z+0, sh, ms);
		world.setBlock(x+5, y+1, z+3, sh, ms);
		world.setBlock(x+5, y+1, z+7, sh, ms);
		world.setBlock(x+5, y+1, z+10, sh, ms);
		world.setBlock(x+5, y+2, z+0, sh, ms);
		world.setBlock(x+5, y+2, z+3, sh, mg);
		world.setBlock(x+5, y+2, z+7, sh, mg);
		world.setBlock(x+5, y+2, z+10, sh, ms);
		world.setBlock(x+5, y+3, z+0, sh, ms);
		world.setBlock(x+5, y+3, z+1, sh, ms);
		world.setBlock(x+5, y+3, z+2, sh, ms);
		world.setBlock(x+5, y+3, z+3, sh, ms);
		world.setBlock(x+5, y+3, z+4, sh, ms);
		world.setBlock(x+5, y+3, z+5, sh, ms);
		world.setBlock(x+5, y+3, z+6, sh, ms);
		world.setBlock(x+5, y+3, z+7, sh, ms);
		world.setBlock(x+5, y+3, z+8, sh, ms);
		world.setBlock(x+5, y+3, z+9, sh, ms);
		world.setBlock(x+5, y+3, z+10, sh, ms);
		world.setBlock(x+5, y+4, z+0, sh, ms);
		world.setBlock(x+5, y+4, z+3, sh, ms);
		world.setBlock(x+5, y+4, z+7, sh, ms);
		world.setBlock(x+5, y+4, z+10, sh, ms);
		world.setBlock(x+5, y+5, z+0, sh, ms);
		world.setBlock(x+5, y+5, z+3, sh, ms);
		world.setBlock(x+5, y+5, z+7, sh, ms);
		world.setBlock(x+5, y+5, z+10, sh, ms);
		world.setBlock(x+5, y+6, z+0, sh, ms);
		world.setBlock(x+5, y+6, z+1, sh, ms);
		world.setBlock(x+5, y+6, z+2, sh, ms);
		world.setBlock(x+5, y+6, z+3, sh, ms);
		world.setBlock(x+5, y+6, z+7, sh, ms);
		world.setBlock(x+5, y+6, z+8, sh, ms);
		world.setBlock(x+5, y+6, z+9, sh, ms);
		world.setBlock(x+5, y+6, z+10, sh, ms);
		world.setBlock(x+6, y+0, z+0, sh, ms);
		world.setBlock(x+6, y+0, z+1, sh, ms);
		world.setBlock(x+6, y+0, z+2, sh, ms);
		world.setBlock(x+6, y+0, z+3, sh, ms);
		world.setBlock(x+6, y+0, z+4, sh, ms);
		world.setBlock(x+6, y+0, z+5, sh, ms);
		world.setBlock(x+6, y+0, z+6, sh, ms);
		world.setBlock(x+6, y+0, z+7, sh, ms);
		world.setBlock(x+6, y+0, z+8, sh, ms);
		world.setBlock(x+6, y+0, z+9, sh, ms);
		world.setBlock(x+6, y+0, z+10, sh, ms);
		world.setBlock(x+6, y+1, z+0, sh, ms);
		world.setBlock(x+6, y+1, z+3, sh, ms);
		world.setBlock(x+6, y+1, z+7, sh, ms);
		world.setBlock(x+6, y+1, z+10, sh, ms);
		world.setBlock(x+6, y+2, z+0, sh, ms);
		world.setBlock(x+6, y+2, z+3, sh, ms);
		world.setBlock(x+6, y+2, z+7, sh, ms);
		world.setBlock(x+6, y+2, z+10, sh, ms);
		world.setBlock(x+6, y+3, z+0, sh, ms);
		world.setBlock(x+6, y+3, z+1, sh, ms);
		world.setBlock(x+6, y+3, z+2, sh, ms);
		world.setBlock(x+6, y+3, z+3, sh, ms);
		world.setBlock(x+6, y+3, z+4, sh, ms);
		world.setBlock(x+6, y+3, z+5, sh, ms);
		world.setBlock(x+6, y+3, z+6, sh, ms);
		world.setBlock(x+6, y+3, z+7, sh, ms);
		world.setBlock(x+6, y+3, z+8, sh, ms);
		world.setBlock(x+6, y+3, z+9, sh, ms);
		world.setBlock(x+6, y+3, z+10, sh, ms);
		world.setBlock(x+6, y+4, z+0, sh, ms);
		world.setBlock(x+6, y+4, z+3, sh, ms);
		world.setBlock(x+6, y+4, z+7, sh, ms);
		world.setBlock(x+6, y+4, z+10, sh, ms);
		world.setBlock(x+6, y+5, z+0, sh, ms);
		world.setBlock(x+6, y+5, z+3, sh, ms);
		world.setBlock(x+6, y+5, z+7, sh, ms);
		world.setBlock(x+6, y+5, z+10, sh, ms);
		world.setBlock(x+6, y+6, z+0, sh, ms);
		world.setBlock(x+6, y+6, z+1, sh, ms);
		world.setBlock(x+6, y+6, z+2, sh, ms);
		world.setBlock(x+6, y+6, z+3, sh, ms);
		world.setBlock(x+6, y+6, z+7, sh, ms);
		world.setBlock(x+6, y+6, z+8, sh, ms);
		world.setBlock(x+6, y+6, z+9, sh, ms);
		world.setBlock(x+6, y+6, z+10, sh, ms);
		world.setBlock(x+7, y+0, z+0, sh, ms);
		world.setBlock(x+7, y+0, z+1, sh, ms);
		world.setBlock(x+7, y+0, z+2, sh, ms);
		world.setBlock(x+7, y+0, z+3, sh, ms);
		world.setBlock(x+7, y+0, z+4, sh, ms);
		world.setBlock(x+7, y+0, z+5, sh, ms);
		world.setBlock(x+7, y+0, z+6, sh, ms);
		world.setBlock(x+7, y+0, z+7, sh, ms);
		world.setBlock(x+7, y+0, z+8, sh, ms);
		world.setBlock(x+7, y+0, z+9, sh, ms);
		world.setBlock(x+7, y+0, z+10, sh, ms);
		world.setBlock(x+7, y+1, z+0, sh, ms);
		world.setBlock(x+7, y+1, z+3, sh, ms);
		world.setBlock(x+7, y+1, z+4, sh, ms);
		world.setBlock(x+7, y+1, z+5, sh, ms);
		world.setBlock(x+7, y+1, z+6, sh, ms);
		world.setBlock(x+7, y+1, z+7, sh, ms);
		world.setBlock(x+7, y+1, z+10, sh, ms);
		world.setBlock(x+7, y+2, z+0, sh, ms);
		world.setBlock(x+7, y+2, z+3, sh, ms);
		world.setBlock(x+7, y+2, z+4, sh, ms);
		world.setBlock(x+7, y+2, z+5, sh, mg);
		world.setBlock(x+7, y+2, z+6, sh, ms);
		world.setBlock(x+7, y+2, z+7, sh, ms);
		world.setBlock(x+7, y+2, z+10, sh, ms);
		world.setBlock(x+7, y+3, z+0, sh, ms);
		world.setBlock(x+7, y+3, z+1, sh, ms);
		world.setBlock(x+7, y+3, z+2, sh, ms);
		world.setBlock(x+7, y+3, z+3, sh, ms);
		world.setBlock(x+7, y+3, z+4, sh, ms);
		world.setBlock(x+7, y+3, z+5, sh, ms);
		world.setBlock(x+7, y+3, z+6, sh, ms);
		world.setBlock(x+7, y+3, z+7, sh, ms);
		world.setBlock(x+7, y+3, z+8, sh, ms);
		world.setBlock(x+7, y+3, z+9, sh, ms);
		world.setBlock(x+7, y+3, z+10, sh, ms);
		world.setBlock(x+7, y+4, z+0, sh, ms);
		world.setBlock(x+7, y+4, z+3, sh, ms);
		world.setBlock(x+7, y+4, z+4, sh, ms);
		world.setBlock(x+7, y+4, z+5, sh, ms);
		world.setBlock(x+7, y+4, z+6, sh, ms);
		world.setBlock(x+7, y+4, z+7, sh, ms);
		world.setBlock(x+7, y+4, z+10, sh, ms);
		world.setBlock(x+7, y+5, z+0, sh, ms);
		world.setBlock(x+7, y+5, z+3, sh, ms);
		world.setBlock(x+7, y+5, z+4, sh, ms);
		world.setBlock(x+7, y+5, z+5, sh, ms);
		world.setBlock(x+7, y+5, z+6, sh, ms);
		world.setBlock(x+7, y+5, z+7, sh, ms);
		world.setBlock(x+7, y+5, z+10, sh, ms);
		world.setBlock(x+7, y+6, z+0, sh, ms);
		world.setBlock(x+7, y+6, z+1, sh, ms);
		world.setBlock(x+7, y+6, z+2, sh, ms);
		world.setBlock(x+7, y+6, z+3, sh, ms);
		world.setBlock(x+7, y+6, z+4, sh, ms);
		world.setBlock(x+7, y+6, z+5, sh, ms);
		world.setBlock(x+7, y+6, z+6, sh, ms);
		world.setBlock(x+7, y+6, z+7, sh, ms);
		world.setBlock(x+7, y+6, z+8, sh, ms);
		world.setBlock(x+7, y+6, z+9, sh, ms);
		world.setBlock(x+7, y+6, z+10, sh, ms);
		world.setBlock(x+8, y+0, z+0, sh, ms);
		world.setBlock(x+8, y+0, z+1, sh, ms);
		world.setBlock(x+8, y+0, z+2, sh, ms);
		world.setBlock(x+8, y+0, z+3, sh, ms);
		world.setBlock(x+8, y+0, z+4, sh, ms);
		world.setBlock(x+8, y+0, z+5, sh, ms);
		world.setBlock(x+8, y+0, z+6, sh, ms);
		world.setBlock(x+8, y+0, z+7, sh, ms);
		world.setBlock(x+8, y+0, z+8, sh, ms);
		world.setBlock(x+8, y+0, z+9, sh, ms);
		world.setBlock(x+8, y+0, z+10, sh, ms);
		world.setBlock(x+8, y+1, z+0, sh, ms);
		world.setBlock(x+8, y+1, z+10, sh, ms);
		world.setBlock(x+8, y+2, z+0, sh, ms);
		world.setBlock(x+8, y+2, z+10, sh, ms);
		world.setBlock(x+8, y+3, z+0, sh, ms);
		world.setBlock(x+8, y+3, z+1, sh, ms);
		world.setBlock(x+8, y+3, z+2, sh, ms);
		world.setBlock(x+8, y+3, z+3, sh, ms);
		world.setBlock(x+8, y+3, z+4, sh, ms);
		world.setBlock(x+8, y+3, z+5, sh, ms);
		world.setBlock(x+8, y+3, z+6, sh, ms);
		world.setBlock(x+8, y+3, z+7, sh, ms);
		world.setBlock(x+8, y+3, z+8, sh, ms);
		world.setBlock(x+8, y+3, z+9, sh, ms);
		world.setBlock(x+8, y+3, z+10, sh, ms);
		world.setBlock(x+8, y+4, z+0, sh, ms);
		world.setBlock(x+8, y+4, z+10, sh, ms);
		world.setBlock(x+8, y+5, z+0, sh, ms);
		world.setBlock(x+8, y+5, z+10, sh, ms);
		world.setBlock(x+8, y+6, z+0, sh, ms);
		world.setBlock(x+8, y+6, z+1, sh, ms);
		world.setBlock(x+8, y+6, z+2, sh, ms);
		world.setBlock(x+8, y+6, z+4, sh, ms);
		world.setBlock(x+8, y+6, z+5, sh, ms);
		world.setBlock(x+8, y+6, z+6, sh, ms);
		world.setBlock(x+8, y+6, z+7, sh, ms);
		world.setBlock(x+8, y+6, z+8, sh, ms);
		world.setBlock(x+8, y+6, z+9, sh, ms);
		world.setBlock(x+8, y+6, z+10, sh, ms);
		world.setBlock(x+9, y+0, z+0, sh, ms);
		world.setBlock(x+9, y+0, z+1, sh, ms);
		world.setBlock(x+9, y+0, z+2, sh, ms);
		world.setBlock(x+9, y+0, z+3, sh, ms);
		world.setBlock(x+9, y+0, z+4, sh, ms);
		world.setBlock(x+9, y+0, z+5, sh, ms);
		world.setBlock(x+9, y+0, z+6, sh, ms);
		world.setBlock(x+9, y+0, z+7, sh, ms);
		world.setBlock(x+9, y+0, z+8, sh, ms);
		world.setBlock(x+9, y+0, z+9, sh, ms);
		world.setBlock(x+9, y+0, z+10, sh, ms);
		world.setBlock(x+9, y+1, z+0, sh, ms);
		world.setBlock(x+9, y+1, z+1, sh, ms);
		world.setBlock(x+9, y+1, z+9, sh, ms);
		world.setBlock(x+9, y+1, z+10, sh, ms);
		world.setBlock(x+9, y+2, z+0, sh, ms);
		world.setBlock(x+9, y+2, z+1, sh, ml);
		world.setBlock(x+9, y+2, z+9, sh, ml);
		world.setBlock(x+9, y+2, z+10, sh, ms);
		world.setBlock(x+9, y+3, z+0, sh, ms);
		world.setBlock(x+9, y+3, z+1, sh, ms);
		world.setBlock(x+9, y+3, z+2, sh, ms);
		world.setBlock(x+9, y+3, z+3, sh, ms);
		world.setBlock(x+9, y+3, z+4, sh, ms);
		world.setBlock(x+9, y+3, z+5, sh, ms);
		world.setBlock(x+9, y+3, z+6, sh, ms);
		world.setBlock(x+9, y+3, z+7, sh, ms);
		world.setBlock(x+9, y+3, z+8, sh, ms);
		world.setBlock(x+9, y+3, z+9, sh, ms);
		world.setBlock(x+9, y+3, z+10, sh, ms);
		world.setBlock(x+9, y+4, z+0, sh, ms);
		world.setBlock(x+9, y+4, z+10, sh, ms);
		world.setBlock(x+9, y+5, z+0, sh, ms);
		world.setBlock(x+9, y+5, z+10, sh, ms);
		world.setBlock(x+9, y+6, z+0, sh, ms);
		world.setBlock(x+9, y+6, z+1, sh, ms);
		world.setBlock(x+9, y+6, z+2, sh, ms);
		world.setBlock(x+9, y+6, z+3, sh, ms);
		world.setBlock(x+9, y+6, z+4, sh, ms);
		world.setBlock(x+9, y+6, z+5, sh, ms);
		world.setBlock(x+9, y+6, z+6, sh, ms);
		world.setBlock(x+9, y+6, z+7, sh, ms);
		world.setBlock(x+9, y+6, z+8, sh, ms);
		world.setBlock(x+9, y+6, z+9, sh, ms);
		world.setBlock(x+9, y+6, z+10, sh, ms);
		world.setBlock(x+10, y+0, z+0, sh, ms);
		world.setBlock(x+10, y+0, z+1, sh, ms);
		world.setBlock(x+10, y+0, z+2, sh, ms);
		world.setBlock(x+10, y+0, z+3, sh, ms);
		world.setBlock(x+10, y+0, z+4, sh, ms);
		world.setBlock(x+10, y+0, z+5, sh, ms);
		world.setBlock(x+10, y+0, z+6, sh, ms);
		world.setBlock(x+10, y+0, z+7, sh, ms);
		world.setBlock(x+10, y+0, z+8, sh, ms);
		world.setBlock(x+10, y+0, z+9, sh, ms);
		world.setBlock(x+10, y+0, z+10, sh, ms);
		world.setBlock(x+10, y+1, z+0, sh, ms);
		world.setBlock(x+10, y+1, z+1, sh, ms);
		world.setBlock(x+10, y+1, z+2, sh, ms);
		world.setBlock(x+10, y+1, z+3, sh, ms);
		world.setBlock(x+10, y+1, z+4, sh, ms);
		world.setBlock(x+10, y+1, z+5, sh, ms);
		world.setBlock(x+10, y+1, z+6, sh, ms);
		world.setBlock(x+10, y+1, z+7, sh, ms);
		world.setBlock(x+10, y+1, z+8, sh, ms);
		world.setBlock(x+10, y+1, z+9, sh, ms);
		world.setBlock(x+10, y+1, z+10, sh, ms);
		world.setBlock(x+10, y+2, z+0, sh, ms);
		world.setBlock(x+10, y+2, z+1, sh, ms);
		world.setBlock(x+10, y+2, z+2, sh, ms);
		world.setBlock(x+10, y+2, z+3, sh, ms);
		world.setBlock(x+10, y+2, z+4, sh, ms);
		world.setBlock(x+10, y+2, z+5, sh, ms);
		world.setBlock(x+10, y+2, z+6, sh, ms);
		world.setBlock(x+10, y+2, z+7, sh, ms);
		world.setBlock(x+10, y+2, z+8, sh, ms);
		world.setBlock(x+10, y+2, z+9, sh, ms);
		world.setBlock(x+10, y+2, z+10, sh, ms);
		world.setBlock(x+10, y+3, z+0, sh, ms);
		world.setBlock(x+10, y+3, z+1, sh, ms);
		world.setBlock(x+10, y+3, z+2, sh, ms);
		world.setBlock(x+10, y+3, z+3, sh, ms);
		world.setBlock(x+10, y+3, z+4, sh, ms);
		world.setBlock(x+10, y+3, z+5, sh, ms);
		world.setBlock(x+10, y+3, z+6, sh, ms);
		world.setBlock(x+10, y+3, z+7, sh, ms);
		world.setBlock(x+10, y+3, z+8, sh, ms);
		world.setBlock(x+10, y+3, z+9, sh, ms);
		world.setBlock(x+10, y+3, z+10, sh, ms);
		world.setBlock(x+10, y+4, z+0, sh, ms);
		world.setBlock(x+10, y+4, z+1, sh, ms);
		world.setBlock(x+10, y+4, z+2, sh, ms);
		world.setBlock(x+10, y+4, z+3, sh, ms);
		world.setBlock(x+10, y+4, z+4, sh, ms);
		world.setBlock(x+10, y+4, z+5, sh, ms);
		world.setBlock(x+10, y+4, z+6, sh, ms);
		world.setBlock(x+10, y+4, z+7, sh, ms);
		world.setBlock(x+10, y+4, z+8, sh, ms);
		world.setBlock(x+10, y+4, z+9, sh, ms);
		world.setBlock(x+10, y+4, z+10, sh, ms);
		world.setBlock(x+10, y+5, z+0, sh, ms);
		world.setBlock(x+10, y+5, z+1, sh, ms);
		world.setBlock(x+10, y+5, z+2, sh, ms);
		world.setBlock(x+10, y+5, z+3, sh, ms);
		world.setBlock(x+10, y+5, z+4, sh, ms);
		world.setBlock(x+10, y+5, z+5, sh, ms);
		world.setBlock(x+10, y+5, z+6, sh, ms);
		world.setBlock(x+10, y+5, z+7, sh, ms);
		world.setBlock(x+10, y+5, z+8, sh, ms);
		world.setBlock(x+10, y+5, z+9, sh, ms);
		world.setBlock(x+10, y+5, z+10, sh, ms);
		world.setBlock(x+10, y+6, z+0, sh, ms);
		world.setBlock(x+10, y+6, z+1, sh, ms);
		world.setBlock(x+10, y+6, z+2, sh, ms);
		world.setBlock(x+10, y+6, z+3, sh, ms);
		world.setBlock(x+10, y+6, z+4, sh, ms);
		world.setBlock(x+10, y+6, z+5, sh, ms);
		world.setBlock(x+10, y+6, z+6, sh, ms);
		world.setBlock(x+10, y+6, z+7, sh, ms);
		world.setBlock(x+10, y+6, z+8, sh, ms);
		world.setBlock(x+10, y+6, z+9, sh, ms);
		world.setBlock(x+10, y+6, z+10, sh, ms);
	}

	private void generateAir(ChunkSplicedGenerationCache world, int x, int y, int z) {
		world.setBlock(x+1, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+1, y+1, z+3, STRUCTURE_AIR);
		world.setBlock(x+1, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+1, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+1, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+1, y+1, z+7, STRUCTURE_AIR);
		world.setBlock(x+1, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+3, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+5, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+7, STRUCTURE_AIR);
		world.setBlock(x+1, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+3, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+7, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+1, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+3, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+7, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+1, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+3, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+7, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+2, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+3, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+5, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+7, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+2, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+3, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+7, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+2, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+3, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+7, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+2, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+3, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+3, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+3, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+3, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+3, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+3, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+3, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+3, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+3, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+3, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+3, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+3, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+3, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+3, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+3, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+3, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+4, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+5, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+4, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+4, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+4, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+4, y+6, z+4, STRUCTURE_AIR);
		world.setBlock(x+4, y+6, z+5, STRUCTURE_AIR);
		world.setBlock(x+4, y+6, z+6, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+5, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+5, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+5, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+5, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+5, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+5, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+5, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+5, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+5, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+5, y+6, z+4, STRUCTURE_AIR);
		world.setBlock(x+5, y+6, z+5, STRUCTURE_AIR);
		world.setBlock(x+5, y+6, z+6, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+6, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+5, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+6, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+6, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+6, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+6, y+6, z+4, STRUCTURE_AIR);
		world.setBlock(x+6, y+6, z+5, STRUCTURE_AIR);
		world.setBlock(x+6, y+6, z+6, STRUCTURE_AIR);
		world.setBlock(x+7, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+7, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+7, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+7, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+7, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+7, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+7, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+7, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+7, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+7, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+7, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+7, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+7, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+7, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+7, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+7, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+1, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+3, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+7, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+8, y+1, z+9, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+1, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+3, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+5, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+7, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+8, y+2, z+9, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+3, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+7, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+8, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+3, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+7, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+8, y+5, z+9, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+2, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+3, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+4, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+5, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+6, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+7, STRUCTURE_AIR);
		world.setBlock(x+9, y+1, z+8, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+2, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+3, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+4, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+5, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+6, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+7, STRUCTURE_AIR);
		world.setBlock(x+9, y+2, z+8, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+1, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+2, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+3, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+4, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+5, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+6, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+7, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+8, STRUCTURE_AIR);
		world.setBlock(x+9, y+4, z+9, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+1, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+2, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+3, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+4, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+5, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+6, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+7, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+8, STRUCTURE_AIR);
		world.setBlock(x+9, y+5, z+9, STRUCTURE_AIR);
	}

}
