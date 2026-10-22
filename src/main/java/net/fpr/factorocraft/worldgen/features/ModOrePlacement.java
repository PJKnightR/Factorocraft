package net.fpr.factorocraft.worldgen.features;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange, boolean enabled) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
        /*if (enabled) {
            return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
        } else {
            return orePlacement(RarityFilter.onAverageOnceEvery(0), pHeightRange);
        }*/
    }
}
