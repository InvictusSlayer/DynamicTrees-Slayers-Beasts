package net.invictusslayer.dtslayersbeasts.genfeature;

import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeatureConfiguration;
import com.ferreusveritas.dynamictrees.systems.genfeature.HugeMushroomGenFeature;
import com.ferreusveritas.dynamictrees.systems.genfeature.context.FullGenerationContext;
import com.ferreusveritas.dynamictrees.util.SafeChunkBounds;
import com.ferreusveritas.dynamictrees.util.SimpleVoxmap;
import net.invictusslayer.slayersbeasts.common.init.SBBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import static net.minecraft.world.level.block.HugeMushroomBlock.*;

public class DTSBHugeMushroomGenFeature extends HugeMushroomGenFeature {
	private RandomSource random;
	private int direction;

	public static final SimpleVoxmap BLACK_CAP = new SimpleVoxmap(5, 5, 5, new byte[] {
			0, 11, 12, 13, 0,
			11, 0,  0, 0, 13,
			14, 0, 10, 0, 16,
			17, 0,  0, 0, 19,
			0, 17, 18, 19, 0,

			0, 1, 2, 3, 0,
			1, 0, 0, 0, 3,
			4, 0, 10, 0, 6,
			7, 0, 0, 0, 9,
			0, 7, 8, 9, 0,

			0, 0, 0, 0, 0,
			0, 1, 2, 3, 0,
			0, 4, 5, 6, 0,
			0, 7, 8, 9, 0,
			0, 0, 0, 0, 0,

			0, 0, 0, 0, 0,
			0, 1, 2, 3, 0,
			0, 4, 5, 6, 0,
			0, 7, 8, 9, 0,
			0, 0, 0, 0, 0,

			0, 0, 0, 0, 0,
			0, 0, 21, 0, 0,
			0, 22, 5, 23, 0,
			0, 0, 24, 0, 0,
			0, 0, 0, 0, 0
	}).setCenter(new BlockPos(2, 3, 2));

	public static final SimpleVoxmap BLACK_CAP_SMALL = new SimpleVoxmap(3, 2, 3, new byte[] {
			1, 2, 3,
			4, 10, 6,
			7, 8, 9,

			0, 20, 0,
			21, 5, 22,
			0, 23, 0
	}).setCenter(new BlockPos(1, 1, 1));

	public static final SimpleVoxmap WHITE_CAP = new SimpleVoxmap(5, 6, 5, new byte[] {
			0, 1, 2, 3, 0,
			1, 0, 0, 0, 3,
			4, 0, 10, 0, 6,
			7, 0, 0, 0, 9,
			0, 7, 8, 9, 0,

			0, 0, 0, 0, 0,
			0, 1, 2, 3, 0,
			0, 4, 10, 6, 0,
			0, 7, 8, 9, 0,
			0, 0, 0, 0, 0,

			0, 0, 0, 0, 0,
			0, 0, 20, 0, 0,
			0, 21, 5, 22, 0,
			0, 0, 23, 0, 0,
			0, 0, 0, 0, 0,

			0, 0, 0, 0, 0,
			0, 0, 20, 0, 0,
			0, 21, 5, 22, 0,
			0, 0, 23, 0, 0,
			0, 0, 0, 0, 0,

			0, 0, 0, 0, 0,
			0, 0, 0, 0, 0,
			0, 0, 24, 0, 0,
			0, 0, 0, 0, 0,
			0, 0, 0, 0, 0,

			0, 0, 0, 0, 0,
			0, 0, 26, 0, 0,
			0, 27, 0, 28, 0,
			0, 0, 29, 0, 0,
			0, 0, 0, 0, 0
	}).setCenter(new BlockPos(2, 3, 2));

	public static final SimpleVoxmap WHITE_CAP_SMALL = new SimpleVoxmap(3, 4, 3, new byte[] {
			1, 2, 3,
			4, 10, 6,
			7, 8, 9,

			0, 20, 0,
			21, 5, 22,
			0, 23, 0,

			0, 0, 0,
			0, 24, 0,
			0, 0, 0,

			0, 26, 0,
			27, 0, 28,
			0, 29, 0
	}).setCenter(new BlockPos(1, 1, 1));

	public DTSBHugeMushroomGenFeature(ResourceLocation registryName) {
		super(registryName);
	}

//	@Override
//	protected GenFeatureConfiguration createDefaultConfiguration() {
//		return super.createDefaultConfiguration().with(MUSHROOM_BLOCK, SBBlocks.WHITE_MUSHROOM_BLOCK.get());
//	}

	@Override
	protected SimpleVoxmap getCapForHeight(Block mushroomBlock, int height) {
		if (mushroomBlock == SBBlocks.BLACK_MUSHROOM_BLOCK.get()) return switch (height) {
			case 2, 3, 4, 5 -> BLACK_CAP_SMALL;
			default -> BLACK_CAP;
		};

		return switch (height) {
			case 2, 3, 4, 5, 6 -> WHITE_CAP_SMALL;
			default -> WHITE_CAP;
		};
	}

	@Override
	protected int getMushroomHeight(LevelAccessor level, BlockPos rootPos, Biome biome, RandomSource random, int radius, SafeChunkBounds safeBounds) {
		return 2 + random.nextInt(11);
	}

	protected boolean generate(GenFeatureConfiguration configuration, FullGenerationContext context) {
		random = context.random();
		direction = random.nextInt(4);
		return super.generate(configuration, context);
	}

	protected BlockState getMushroomStateForValue(Block mushroomBlock, BlockState stemBlock, int value, int y) {
		if (value > 25) {
			if (value - 26 == direction) return mushroomBlock.defaultBlockState();
			return Blocks.AIR.defaultBlockState();
		}

		if (value > 19) {
			return mushroomBlock.defaultBlockState()
					.setValue(UP, true)
					.setValue(DOWN, value == 25)
					.setValue(NORTH, value != 23)
					.setValue(SOUTH, value != 20)
					.setValue(WEST, value != 22)
					.setValue(EAST, value != 21);
		}

		if (value > 10) {
			if (random.nextInt(4) == 0) return super.getMushroomStateForValue(mushroomBlock, stemBlock, value - 10, y);
			return Blocks.AIR.defaultBlockState();
		}

		return super.getMushroomStateForValue(mushroomBlock, stemBlock, value, y);
	}
}
