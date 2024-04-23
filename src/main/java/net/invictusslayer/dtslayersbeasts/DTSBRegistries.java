package net.invictusslayer.dtslayersbeasts;

import com.ferreusveritas.dynamictrees.api.cell.CellKit;
import com.ferreusveritas.dynamictrees.api.registry.RegistryEvent;
import com.ferreusveritas.dynamictrees.growthlogic.GrowthLogicKit;
import net.invictusslayer.dtslayersbeasts.cell.DTSBCellKits;
import net.invictusslayer.dtslayersbeasts.growthlogic.DTSBGrowthLogicKits;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTSBRegistries {
	@SubscribeEvent
	public static void registerCellKits(RegistryEvent<CellKit> event) {
		DTSBCellKits.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerGrowthLogicKits(RegistryEvent<GrowthLogicKit> event) {
		DTSBGrowthLogicKits.register(event.getRegistry());
	}
}
