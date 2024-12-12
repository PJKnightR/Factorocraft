package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.worldgen.features.custom.TestFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES
            = DeferredRegister.create(ForgeRegistries.FEATURES, Factorocraft.MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> TEST_FEATURE
            = FEATURES.register("test_feature",
            () -> new TestFeature(NoneFeatureConfiguration.CODEC));
}
