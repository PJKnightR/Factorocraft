package net.fpr.factorocraft.worldgen.features.custom;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.config.ModConfigs;
import net.fpr.factorocraft.config.WorldGenConfig;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class CopperOreVeinFeature extends Feature<NoneFeatureConfiguration> {
    private static final float INCLINATION = 1.5f;
    private static final float BASE_TO_LENGTH_RATIO = 1f;
    private static final int THICK_MAX = 5;
    private static final int THICK_MIN = 2;
    private static final Block generatedBlock = ModBlocks.COPPER_ORE_VEIN.get();

    public CopperOreVeinFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {

        if (ModConfigs.server().worldGeneration.generateCopperOreVein.get()) {
            return OreVeinFeatureBuilder.place(context, generatedBlock);
        }
        return false;
    }
}
