package net.invictusslayer.dtslayersbeasts.growthlogic;

import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.growthlogic.GrowthLogicKit;

public class DTSBGrowthLogicKits {
	public static final GrowthLogicKit ASPEN = new AspenGrowthLogic();

	public static void register(Registry<GrowthLogicKit> registry) {
		registry.registerAll(ASPEN);
	}
}
