package net.fpr.factorocraft.worldgen.features.custom.oreveins.end;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.config.ModConfigs;
import net.fpr.factorocraft.worldgen.features.custom.OreVeinFeatureBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class EndSilverOreVeinFeature extends Feature<NoneFeatureConfiguration> {
    private static final Block GENERATED_BLOCK = ModBlocks.SILVER_ORE_VEIN.get();

    public EndSilverOreVeinFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        int MAX_RADIUS = ModConfigs.server().worldGeneration.endSilverOreVeinMaxRadius.get();

        if (ModConfigs.server().worldGeneration.generateEndSilverOreVein.get()) {
            return OreVeinFeatureBuilder.place(context, GENERATED_BLOCK, MAX_RADIUS);
        }
        return false;
    }
}
