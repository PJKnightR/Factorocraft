package net.fpr.factorocraft;

import com.mojang.logging.LogUtils;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.item.ModItems;
import net.fpr.factorocraft.world.structure.ModStructures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Factorocraft.MOD_ID)
public class Factorocraft
{
    public static final String MOD_ID = "factorocraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Factorocraft()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);

        ModStructures.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        //NetworkHandler.init();
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM FACTOROCRAFT");
        //LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
