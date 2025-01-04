package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.util.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_COAL_ORE_VEIN_FEATURE = registerKey("add_coal_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_COPPER_ORE_VEIN_FEATURE = registerKey("add_copper_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_IRON_ORE_VEIN_FEATURE = registerKey("add_iron_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_REDSTONE_ORE_VEIN_FEATURE = registerKey("add_redstone_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_STONE_VEIN_FEATURE = registerKey("add_stone_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE_VEIN_FEATURE = registerKey("add_tin_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE_VEIN_FEATURE = registerKey("add_uranium_ore_vein_feature");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_COAL_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COAL_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_COPPER_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COPPER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_IRON_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.IRON_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_REDSTONE_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.REDSTONE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_STONE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STONE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_TIN_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIN_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_URANIUM_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.URANIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Factorocraft.MOD_ID, name));
    }
}
