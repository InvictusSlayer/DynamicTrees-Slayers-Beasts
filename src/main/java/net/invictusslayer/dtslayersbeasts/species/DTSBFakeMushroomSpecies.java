package net.invictusslayer.dtslayersbeasts.species;

import com.ferreusveritas.dynamictrees.systems.genfeature.HugeMushroomGenFeature;
import com.ferreusveritas.dynamictrees.tree.species.Species;
import net.invictusslayer.dtslayersbeasts.DynamicTreesSB;
import net.invictusslayer.dtslayersbeasts.genfeature.DTSBGenFeatures;
import net.invictusslayer.slayersbeasts.common.init.SBBlocks;
import net.minecraft.resources.ResourceLocation;

public class DTSBFakeMushroomSpecies extends Species {
	public DTSBFakeMushroomSpecies(boolean whitecap) {
		setRegistryName(ResourceLocation.fromNamespaceAndPath(DynamicTreesSB.MOD_ID, (whitecap ? "white" : "black") + "_mushroom"));
		setUnlocalizedName(getRegistryName().toString());
		setStandardSoils();

		addGenFeature(DTSBGenFeatures.HUGE_MUSHROOM.with(HugeMushroomGenFeature.MUSHROOM_BLOCK,
				whitecap ? SBBlocks.WHITE_MUSHROOM_BLOCK.get() : SBBlocks.BLACK_MUSHROOM_BLOCK.get()));
	}

	public boolean isTransformable() {
		return false;
	}
}
