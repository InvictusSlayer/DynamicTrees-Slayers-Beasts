package net.invictusslayer.dtslayersbeasts.genfeature;

import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import net.invictusslayer.dtslayersbeasts.DynamicTreesSB;
import net.minecraft.resources.ResourceLocation;

public class DTSBGenFeatures {
	public static final GenFeature HUGE_MUSHROOM = new DTSBHugeMushroomGenFeature(ResourceLocation.fromNamespaceAndPath(DynamicTreesSB.MOD_ID, "huge_mushroom"));

	public static void register(Registry<GenFeature> registry) {
		registry.registerAll(HUGE_MUSHROOM);
	}
}
