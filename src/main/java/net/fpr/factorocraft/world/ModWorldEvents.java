package net.fpr.factorocraft.world;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Factorocraft.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        //ModTreeGeneration.generateTrees(event);
        //ModFlowerGeneration.generateFlowers(event);
    }
}
