package net.fpr.factorocraft.worldgen.features.custom.oreveins;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.config.ModConfigs;
import net.fpr.factorocraft.worldgen.features.custom.OreVeinFeatureBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class GoldOreVeinFeature extends Feature<NoneFeatureConfiguration> {
    private static final Block GENERATED_BLOCK = ModBlocks.GOLD_ORE_VEIN.get();

    public GoldOreVeinFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        int MAX_RADIUS = ModConfigs.server().worldGeneration.goldOreVeinMaxRadius.get();

        if (ModConfigs.server().worldGeneration.generateGoldOreVein.get()) {
            return OreVeinFeatureBuilder.place(context, GENERATED_BLOCK, MAX_RADIUS);
        }
        return false;
    }
}
