package net.invictusslayer.dtslayersbeasts;

import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import com.ferreusveritas.dynamictrees.block.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.block.rooty.SoilProperties;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import com.ferreusveritas.dynamictrees.tree.species.Species;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DynamicTreesSB.MOD_ID)
public class DynamicTreesSB {
	public static final String MOD_ID = "dtslayersbeasts";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public DynamicTreesSB() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::commonSetup);
		bus.addListener(this::clientSetup);
		bus.addListener(this::gatherData);

		MinecraftForge.EVENT_BUS.register(this);

		RegistryHandler.setup(MOD_ID);
	}

	private void commonSetup(FMLCommonSetupEvent event) {}

	@OnlyIn(Dist.CLIENT)
	private void clientSetup(FMLClientSetupEvent event) {}

	private void gatherData(GatherDataEvent event) {
		GatherDataHelper.gatherTagData(MOD_ID, event);
		GatherDataHelper.gatherLootData(MOD_ID, event);
		GatherDataHelper.gatherBlockStateAndModelData(MOD_ID, event, SoilProperties.REGISTRY, Family.REGISTRY, Species.REGISTRY, LeavesProperties.REGISTRY);
		GatherDataHelper.gatherItemModelData(MOD_ID, event, SoilProperties.REGISTRY, Family.REGISTRY, Species.REGISTRY, LeavesProperties.REGISTRY);
	}
}
