package net.fpr.factorocraft.util;

import net.fpr.factorocraft.Factorocraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModTags {
    public static class Biomes {

        public static TagKey<Biome> IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "is_ore_vein_spawnable"));
    }
}