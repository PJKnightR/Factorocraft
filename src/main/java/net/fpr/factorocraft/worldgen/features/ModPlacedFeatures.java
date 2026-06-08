package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.config.ModConfigs;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.NetherFeatures;
import net.minecraft.data.worldgen.placement.NetherPlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> COAL_ORE_VEIN_FEATURE_KEY = registerKey("coal_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> COPPER_ORE_VEIN_FEATURE_KEY = registerKey("copper_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> IRON_ORE_VEIN_FEATURE_KEY = registerKey("iron_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> REDSTONE_ORE_VEIN_FEATURE_KEY = registerKey("redstone_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> STONE_VEIN_FEATURE_KEY = registerKey("stone_vein_feature");
    public static final ResourceKey<PlacedFeature> TIN_ORE_VEIN_FEATURE_KEY = registerKey("tin_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_VEIN_FEATURE_KEY = registerKey("uranium_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> GOLD_ORE_VEIN_FEATURE_KEY = registerKey("gold_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> LAPIS_ORE_VEIN_FEATURE_KEY = registerKey("lapis_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_VEIN_FEATURE_KEY = registerKey("lead_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> LITHIUM_ORE_VEIN_FEATURE_KEY = registerKey("lithium_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_VEIN_FEATURE_KEY = registerKey("nickel_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_VEIN_FEATURE_KEY = registerKey("silver_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> ZINC_ORE_VEIN_FEATURE_KEY = registerKey("zinc_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_VEIN_FEATURE_KEY = registerKey("aluminum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> OSMIUM_ORE_VEIN_FEATURE_KEY = registerKey("osmium_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_VEIN_FEATURE_KEY = registerKey("titanium_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_VEIN_FEATURE_KEY = registerKey("platinum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_VEIN_FEATURE_KEY = registerKey("tungsten_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> NETHER_GOLD_ORE_VEIN_FEATURE_KEY = registerKey("nether_gold_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_ORE_VEIN_FEATURE_KEY = registerKey("nether_silver_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> NETHER_OSMIUM_ORE_VEIN_FEATURE_KEY = registerKey("nether_osmium_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> NETHER_PLATINUM_ORE_VEIN_FEATURE_KEY = registerKey("nether_platinum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> NETHER_REDSTONE_ORE_VEIN_FEATURE_KEY = registerKey("nether_redstone_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> END_LAPIS_ORE_VEIN_FEATURE_KEY = registerKey("end_lapis_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> END_LEAD_ORE_VEIN_FEATURE_KEY = registerKey("end_lead_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> END_PLATINUM_ORE_VEIN_FEATURE_KEY = registerKey("end_platinum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> END_SILVER_ORE_VEIN_FEATURE_KEY = registerKey("end_silver_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> AETHER_GOLD_ORE_VEIN_FEATURE_KEY = registerKey("aether_gold_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> AETHER_SILVER_ORE_VEIN_FEATURE_KEY = registerKey("aether_silver_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> AETHER_COPPER_ORE_VEIN_FEATURE_KEY = registerKey("aether_copper_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> AETHER_TIN_ORE_VEIN_FEATURE_KEY = registerKey("aether_tin_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> AETHER_LAPIS_ORE_VEIN_FEATURE_KEY = registerKey("aether_lapis_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> MOON_DESH_ORE_VEIN_FEATURE_KEY = registerKey("moon_desh_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MOON_IRON_ORE_VEIN_FEATURE_KEY = registerKey("moon_iron_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MOON_ALUMINUM_ORE_VEIN_FEATURE_KEY = registerKey("moon_aluminum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MOON_TITANIUM_ORE_VEIN_FEATURE_KEY = registerKey("moon_titanium_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> MARS_OSTRUM_ORE_VEIN_FEATURE_KEY = registerKey("mars_ostrum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MARS_ALUMINUM_ORE_VEIN_FEATURE_KEY = registerKey("mars_aluminum_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MARS_COPPER_ORE_VEIN_FEATURE_KEY = registerKey("mars_copper_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MARS_IRON_ORE_VEIN_FEATURE_KEY = registerKey("mars_iron_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MARS_REDSTONE_ORE_VEIN_FEATURE_KEY = registerKey("mars_redstone_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MARS_TITANIUM_ORE_VEIN_FEATURE_KEY = registerKey("mars_titanium_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> MARS_TUNGSTEN_ORE_VEIN_FEATURE_KEY = registerKey("mars_tungsten_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> VENUS_CALORITE_ORE_VEIN_FEATURE_KEY = registerKey("venus_calorite_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> VENUS_IRON_ORE_VEIN_FEATURE_KEY = registerKey("venus_iron_ore_vein_feature");

    public static final ResourceKey<PlacedFeature> GLACIO_IRIDIUM_ORE_VEIN_FEATURE_KEY = registerKey("glacio_iridium_ore_vein_feature");

    public static final int COAL_ORE_VEIN_CHANCE = 128;
    public static final int COPPER_ORE_VEIN_CHANCE = 128;
    public static final int IRON_ORE_VEIN_CHANCE = 128;
    public static final int RESTONE_ORE_VEIN_CHANCE = 148;
    public static final int STONE_VEIN_CHANCE = 128;
    public static final int TIN_ORE_VEIN_CHANCE = 128;
    public static final int URANIUM_ORE_VEIN_CHANCE = 152;
    public static final int GOLD_ORE_VEIN_CHANCE = 148;
    public static final int LAPIS_ORE_VEIN_CHANCE = 128;
    public static final int LEAD_ORE_VEIN_CHANCE = 128;
    public static final int LITHIUM_ORE_VEIN_CHANCE = 150;
    public static final int NICKEL_ORE_VEIN_CHANCE = 150;
    public static final int SILVER_ORE_VEIN_CHANCE = 146;
    public static final int ZINC_ORE_VEIN_CHANCE = 128;
    public static final int ALUMINUM_ORE_VEIN_CHANCE = 128;
    public static final int OSMIUM_ORE_VEIN_CHANCE = 148;
    public static final int TITANIUM_ORE_VEIN_CHANCE = 600;
    public static final int PLATINUM_ORE_VEIN_CHANCE = 600;
    public static final int TUNGSTEN_ORE_VEIN_CHANCE = 600;

    public static final int NETHER_GOLD_ORE_VEIN_CHANCE = 15;
    public static final int NETHER_SILVER_ORE_VEIN_CHANCE = 20;
    public static final int NETHER_OSMIUM_ORE_VEIN_CHANCE = 35;
    public static final int NETHER_PLATINUM_ORE_VEIN_CHANCE = 60;
    public static final int NETHER_REDSTONE_ORE_VEIN_CHANCE = 25;

    public static final int END_LAPIS_ORE_VEIN_CHANCE = 300;
    public static final int END_LEAD_ORE_VEIN_CHANCE = 300;
    public static final int END_PLATINUM_ORE_VEIN_CHANCE = 500;
    public static final int END_SILVER_ORE_VEIN_CHANCE = 300;

    public static final int AETHER_GOLD_ORE_VEIN_CHANCE = 300;
    public static final int AETHER_SILVER_ORE_VEIN_CHANCE = 300;
    public static final int AETHER_COPPER_ORE_VEIN_CHANCE = 300;
    public static final int AETHER_TIN_ORE_VEIN_CHANCE = 300;
    public static final int AETHER_LAPIS_ORE_VEIN_CHANCE = 300;

    public static final int MOON_DESH_ORE_VEIN_CHANCE = 350;
    public static final int MOON_IRON_ORE_VEIN_CHANCE = 300;
    public static final int MOON_ALUMINUM_ORE_VEIN_CHANCE = 300;
    public static final int MOON_TITANIUM_ORE_VEIN_CHANCE = 500;

    public static final int MARS_OSTRUM_ORE_VEIN_CHANCE = 400;
    public static final int MARS_ALUMINUM_ORE_VEIN_CHANCE = 300;
    public static final int MARS_COPPER_ORE_VEIN_CHANCE = 300;
    public static final int MARS_IRON_ORE_VEIN_CHANCE = 300;
    public static final int MARS_REDSTONE_ORE_VEIN_CHANCE = 300;
    public static final int MARS_TITANIUM_ORE_VEIN_CHANCE = 500;
    public static final int MARS_TUNGSTEN_ORE_VEIN_CHANCE = 400;

    public static final int VENUS_CALORITE_ORE_VEIN_CHANCE = 500;
    public static final int VENUS_IRON_ORE_VEIN_CHANCE = 300;

    public static final int GLACIO_IRIDIUM_ORE_VEIN_CHANCE = 600;

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, COAL_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.COAL_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(COAL_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, COPPER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.COPPER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(COPPER_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, IRON_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.IRON_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(IRON_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, REDSTONE_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.REDSTONE_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(RESTONE_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, STONE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.STONE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(STONE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, TIN_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.TIN_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(TIN_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, URANIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.URANIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(URANIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, GOLD_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.GOLD_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(GOLD_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, LAPIS_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.LAPIS_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(LAPIS_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, LEAD_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.LEAD_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(LEAD_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, LITHIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.LITHIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(LITHIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, NICKEL_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.NICKEL_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(NICKEL_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, SILVER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.SILVER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(SILVER_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, ZINC_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.ZINC_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(ZINC_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, ALUMINUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(ALUMINUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, OSMIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.OSMIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(OSMIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, TITANIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(TITANIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, PLATINUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(PLATINUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, TUNGSTEN_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(TUNGSTEN_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        //Nether Ore Veins
        register(context, NETHER_GOLD_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.NETHER_GOLD_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(NETHER_GOLD_ORE_VEIN_CHANCE),
                        PlacementUtils.FULL_RANGE,
                        BiomeFilter.biome()
                ));

        register(context, NETHER_SILVER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.NETHER_SILVER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(NETHER_SILVER_ORE_VEIN_CHANCE),
                        PlacementUtils.FULL_RANGE,
                        BiomeFilter.biome()
                ));

        register(context, NETHER_OSMIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.NETHER_OSMIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(NETHER_OSMIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.FULL_RANGE,
                        BiomeFilter.biome()
                ));

        register(context, NETHER_PLATINUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.NETHER_PLATINUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(NETHER_PLATINUM_ORE_VEIN_CHANCE),
                        PlacementUtils.FULL_RANGE,
                        BiomeFilter.biome()
                ));

        register(context, NETHER_REDSTONE_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.NETHER_REDSTONE_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(NETHER_REDSTONE_ORE_VEIN_CHANCE),
                        PlacementUtils.FULL_RANGE,
                        BiomeFilter.biome()
                ));

        //End Ore Veins
        //Note: For End Dimensions, can be the same as overworld type dimensions
        register(context, END_LAPIS_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.END_LAPIS_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(END_LAPIS_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, END_LEAD_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.END_LEAD_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(END_LEAD_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, END_PLATINUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.END_PLATINUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(END_PLATINUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, END_SILVER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.END_SILVER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(END_SILVER_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        //Aether Ore Veins
        register(context, AETHER_GOLD_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.AETHER_GOLD_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(AETHER_GOLD_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, AETHER_SILVER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.AETHER_SILVER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(AETHER_SILVER_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, AETHER_COPPER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.AETHER_COPPER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(AETHER_COPPER_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, AETHER_TIN_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.AETHER_TIN_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(AETHER_TIN_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, AETHER_LAPIS_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.AETHER_LAPIS_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(AETHER_LAPIS_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        //Moon Ore Veins
        register(context, MOON_DESH_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MOON_DESH_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MOON_DESH_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MOON_IRON_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MOON_IRON_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MOON_IRON_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MOON_ALUMINUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MOON_ALUMINUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MOON_ALUMINUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MOON_TITANIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MOON_TITANIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MOON_TITANIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        //Mars Ore Veins
        register(context, MARS_OSTRUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_OSTRUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_OSTRUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MARS_ALUMINUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_ALUMINUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_ALUMINUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MARS_COPPER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_COPPER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_COPPER_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MARS_IRON_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_IRON_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_IRON_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MARS_REDSTONE_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_REDSTONE_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_REDSTONE_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MARS_TITANIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_TITANIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_TITANIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, MARS_TUNGSTEN_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.MARS_TUNGSTEN_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(MARS_TUNGSTEN_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        //Venus Ore Veins
        register(context, VENUS_CALORITE_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.VENUS_CALORITE_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(VENUS_CALORITE_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, VENUS_IRON_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.VENUS_IRON_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(VENUS_IRON_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        //Glacio Ore Veins
        register(context, GLACIO_IRIDIUM_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.GLACIO_IRIDIUM_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(GLACIO_IRIDIUM_ORE_VEIN_CHANCE),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Factorocraft.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    /*private static List<PlacementModifier> onCaveWallUp(int minPerChunk, int maxPerChunk){
        return List.of(
                CountPlacement.of(UniformInt.of(minPerChunk, maxPerChunk)),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)),
                EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(),
                        BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                BlockPredicateFilter.forPredicate(BlockPredicate.not(
                        BlockPredicate.matchesTag(ModTags.Blocks.CRISTAL_BLOCK))),
                BiomeFilter.biome()
        );
    }

    private static List<PlacementModifier> onCaveWallDown(int minPerChunk, int maxPerChunk){
        return List.of(
                CountPlacement.of(UniformInt.of(minPerChunk, maxPerChunk)),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)),
                EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(),
                        BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                BlockPredicateFilter.forPredicate(BlockPredicate.not(
                        BlockPredicate.matchesTag(ModTags.Blocks.CRISTAL_BLOCK))),
                BiomeFilter.biome()
        );
    }*/


}
