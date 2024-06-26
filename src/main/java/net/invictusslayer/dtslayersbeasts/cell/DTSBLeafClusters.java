package net.invictusslayer.dtslayersbeasts.cell;

import com.ferreusveritas.dynamictrees.util.SimpleVoxmap;
import net.minecraft.core.BlockPos;

public class DTSBLeafClusters {
	public static final SimpleVoxmap ASPEN = new SimpleVoxmap(3, 4, 3, new byte[] {
			0, 0, 0,
			0, 1, 0,
			0, 0, 0,

			0, 2, 0,
			2, 0, 2,
			0, 2, 0,

			0, 1, 0,
			1, 2, 1,
			0, 1, 0,

			0, 0, 0,
			0, 1, 0,
			0, 0, 0,
	}).setCenter(new BlockPos(1, 1, 1));

	public static final SimpleVoxmap DESERT_OAK = new SimpleVoxmap(3, 4, 3, new byte[] {
			2, 3, 2,
			3, 1, 3,
			2, 3, 2,

			1, 2, 1,
			2, 0, 2,
			1, 2, 1,

			0, 1, 0,
			1, 2, 1,
			0, 1, 0,

			0, 0, 0,
			0, 1, 0,
			0, 0, 0,
	}).setCenter(new BlockPos(1, 1, 1));
}
