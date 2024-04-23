package net.invictusslayer.dtslayersbeasts.cell;

import com.ferreusveritas.dynamictrees.api.cell.Cell;
import com.ferreusveritas.dynamictrees.api.cell.CellKit;
import com.ferreusveritas.dynamictrees.api.cell.CellSolver;
import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.util.SimpleVoxmap;
import net.invictusslayer.dtslayersbeasts.DynamicTreesSB;
import net.minecraft.resources.ResourceLocation;

public class DTSBCellKits {
	public static final CellKit ASPEN = new CellKit(new ResourceLocation(DynamicTreesSB.MOD_ID, "aspen")) {
		public Cell getCellForLeaves(int i) {
			return null;
		}

		public Cell getCellForBranch(int i, int i1) {
			return null;
		}

		public CellSolver getCellSolver() {
			return null;
		}

		public SimpleVoxmap getLeafCluster() {
			return null;
		}

		public int getDefaultHydration() {
			return 0;
		}
	};

	public static void register(Registry<CellKit> registry) {
		registry.registerAll(ASPEN);
	}
}
