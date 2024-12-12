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
    public static final ResourceKey<BiomeModifier> ADD_COPPER_ORE_VEIN_FEATURE = registerKey("add_copper_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_IRON_ORE_VEIN_FEATURE = registerKey("add_iron_ore_vein_feature");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_COPPER_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COPPER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_IRON_ORE_VEIN_FEATURE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.IRON_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Factorocraft.MOD_ID, name));
    }
}
