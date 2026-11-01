package net.fpr.factorocraft.worldgen.features.custom.oreveins.underground.Ores;

import com.mojang.serialization.Codec;
import net.fpr.factorocraft.worldgen.features.custom.UndergroundOreVeinFeatureBuilder;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class VenusRandomiteOreFeature extends UndergroundOreVeinFeatureBuilder {

    public VenusRandomiteOreFeature(Codec<OreConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        /*if (ModConfigs.server().undergroundGeneration.generateVenusRandomiteOre.get()) {
            return super.place(context);
        }*/
        return false;
    }
}
