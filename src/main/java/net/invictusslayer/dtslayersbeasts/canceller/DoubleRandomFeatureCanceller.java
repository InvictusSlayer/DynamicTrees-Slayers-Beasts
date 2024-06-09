package net.invictusslayer.dtslayersbeasts.canceller;

import com.ferreusveritas.dynamictrees.api.worldgen.BiomePropertySelectors;
import com.ferreusveritas.dynamictrees.api.worldgen.FeatureCanceller;
import net.invictusslayer.slayersbeasts.common.SlayersBeasts;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraftforge.registries.ForgeRegistries;

public class DoubleRandomFeatureCanceller<T extends FeatureConfiguration> extends FeatureCanceller {
	private final Class<T> configClass;

	public DoubleRandomFeatureCanceller(ResourceLocation registryName, Class<T> configClass) {
		super(registryName);
		this.configClass = configClass;
	}

	public boolean shouldCancel(ConfiguredFeature<?, ?> configuredFeature, BiomePropertySelectors.NormalFeatureCancellation cancellation) {
		ResourceLocation key = ForgeRegistries.FEATURES.getKey(configuredFeature.feature());
		if (key == null) return false;

		if (configuredFeature.config() instanceof RandomFeatureConfiguration configuration) {
			for (WeightedPlacedFeature placedFeature : configuration.features) {
				ConfiguredFeature<?, ?> feature = placedFeature.feature.get().feature().get();

				if (feature.config() instanceof RandomFeatureConfiguration) if (cancellation.shouldCancelNamespace(key.getNamespace())
						&& feature.config().getFeatures().map(ConfiguredFeature::config).anyMatch(configClass::isInstance)) return true;
			}
		}

		return false;
	}
}
