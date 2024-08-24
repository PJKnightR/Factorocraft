package net.fpr.factorocraft.world.feature;

import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.util.ModTags;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    //public static final RuleTest GRASS_REPLACEABLES = new TagMatchTest(ModTags.Blocks.GRASS);
    public static final RuleTest GRASS_REPLACEABLES = new TagMatchTest(BlockTags.DIRT);


    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COPPER_ORE_VEIN = List.of(
            OreConfiguration.target(GRASS_REPLACEABLES, ModBlocks.COPPER_ORE_VEIN.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COPPER_ORE_VEIN = FeatureUtils.register("copper_ore_vein",
            Feature.ORE, new OreConfiguration(OVERWORLD_COPPER_ORE_VEIN, 9));
}
