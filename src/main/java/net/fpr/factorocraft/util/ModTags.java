package net.fpr.factorocraft.util;

import net.fpr.factorocraft.Factorocraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModTags {
    public static class Biomes {

        public static TagKey<Biome> IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "is_ore_vein_spawnable"));

        public static TagKey<Biome> NETHER_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "nether_is_ore_vein_spawnable"));

        public static TagKey<Biome> END_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "end_is_ore_vein_spawnable"));

        public static TagKey<Biome> AETHER_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "aether_is_ore_vein_spawnable"));

        public static TagKey<Biome> MOON_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "moon_is_ore_vein_spawnable"));

        public static TagKey<Biome> MARS_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "mars_is_ore_vein_spawnable"));

        public static TagKey<Biome> VENUS_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "venus_is_ore_vein_spawnable"));

        public static TagKey<Biome> GLACIO_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "glacio_is_ore_vein_spawnable"));
    }
}