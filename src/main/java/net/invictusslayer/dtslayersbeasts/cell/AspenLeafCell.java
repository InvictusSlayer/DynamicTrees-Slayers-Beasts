package net.invictusslayer.dtslayersbeasts.cell;

import com.ferreusveritas.dynamictrees.cell.MatrixCell;

public class AspenLeafCell extends MatrixCell {
	public AspenLeafCell(int value) {
		super(value, valMap);
	}

	static final byte[] valMap = {
			0, 0, 0, 0, 0, 0, 0, 0, //D Maps * -> 0
			0, 1, 2, 3, 4, 0, 0, 0, //U Maps 4 -> 4, * -> *
			0, 1, 2, 3, 3, 0, 0, 0, //N Maps 4 -> 3, * -> *
			0, 1, 2, 3, 3, 0, 0, 0, //S Maps 4 -> 3, * -> *
			0, 1, 2, 3, 3, 0, 0, 0, //W Maps 4 -> 3, * -> *
			0, 1, 2, 3, 3, 0, 0, 0  //E Maps 4 -> 3, * -> *
	};
}
