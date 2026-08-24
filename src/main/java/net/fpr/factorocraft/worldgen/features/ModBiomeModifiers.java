package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.util.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_COAL_ORE_VEIN_FEATURE = registerKey("add_coal_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_COPPER_ORE_VEIN_FEATURE = registerKey("add_copper_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_IRON_ORE_VEIN_FEATURE = registerKey("add_iron_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_REDSTONE_ORE_VEIN_FEATURE = registerKey("add_redstone_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_STONE_VEIN_FEATURE = registerKey("add_stone_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE_VEIN_FEATURE = registerKey("add_tin_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE_VEIN_FEATURE = registerKey("add_uranium_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_GOLD_ORE_VEIN_FEATURE = registerKey("add_gold_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_LAPIS_ORE_VEIN_FEATURE = registerKey("add_lapis_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE_VEIN_FEATURE = registerKey("add_lead_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_LITHIUM_ORE_VEIN_FEATURE = registerKey("add_lithium_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE_VEIN_FEATURE = registerKey("add_nickel_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE_VEIN_FEATURE = registerKey("add_silver_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_ZINC_ORE_VEIN_FEATURE = registerKey("add_zinc_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_ALUMINUM_ORE_VEIN_FEATURE = registerKey("add_aluminum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_OSMIUM_ORE_VEIN_FEATURE = registerKey("add_osmium_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_TITANIUM_ORE_VEIN_FEATURE = registerKey("add_titanium_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE_VEIN_FEATURE = registerKey("add_platinum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_TUNGSTEN_ORE_VEIN_FEATURE = registerKey("add_tungsten_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_GOLD_ORE_VEIN_FEATURE = registerKey("add_nether_gold_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE_VEIN_FEATURE = registerKey("add_nether_silver_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_OSMIUM_ORE_VEIN_FEATURE = registerKey("add_nether_osmium_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE_VEIN_FEATURE = registerKey("add_nether_platinum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_REDSTONE_ORE_VEIN_FEATURE = registerKey("add_nether_redstone_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_END_LAPIS_ORE_VEIN_FEATURE = registerKey("add_end_lapis_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_END_LEAD_ORE_VEIN_FEATURE = registerKey("add_end_lead_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_END_PLATINUM_ORE_VEIN_FEATURE = registerKey("add_end_platinum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_END_SILVER_ORE_VEIN_FEATURE = registerKey("add_end_silver_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_AETHER_GOLD_ORE_VEIN_FEATURE = registerKey("add_aether_gold_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_AETHER_SILVER_ORE_VEIN_FEATURE = registerKey("add_aether_silver_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_AETHER_COPPER_ORE_VEIN_FEATURE = registerKey("add_aether_copper_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_AETHER_TIN_ORE_VEIN_FEATURE = registerKey("add_aether_tin_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_AETHER_LAPIS_ORE_VEIN_FEATURE = registerKey("add_aether_lapis_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_MOON_DESH_ORE_VEIN_FEATURE = registerKey("add_moon_desh_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MOON_IRON_ORE_VEIN_FEATURE = registerKey("add_moon_iron_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MOON_ALUMINUM_ORE_VEIN_FEATURE = registerKey("add_moon_aluminum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MOON_TITANIUM_ORE_VEIN_FEATURE = registerKey("add_moon_titanium_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_MARS_OSTRUM_ORE_VEIN_FEATURE = registerKey("add_mars_ostrum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_ALUMINUM_ORE_VEIN_FEATURE = registerKey("add_mars_aluminum_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_COPPER_ORE_VEIN_FEATURE = registerKey("add_mars_copper_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_IRON_ORE_VEIN_FEATURE = registerKey("add_mars_iron_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_REDSTONE_ORE_VEIN_FEATURE = registerKey("add_mars_redstone_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_TITANIUM_ORE_VEIN_FEATURE = registerKey("add_mars_titanium_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_TUNGSTEN_ORE_VEIN_FEATURE = registerKey("add_mars_tungsten_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_VENUS_CALORITE_ORE_VEIN_FEATURE = registerKey("add_venus_calorite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_VENUS_IRON_ORE_VEIN_FEATURE = registerKey("add_venus_iron_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_GLACIO_IRIDIUM_ORE_VEIN_FEATURE = registerKey("add_glacio_iridium_ore_vein_feature");

    public static final ResourceKey<BiomeModifier> ADD_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_nether_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_END_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_end_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_AETHER_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_aether_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MOON_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_moon_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_MARS_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_mars_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_VENUS_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_venus_randomite_ore_vein_feature");
    public static final ResourceKey<BiomeModifier> ADD_GLACIO_RANDOMITE_ORE_VEIN_FEATURE = registerKey("add_glacio_randomite_ore_vein_feature");

    /*public static final ResourceKey<BiomeModifier> ADD_RANDOMITE_ORE = registerKey("add_randomite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RANDOMITE_ORE = registerKey("add_nether_randomite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_RANDOMITE_ORE = registerKey("add_end_randomite_ore");*/
    /*public static final ResourceKey<BiomeModifier> ADD_AETHER_RANDOMITE_ORE = registerKey("add_aether_randomite_ore");
    public static final ResourceKey<BiomeModifier> ADD_MOON_RANDOMITE_ORE = registerKey("add_moon_randomite_ore");
    public static final ResourceKey<BiomeModifier> ADD_MARS_RANDOMITE_ORE = registerKey("add_mars_randomite_ore");
    public static final ResourceKey<BiomeModifier> ADD_VENUS_RANDOMITE_ORE = registerKey("add_venus_randomite_ore");
    public static final ResourceKey<BiomeModifier> ADD_GLACIO_RANDOMITE_ORE = registerKey("add_glacio_randomite_ore");*/

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_COAL_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COAL_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_COPPER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.COPPER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_IRON_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.IRON_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_REDSTONE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.REDSTONE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_STONE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STONE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_TIN_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIN_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_URANIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.URANIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_GOLD_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GOLD_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_LAPIS_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LAPIS_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_LEAD_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LEAD_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_LITHIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LITHIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_NICKEL_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NICKEL_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_SILVER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SILVER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_ZINC_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ZINC_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_ALUMINUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ALUMINUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_OSMIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OSMIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_TITANIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TITANIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_PLATINUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLATINUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_TUNGSTEN_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TUNGSTEN_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //Nether Ore Veins
        context.register(ADD_NETHER_GOLD_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.NETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_GOLD_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_NETHER_SILVER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.NETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SILVER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_NETHER_OSMIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.NETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_OSMIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_NETHER_PLATINUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.NETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_PLATINUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_NETHER_REDSTONE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.NETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_REDSTONE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //End Ore Veins
        context.register(ADD_END_LAPIS_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.END_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_LAPIS_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_END_LEAD_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.END_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_LEAD_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_END_PLATINUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.END_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_PLATINUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_END_SILVER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.END_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SILVER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //Aether Ore Veins
        context.register(ADD_AETHER_GOLD_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_GOLD_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_AETHER_SILVER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_SILVER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_AETHER_COPPER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_COPPER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_AETHER_TIN_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_TIN_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_AETHER_LAPIS_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_LAPIS_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //Moon Ore Veins
        context.register(ADD_MOON_DESH_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MOON_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOON_DESH_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MOON_IRON_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MOON_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOON_IRON_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MOON_ALUMINUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MOON_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOON_ALUMINUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MOON_TITANIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MOON_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOON_TITANIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //Mars Ore Veins
        context.register(ADD_MARS_OSTRUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_OSTRUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_ALUMINUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_ALUMINUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_COPPER_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_COPPER_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_IRON_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_IRON_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_REDSTONE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_REDSTONE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_TITANIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_TITANIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_TUNGSTEN_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_TUNGSTEN_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //Venus Ore Veins
        context.register(ADD_VENUS_CALORITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.VENUS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENUS_CALORITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_VENUS_IRON_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.VENUS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENUS_IRON_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        //Glacio Ore Veins
        context.register(ADD_GLACIO_IRIDIUM_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.GLACIO_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLACIO_IRIDIUM_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));


        //Randomite Ore Veins
        context.register(ADD_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_NETHER_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.NETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_END_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.END_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_AETHER_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MOON_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MOON_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOON_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_MARS_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_VENUS_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.VENUS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENUS_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));

        context.register(ADD_GLACIO_RANDOMITE_ORE_VEIN_FEATURE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.GLACIO_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLACIO_RANDOMITE_ORE_VEIN_FEATURE_KEY)),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION));


        //Randomite Ores
        /*context.register(ADD_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.GLACIO_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RANDOMITE_ORE_FEATURE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_RANDOMITE_ORE_FEATURE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_RANDOMITE_ORE_FEATURE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));*/

        /*context.register(ADD_AETHER_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.AETHER_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AETHER_RANDOMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MOON_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MOON_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOON_RANDOMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MARS_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.MARS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARS_RANDOMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_VENUS_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.VENUS_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENUS_RANDOMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_GLACIO_RANDOMITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.GLACIO_IS_ORE_VEIN_SPAWNABLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLACIO_RANDOMITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));*/

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Factorocraft.MOD_ID, name));
    }
}
