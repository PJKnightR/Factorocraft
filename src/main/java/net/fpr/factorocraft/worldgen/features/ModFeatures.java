package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.worldgen.features.custom.*;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES
            = DeferredRegister.create(ForgeRegistries.FEATURES, Factorocraft.MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> COAL_ORE_VEIN_FEATURE
            = FEATURES.register("coal_ore_vein_feature",
            () -> new CoalOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> COPPER_ORE_VEIN_FEATURE
            = FEATURES.register("copper_ore_vein_feature",
            () -> new CopperOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> IRON_ORE_VEIN_FEATURE
            = FEATURES.register("iron_ore_vein_feature",
            () -> new IronOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> REDSTONE_ORE_VEIN_FEATURE
            = FEATURES.register("redstone_ore_vein_feature",
            () -> new RedstoneOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> STONE_VEIN_FEATURE
            = FEATURES.register("stone_vein_feature",
            () -> new StoneVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> TIN_ORE_VEIN_FEATURE
            = FEATURES.register("tin_ore_vein_feature",
            () -> new TinOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> URANIUM_ORE_VEIN_FEATURE
            = FEATURES.register("uranium_ore_vein_feature",
            () -> new UraniumOreVeinFeature(NoneFeatureConfiguration.CODEC));
}
