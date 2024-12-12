package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> COPPER_ORE_VEIN_FEATURE_KEY = registerKey("copper_ore_vein_feature");
    public static final ResourceKey<PlacedFeature> IRON_ORE_VEIN_FEATURE_KEY = registerKey("iron_ore_vein_feature");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, COPPER_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.COPPER_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(15),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));

        register(context, IRON_ORE_VEIN_FEATURE_KEY,
                context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModConfiguredFeatures.IRON_ORE_VEIN_FEATURE),
                List.of(
                        CountPlacement.of(UniformInt.of(0, 1)),
                        RarityFilter.onAverageOnceEvery(15),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome()
                ));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Factorocraft.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    /*private static List<PlacementModifier> onCaveWallUp(int minPerChunk, int maxPerChunk){
        return List.of(
                CountPlacement.of(UniformInt.of(minPerChunk, maxPerChunk)),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)),
                EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.solid(),
                        BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                BlockPredicateFilter.forPredicate(BlockPredicate.not(
                        BlockPredicate.matchesTag(ModTags.Blocks.CRISTAL_BLOCK))),
                BiomeFilter.biome()
        );
    }

    private static List<PlacementModifier> onCaveWallDown(int minPerChunk, int maxPerChunk){
        return List.of(
                CountPlacement.of(UniformInt.of(minPerChunk, maxPerChunk)),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)),
                EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(),
                        BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                BlockPredicateFilter.forPredicate(BlockPredicate.not(
                        BlockPredicate.matchesTag(ModTags.Blocks.CRISTAL_BLOCK))),
                BiomeFilter.biome()
        );
    }*/


}
