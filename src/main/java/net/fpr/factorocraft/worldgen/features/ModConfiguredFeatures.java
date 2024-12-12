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

    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_ORE_VEIN_FEATURE = registerKey("copper_ore_vein_feature");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_ORE_VEIN_FEATURE = registerKey("iron_ore_vein_feature");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, COPPER_ORE_VEIN_FEATURE, ModFeatures.COPPER_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
        register(context, IRON_ORE_VEIN_FEATURE, ModFeatures.IRON_ORE_VEIN_FEATURE.get(), new NoneFeatureConfiguration());
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
