package net.fpr.factorocraft.util;

import net.fpr.factorocraft.Factorocraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;

public class ModTags {
    public static class Biomes {

        public static TagKey<Biome> IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "is_ore_vein_spawnable"));

        public static TagKey<Biome> NETHER_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "nether_is_ore_vein_spawnable"));

        public static TagKey<Biome> END_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "end_is_ore_vein_spawnable"));

        public static TagKey<Biome> AETHER_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "aether_is_ore_vein_spawnable"));

        public static TagKey<Biome> MOON_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "moon_is_ore_vein_spawnable"));

        public static TagKey<Biome> MARS_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "mars_is_ore_vein_spawnable"));

        public static TagKey<Biome> VENUS_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "venus_is_ore_vein_spawnable"));

        public static TagKey<Biome> GLACIO_IS_ORE_VEIN_SPAWNABLE =
                TagKey.create(Registries.BIOME, new ResourceLocation(Factorocraft.MOD_ID, "glacio_is_ore_vein_spawnable"));
    }

    public static class Items {

        public static TagKey<Item> ALUMINUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aluminum_ore_vein_drop"));

        public static TagKey<Item> CALORITE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "calorite_ore_vein_drop"));

        public static TagKey<Item> COAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "coal_ore_vein_drop"));

        public static TagKey<Item> COPPER_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "copper_ore_vein_drop"));

        public static TagKey<Item> DESH_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "desh_ore_vein_drop"));

        public static TagKey<Item> GOLD_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aluminum_ore_vein_drop"));

        public static TagKey<Item> IRIDIUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "iridium_ore_vein_drop"));

        public static TagKey<Item> IRON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "iron_ore_vein_drop"));

        public static TagKey<Item> LAPIS_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "lapis_ore_vein_drop"));

        public static TagKey<Item> LEAD_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "lead_ore_vein_drop"));

        public static TagKey<Item> LITHIUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "lithium_ore_vein_drop"));

        public static TagKey<Item> NICKEL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nickel_ore_vein_drop"));

        public static TagKey<Item> OSMIUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "osmium_ore_vein_drop"));

        public static TagKey<Item> OSTRUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "ostrum_ore_vein_drop"));

        public static TagKey<Item> PLATINUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "platinum_ore_vein_drop"));

        public static TagKey<Item> REDSTONE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "redstone_ore_vein_drop"));

        public static TagKey<Item> SILVER_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "silver_ore_vein_drop"));

        public static TagKey<Item> STONE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "stone_vein_drop"));

        public static TagKey<Item> TIN_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "tin_ore_vein_drop"));

        public static TagKey<Item> TITANIUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "titanium_ore_vein_drop"));

        public static TagKey<Item> TUNGSTEN_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "tungsten_ore_vein_drop"));

        public static TagKey<Item> URANIUM_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "uranium_ore_vein_drop"));

        public static TagKey<Item> ZINC_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "zinc_ore_vein_drop"));

        //Randomite Ore Rarity Tiers
        public static TagKey<Item> COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "common_ore_vein_drop"));

        public static TagKey<Item> UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "uncommon_ore_vein_drop"));

        public static TagKey<Item> RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "rare_ore_vein_drop"));

        public static TagKey<Item> SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "super_rare_ore_vein_drop"));

        public static TagKey<Item> ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "ultra_rare_ore_vein_drop"));

        public static TagKey<Item> HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "hyper_rare_ore_vein_drop"));

        public static TagKey<Item> LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "legendary_ore_vein_drop"));

        public static TagKey<Item> MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mythical_ore_vein_drop"));


        public static TagKey<Item> OVERWORLD_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_common_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_uncommon_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_rare_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_super_rare_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_legendary_ore_vein_drop"));

        public static TagKey<Item> OVERWORLD_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "overworld_mythical_ore_vein_drop"));


        public static TagKey<Item> NETHER_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_common_ore_vein_drop"));

        public static TagKey<Item> NETHER_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_uncommon_ore_vein_drop"));

        public static TagKey<Item> NETHER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_rare_ore_vein_drop"));

        public static TagKey<Item> NETHER_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_super_rare_ore_vein_drop"));

        public static TagKey<Item> NETHER_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> NETHER_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> NETHER_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_legendary_ore_vein_drop"));

        public static TagKey<Item> NETHER_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "nether_mythical_ore_vein_drop"));


        public static TagKey<Item> END_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_common_ore_vein_drop"));

        public static TagKey<Item> END_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_uncommon_ore_vein_drop"));

        public static TagKey<Item> END_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_rare_ore_vein_drop"));

        public static TagKey<Item> END_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_super_rare_ore_vein_drop"));

        public static TagKey<Item> END_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> END_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> END_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_legendary_ore_vein_drop"));

        public static TagKey<Item> END_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "end_mythical_ore_vein_drop"));


        public static TagKey<Item> AETHER_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_common_ore_vein_drop"));

        public static TagKey<Item> AETHER_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_uncommon_ore_vein_drop"));

        public static TagKey<Item> AETHER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_rare_ore_vein_drop"));

        public static TagKey<Item> AETHER_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_super_rare_ore_vein_drop"));

        public static TagKey<Item> AETHER_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> AETHER_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> AETHER_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_legendary_ore_vein_drop"));

        public static TagKey<Item> AETHER_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "aether_mythical_ore_vein_drop"));


        public static TagKey<Item> MOON_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_common_ore_vein_drop"));

        public static TagKey<Item> MOON_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_uncommon_ore_vein_drop"));

        public static TagKey<Item> MOON_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_rare_ore_vein_drop"));

        public static TagKey<Item> MOON_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_super_rare_ore_vein_drop"));

        public static TagKey<Item> MOON_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> MOON_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> MOON_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_legendary_ore_vein_drop"));

        public static TagKey<Item> MOON_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "moon_mythical_ore_vein_drop"));


        public static TagKey<Item> MARS_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_common_ore_vein_drop"));

        public static TagKey<Item> MARS_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_uncommon_ore_vein_drop"));

        public static TagKey<Item> MARS_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_rare_ore_vein_drop"));

        public static TagKey<Item> MARS_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_super_rare_ore_vein_drop"));

        public static TagKey<Item> MARS_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> MARS_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> MARS_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_legendary_ore_vein_drop"));

        public static TagKey<Item> MARS_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "mars_mythical_ore_vein_drop"));


        public static TagKey<Item> VENUS_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_common_ore_vein_drop"));

        public static TagKey<Item> VENUS_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_uncommon_ore_vein_drop"));

        public static TagKey<Item> VENUS_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_rare_ore_vein_drop"));

        public static TagKey<Item> VENUS_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_super_rare_ore_vein_drop"));

        public static TagKey<Item> VENUS_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> VENUS_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> VENUS_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_legendary_ore_vein_drop"));

        public static TagKey<Item> VENUS_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "venus_mythical_ore_vein_drop"));


        public static TagKey<Item> GLACIO_COMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_common_ore_vein_drop"));

        public static TagKey<Item> GLACIO_UNCOMMON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_uncommon_ore_vein_drop"));

        public static TagKey<Item> GLACIO_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_rare_ore_vein_drop"));

        public static TagKey<Item> GLACIO_SUPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_super_rare_ore_vein_drop"));

        public static TagKey<Item> GLACIO_ULTRA_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_ultra_rare_ore_vein_drop"));

        public static TagKey<Item> GLACIO_HYPER_RARE_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_hyper_rare_ore_vein_drop"));

        public static TagKey<Item> GLACIO_LEGENDARY_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_legendary_ore_vein_drop"));

        public static TagKey<Item> GLACIO_MYTHICAL_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, new ResourceLocation(Factorocraft.MOD_ID, "glacio_mythical_ore_vein_drop"));


        //Randomite Ore Dimensional Drops
        /*public static TagKey<Item> OVERWORLD_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "overworld_ore_vein_drop"));

        public static TagKey<Item> NETHER_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "nether_ore_vein_drop"));

        public static TagKey<Item> END_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "end_ore_vein_drop"));

        public static TagKey<Item> AETHER_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "aether_ore_vein_drop"));

        public static TagKey<Item> MOON_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "moon_ore_vein_drop"));

        public static TagKey<Item> MARS_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "mars_ore_vein_drop"));

        public static TagKey<Item> VENUS_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "venus_ore_vein_drop"));

        public static TagKey<Item> GLACIO_ORE_VEIN_DROP =
                TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, "glacio_ore_vein_drop"));*/
    }
}