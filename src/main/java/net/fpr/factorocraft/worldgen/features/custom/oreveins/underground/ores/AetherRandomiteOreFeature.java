package net.fpr.factorocraft.worldgen.features.custom.oreveins.underground.ores;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.worldgen.features.custom.UndergroundOreVeinFeatureBuilder;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class AetherRandomiteOreFeature extends UndergroundOreVeinFeatureBuilder {

    public AetherRandomiteOreFeature(Codec<OreConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        /*if (ModConfigs.server().undergroundGeneration.generateAetherRandomiteOre.get()) {
            return super.place(context);
        }*/
        return false;
    }
}
