package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.config.ModConfigs;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> COAL_ORE_VEIN_FEATURE = registerKey("coal_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_ORE_VEIN_FEATURE = registerKey("copper_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_ORE_VEIN_FEATURE = registerKey("iron_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_ORE_VEIN_FEATURE = registerKey("redstone_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_VEIN_FEATURE = registerKey("stone_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_VEIN_FEATURE = registerKey("tin_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE_VEIN_FEATURE = registerKey("uranium_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_ORE_VEIN_FEATURE = registerKey("gold_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_ORE_VEIN_FEATURE = registerKey("lapis_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_VEIN_FEATURE = registerKey("lead_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LITHIUM_ORE_VEIN_FEATURE = registerKey("lithium_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE_VEIN_FEATURE = registerKey("nickel_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_VEIN_FEATURE = registerKey("silver_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE_VEIN_FEATURE = registerKey("zinc_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_VEIN_FEATURE = registerKey("aluminum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OSMIUM_ORE_VEIN_FEATURE = registerKey("osmium_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_VEIN_FEATURE = registerKey("titanium_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_VEIN_FEATURE = registerKey("platinum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_VEIN_FEATURE = registerKey("tungsten_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GOLD_ORE_VEIN_FEATURE = registerKey("nether_gold_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_VEIN_FEATURE = registerKey("nether_silver_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_OSMIUM_ORE_VEIN_FEATURE = registerKey("nether_osmium_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_VEIN_FEATURE = registerKey("nether_platinum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_VEIN_FEATURE = registerKey("nether_redstone_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LAPIS_ORE_VEIN_FEATURE = registerKey("end_lapis_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LEAD_ORE_VEIN_FEATURE = registerKey("end_lead_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_VEIN_FEATURE = registerKey("end_platinum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_VEIN_FEATURE = registerKey("end_silver_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_GOLD_ORE_VEIN_FEATURE = registerKey("aether_gold_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_SILVER_ORE_VEIN_FEATURE = registerKey("aether_silver_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_COPPER_ORE_VEIN_FEATURE = registerKey("aether_copper_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_TIN_ORE_VEIN_FEATURE = registerKey("aether_tin_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_LAPIS_ORE_VEIN_FEATURE = registerKey("aether_lapis_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_DESH_ORE_VEIN_FEATURE = registerKey("moon_desh_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_IRON_ORE_VEIN_FEATURE = registerKey("moon_iron_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_ALUMINUM_ORE_VEIN_FEATURE = registerKey("moon_aluminum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_TITANIUM_ORE_VEIN_FEATURE = registerKey("moon_titanium_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_OSTRUM_ORE_VEIN_FEATURE = registerKey("mars_ostrum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_ALUMINUM_ORE_VEIN_FEATURE = registerKey("mars_aluminum_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_COPPER_ORE_VEIN_FEATURE = registerKey("mars_copper_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_IRON_ORE_VEIN_FEATURE = registerKey("mars_iron_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_REDSTONE_ORE_VEIN_FEATURE = registerKey("mars_redstone_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_TITANIUM_ORE_VEIN_FEATURE = registerKey("mars_titanium_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_TUNGSTEN_ORE_VEIN_FEATURE = registerKey("mars_tungsten_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> VENUS_CALORITE_ORE_VEIN_FEATURE = registerKey("venus_calorite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VENUS_IRON_ORE_VEIN_FEATURE = registerKey("venus_iron_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> GLACIO_IRIDIUM_ORE_VEIN_FEATURE = registerKey("venus_iridium_ore_vein_feature");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RANDOMITE_ORE_VEIN_FEATURE = registerKey("randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RANDOMITE_ORE_VEIN_FEATURE = registerKey("nether_randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RANDOMITE_ORE_VEIN_FEATURE = registerKey("end_randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_RANDOMITE_ORE_VEIN_FEATURE = registerKey("aether_randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_RANDOMITE_ORE_VEIN_FEATURE = registerKey("moon_randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_RANDOMITE_ORE_VEIN_FEATURE = registerKey("mars_randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VENUS_RANDOMITE_ORE_VEIN_FEATURE = registerKey("venus_randomite_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLACIO_RANDOMITE_ORE_VEIN_FEATURE = registerKey("glacio_randomite_ore_vein_feature");

    /*public static final ResourceKey<ConfiguredFeature<?, ?>> RANDOMITE_ORE_FEATURE = registerKey("randomite_ore_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RANDOMITE_ORE_FEATURE = registerKey("nether_randomite_ore_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RANDOMITE_ORE_FEATURE = registerKey("end_randomite_ore_feature");*/
    /*public static final ResourceKey<ConfiguredFeature<?, ?>> AETHER_RANDOMITE_ORE_FEATURE = registerKey("aether_randomite_ore_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOON_RANDOMITE_ORE_FEATURE = registerKey("moon_randomite_ore_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARS_RANDOMITE_ORE_FEATURE = registerKey("mars_randomite_ore_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VENUS_RANDOMITE_ORE_FEATURE = registerKey("venus_randomite_ore_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLACIO_RANDOMITE_ORE_FEATURE = registerKey("glacio_randomite_ore_feature");*/

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, COAL_ORE_VEIN_FEATURE, ModFeatures.COAL_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, COPPER_ORE_VEIN_FEATURE, ModFeatures.COPPER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, IRON_ORE_VEIN_FEATURE, ModFeatures.IRON_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, REDSTONE_ORE_VEIN_FEATURE, ModFeatures.REDSTONE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, STONE_VEIN_FEATURE, ModFeatures.STONE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, TIN_ORE_VEIN_FEATURE, ModFeatures.TIN_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, URANIUM_ORE_VEIN_FEATURE, ModFeatures.URANIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, GOLD_ORE_VEIN_FEATURE, ModFeatures.GOLD_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, LAPIS_ORE_VEIN_FEATURE, ModFeatures.LAPIS_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, LEAD_ORE_VEIN_FEATURE, ModFeatures.LEAD_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, LITHIUM_ORE_VEIN_FEATURE, ModFeatures.LITHIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, NICKEL_ORE_VEIN_FEATURE, ModFeatures.NICKEL_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, SILVER_ORE_VEIN_FEATURE, ModFeatures.SILVER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, ZINC_ORE_VEIN_FEATURE, ModFeatures.ZINC_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, ALUMINUM_ORE_VEIN_FEATURE, ModFeatures.ALUMINUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, OSMIUM_ORE_VEIN_FEATURE, ModFeatures.OSMIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, TITANIUM_ORE_VEIN_FEATURE, ModFeatures.TITANIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, PLATINUM_ORE_VEIN_FEATURE, ModFeatures.PLATINUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, TUNGSTEN_ORE_VEIN_FEATURE, ModFeatures.TUNGSTEN_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, NETHER_GOLD_ORE_VEIN_FEATURE, ModFeatures.NETHER_GOLD_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, NETHER_SILVER_ORE_VEIN_FEATURE, ModFeatures.NETHER_SILVER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, NETHER_OSMIUM_ORE_VEIN_FEATURE, ModFeatures.NETHER_OSMIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, NETHER_PLATINUM_ORE_VEIN_FEATURE, ModFeatures.NETHER_PLATINUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, NETHER_REDSTONE_ORE_VEIN_FEATURE, ModFeatures.NETHER_REDSTONE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, END_LAPIS_ORE_VEIN_FEATURE, ModFeatures.END_LAPIS_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, END_LEAD_ORE_VEIN_FEATURE, ModFeatures.END_LEAD_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, END_PLATINUM_ORE_VEIN_FEATURE, ModFeatures.END_PLATINUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, END_SILVER_ORE_VEIN_FEATURE, ModFeatures.END_SILVER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, AETHER_GOLD_ORE_VEIN_FEATURE, ModFeatures.AETHER_GOLD_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, AETHER_SILVER_ORE_VEIN_FEATURE, ModFeatures.AETHER_SILVER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, AETHER_COPPER_ORE_VEIN_FEATURE, ModFeatures.AETHER_COPPER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, AETHER_TIN_ORE_VEIN_FEATURE, ModFeatures.AETHER_TIN_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, AETHER_LAPIS_ORE_VEIN_FEATURE, ModFeatures.AETHER_LAPIS_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, MOON_DESH_ORE_VEIN_FEATURE, ModFeatures.MOON_DESH_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MOON_IRON_ORE_VEIN_FEATURE, ModFeatures.MOON_IRON_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MOON_ALUMINUM_ORE_VEIN_FEATURE, ModFeatures.MOON_ALUMINUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MOON_TITANIUM_ORE_VEIN_FEATURE, ModFeatures.MOON_TITANIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, MARS_OSTRUM_ORE_VEIN_FEATURE, ModFeatures.MARS_OSTRUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_ALUMINUM_ORE_VEIN_FEATURE, ModFeatures.MARS_ALUMINUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_COPPER_ORE_VEIN_FEATURE, ModFeatures.MARS_COPPER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_IRON_ORE_VEIN_FEATURE, ModFeatures.MARS_IRON_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_REDSTONE_ORE_VEIN_FEATURE, ModFeatures.MARS_REDSTONE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_TITANIUM_ORE_VEIN_FEATURE, ModFeatures.MARS_TITANIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_TUNGSTEN_ORE_VEIN_FEATURE, ModFeatures.MARS_TUNGSTEN_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, VENUS_CALORITE_ORE_VEIN_FEATURE, ModFeatures.VENUS_CALORITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, VENUS_IRON_ORE_VEIN_FEATURE, ModFeatures.VENUS_IRON_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, GLACIO_IRIDIUM_ORE_VEIN_FEATURE, ModFeatures.GLACIO_IRIDIUM_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        register(context, RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, NETHER_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.NETHER_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, END_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.END_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, AETHER_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.AETHER_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MOON_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.MOON_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, MARS_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.MARS_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, VENUS_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.VENUS_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, GLACIO_RANDOMITE_ORE_VEIN_FEATURE, ModFeatures.GLACIO_RANDOMITE_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());

        /*RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldRandomiteOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RANDOMITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RANDOMITE_ORE.get().defaultBlockState()));

        register(context, RANDOMITE_ORE_FEATURE, Feature.ORE, new OreConfiguration(overworldRandomiteOres, 8));
        register(context, NETHER_RANDOMITE_ORE_FEATURE, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_RANDOMITE_ORE.get().defaultBlockState(), 8));
        register(context, END_RANDOMITE_ORE_FEATURE, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_RANDOMITE_ORE.get().defaultBlockState(), 8));*/

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Factorocraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
