package net.invictusslayer.dtslayersbeasts.cell;

import com.ferreusveritas.dynamictrees.cell.MatrixCell;

public class DesertOakLeafCell extends MatrixCell {
	public DesertOakLeafCell(int value) {
		super(value, valMap);
	}

	static final byte[] valMap = {
			0, 1, 2, 3, 4, 0, 0, 0, //D Maps * -> *
			0, 1, 2, 3, 3, 0, 0, 0, //U Maps 4 -> 3, * -> *
			0, 1, 2, 0, 0, 0, 0, 0, //N Maps 3 -> 0, 4 -> 0, * -> *
			0, 1, 2, 0, 0, 0, 0, 0, //S Maps 3 -> 0, 4 -> 0, * -> *
			0, 1, 2, 0, 0, 0, 0, 0, //W Maps 3 -> 0, 4 -> 0, * -> *
			0, 1, 2, 0, 0, 0, 0, 0  //E Maps 3 -> 0, 4 -> 0, * -> *
	};
}
