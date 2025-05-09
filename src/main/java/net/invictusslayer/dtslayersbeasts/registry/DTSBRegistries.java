package net.invictusslayer.dtslayersbeasts.registry;

import com.ferreusveritas.dynamictrees.api.cell.CellKit;
import com.ferreusveritas.dynamictrees.api.registry.RegistryEvent;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import com.ferreusveritas.dynamictrees.growthlogic.GrowthLogicKit;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import com.ferreusveritas.dynamictrees.tree.species.Species;
import net.invictusslayer.dtslayersbeasts.DynamicTreesSB;
import net.invictusslayer.dtslayersbeasts.canceller.DoubleRandomFeatureCanceller;
import net.invictusslayer.dtslayersbeasts.cell.DTSBCellKits;
import net.invictusslayer.dtslayersbeasts.genfeature.DTSBGenFeatures;
import net.invictusslayer.dtslayersbeasts.growthlogic.DTSBGrowthLogicKits;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTSBRegistries {
	@SubscribeEvent
	public static void registerCellKits(RegistryEvent<CellKit> event) {
		DTSBCellKits.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerGenFeatures(RegistryEvent<GenFeature> event) {
		DTSBGenFeatures.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerGrowthLogicKits(RegistryEvent<GrowthLogicKit> event) {
		DTSBGrowthLogicKits.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerSpecies(RegistryEvent<Species> event) {
//		event.getRegistry().registerAll(new DTSBFakeMushroomSpecies(true), new DTSBFakeMushroomSpecies(false));
	}

	@SubscribeEvent
	public static void registerFeatureCancellers(RegistryEvent<FeatureCanceller> event) {
		event.getRegistry().registerAll(new DoubleRandomFeatureCanceller<>(ResourceLocation.fromNamespaceAndPath(DynamicTreesSB.MOD_ID, "mushroom"), HugeMushroomFeatureConfiguration.class));
	}
}
