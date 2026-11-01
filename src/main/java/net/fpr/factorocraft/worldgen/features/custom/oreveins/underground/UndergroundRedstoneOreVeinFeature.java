package net.fpr.factorocraft.worldgen.features.custom.oreveins.underground;

import com.mojang.serialization.Codec;

import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.config.ModConfigs;
import net.fpr.factorocraft.worldgen.features.custom.UndergroundOreVeinFeatureBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class UndergroundRedstoneOreVeinFeature extends UndergroundOreVeinFeatureBuilder {

    public UndergroundRedstoneOreVeinFeature(Codec<OreConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        if (ModConfigs.server().undergroundGeneration.generateUndergroundRedstoneOreVein.get()) {
            return super.place(context);
        }
        return false;
    }
}
