package net.fpr.factorocraft.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> COPPER_ORE_VEIN_PLACED = PlacementUtils.register("copper_ore_vein_placed",
            ModConfiguredFeatures.COPPER_ORE_VEIN, ModOrePlacement.commonOrePlacement(200, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(100))));
}
