package net.invictusslayer.dtslayersbeasts.cell;

import com.ferreusveritas.dynamictrees.api.cell.Cell;
import net.minecraft.core.Direction;

public class AspenBranchCell implements Cell {
	public int getValue() {
		return 5;
	}

	static final int[] map = {1, 3, 2, 2, 2, 2};

	public int getValueFromSide(Direction side) {
		return map[side.ordinal()];
	}
}
