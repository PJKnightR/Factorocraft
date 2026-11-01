package net.fpr.factorocraft.worldgen.features.custom.oreveins.underground.Ores;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.config.ModConfigs;
import net.fpr.factorocraft.worldgen.features.custom.UndergroundOreVeinFeatureBuilder;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class EndRandomiteOreFeature extends UndergroundOreVeinFeatureBuilder {

    public EndRandomiteOreFeature(Codec<OreConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        if (ModConfigs.server().undergroundGeneration.generateEndRandomiteOre.get()) {
            return super.place(context);
        }
        return false;
    }
}
