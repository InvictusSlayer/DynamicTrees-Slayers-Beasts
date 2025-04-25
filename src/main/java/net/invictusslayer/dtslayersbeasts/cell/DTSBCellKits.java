package net.invictusslayer.dtslayersbeasts.cell;

import com.ferreusveritas.dynamictrees.api.cell.Cell;
import com.ferreusveritas.dynamictrees.api.cell.CellKit;
import com.ferreusveritas.dynamictrees.api.cell.CellNull;
import com.ferreusveritas.dynamictrees.api.cell.CellSolver;
import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.cell.CellKits;
import com.ferreusveritas.dynamictrees.util.SimpleVoxmap;
import net.invictusslayer.dtslayersbeasts.DynamicTreesSB;
import net.minecraft.resources.ResourceLocation;

public class DTSBCellKits {
	public static final CellKit ASPEN = new CellKit(ResourceLocation.fromNamespaceAndPath(DynamicTreesSB.MOD_ID, "aspen")) {
		private final Cell[] aspenLeafCells = new Cell[] {CellNull.NULL_CELL, new AspenLeafCell(1), new AspenLeafCell(2), new AspenLeafCell(3), new AspenLeafCell(4), new AspenLeafCell(5), new AspenLeafCell(6), new AspenLeafCell(7)};
		private final Cell aspenBranchCell = new AspenBranchCell();
		private final CellSolver aspenSolver = new CellKits.BasicSolver(new short[] {0x0312, 0x0211});

		public Cell getCellForLeaves(int hydro) {
			return aspenLeafCells[hydro];
		}

		public Cell getCellForBranch(int radius, int meta) {
			return aspenBranchCell;
		}

		public CellSolver getCellSolver() {
			return aspenSolver;
		}

		public SimpleVoxmap getLeafCluster() {
			return DTSBLeafClusters.ASPEN;
		}

		public int getDefaultHydration() {
			return 4;
		}
	};

	public static final CellKit DESERT_OAK = new CellKit(ResourceLocation.fromNamespaceAndPath(DynamicTreesSB.MOD_ID, "desert_oak")) {
		private final Cell[] desertOakLeafCells = new Cell[] {CellNull.NULL_CELL, new DesertOakLeafCell(1), new DesertOakLeafCell(2), new DesertOakLeafCell(3), new DesertOakLeafCell(4), new DesertOakLeafCell(5), new DesertOakLeafCell(6), new DesertOakLeafCell(7)};
		private final Cell desertOakBranchCell = new DesertOakBranchCell();
		private final CellSolver desertOakSolver = new CellKits.BasicSolver(new short[] {0x0312, 0x0211});

		public Cell getCellForLeaves(int hydro) {
			return desertOakLeafCells[hydro];
		}

		public Cell getCellForBranch(int radius, int meta) {
			return desertOakBranchCell;
		}

		public CellSolver getCellSolver() {
			return desertOakSolver;
		}

		public SimpleVoxmap getLeafCluster() {
			return DTSBLeafClusters.DESERT_OAK;
		}

		public int getDefaultHydration() {
			return 4;
		}
	};

	public static void register(Registry<CellKit> registry) {
		registry.registerAll(ASPEN, DESERT_OAK);
	}
}
