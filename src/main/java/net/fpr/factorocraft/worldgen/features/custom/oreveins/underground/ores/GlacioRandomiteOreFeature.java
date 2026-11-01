package net.fpr.factorocraft.worldgen.features.custom.oreveins.underground.ores;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.config.ModConfigs;
import net.fpr.factorocraft.worldgen.features.custom.UndergroundOreVeinFeatureBuilder;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class GlacioRandomiteOreFeature extends UndergroundOreVeinFeatureBuilder {

    public GlacioRandomiteOreFeature(Codec<OreConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        /*if (ModConfigs.server().undergroundGeneration.generateGlacioRandomiteOre.get()) {
            return super.place(context);
        }*/
        return false;
    }
}
