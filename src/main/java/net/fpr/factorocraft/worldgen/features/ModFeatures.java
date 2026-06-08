package net.fpr.factorocraft.worldgen.features;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.*;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.aether.*;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.end.EndLapisOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.end.EndLeadOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.end.EndPlatinumOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.end.EndSilverOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.glacio.GlacioIridiumOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.mars.*;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.moon.MoonAluminumOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.moon.MoonDeshOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.moon.MoonIronOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.moon.MoonTitaniumOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.nether.*;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.venus.VenusCaloriteOreVeinFeature;
import net.fpr.factorocraft.worldgen.features.custom.oreveins.venus.VenusIronOreVeinFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES
            = DeferredRegister.create(ForgeRegistries.FEATURES, Factorocraft.MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> COAL_ORE_VEIN_FEATURE
            = FEATURES.register("coal_ore_vein_feature",
            () -> new CoalOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> COPPER_ORE_VEIN_FEATURE
            = FEATURES.register("copper_ore_vein_feature",
            () -> new CopperOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> IRON_ORE_VEIN_FEATURE
            = FEATURES.register("iron_ore_vein_feature",
            () -> new IronOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> REDSTONE_ORE_VEIN_FEATURE
            = FEATURES.register("redstone_ore_vein_feature",
            () -> new RedstoneOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> STONE_VEIN_FEATURE
            = FEATURES.register("stone_vein_feature",
            () -> new StoneVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> TIN_ORE_VEIN_FEATURE
            = FEATURES.register("tin_ore_vein_feature",
            () -> new TinOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> URANIUM_ORE_VEIN_FEATURE
            = FEATURES.register("uranium_ore_vein_feature",
            () -> new UraniumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> GOLD_ORE_VEIN_FEATURE
            = FEATURES.register("gold_ore_vein_feature",
            () -> new GoldOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LAPIS_ORE_VEIN_FEATURE
            = FEATURES.register("lapis_ore_vein_feature",
            () -> new LapisOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LEAD_ORE_VEIN_FEATURE
            = FEATURES.register("lead_ore_vein_feature",
            () -> new LeadOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> LITHIUM_ORE_VEIN_FEATURE
            = FEATURES.register("lithium_ore_vein_feature",
            () -> new LithiumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NICKEL_ORE_VEIN_FEATURE
            = FEATURES.register("nickel_ore_vein_feature",
            () -> new NickelOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SILVER_ORE_VEIN_FEATURE
            = FEATURES.register("silver_ore_vein_feature",
            () -> new SilverOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> ZINC_ORE_VEIN_FEATURE
            = FEATURES.register("zinc_ore_vein_feature",
            () -> new ZincOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> ALUMINUM_ORE_VEIN_FEATURE
            = FEATURES.register("aluminum_ore_vein_feature",
            () -> new AluminumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> OSMIUM_ORE_VEIN_FEATURE
            = FEATURES.register("osmium_ore_vein_feature",
            () -> new OsmiumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> TITANIUM_ORE_VEIN_FEATURE
            = FEATURES.register("titanium_ore_vein_feature",
            () -> new TitaniumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> PLATINUM_ORE_VEIN_FEATURE
            = FEATURES.register("platinum_ore_vein_feature",
            () -> new PlatinumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> TUNGSTEN_ORE_VEIN_FEATURE
            = FEATURES.register("tungsten_ore_vein_feature",
            () -> new TungstenOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //Nether Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NETHER_GOLD_ORE_VEIN_FEATURE
            = FEATURES.register("nether_gold_ore_vein_feature",
            () -> new NetherGoldOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NETHER_SILVER_ORE_VEIN_FEATURE
            = FEATURES.register("nether_silver_ore_vein_feature",
            () -> new NetherSilverOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NETHER_OSMIUM_ORE_VEIN_FEATURE
            = FEATURES.register("nether_osmium_ore_vein_feature",
            () -> new NetherOsmiumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NETHER_PLATINUM_ORE_VEIN_FEATURE
            = FEATURES.register("nether_platinum_ore_vein_feature",
            () -> new NetherPlatinumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> NETHER_REDSTONE_ORE_VEIN_FEATURE
            = FEATURES.register("nether_redstone_ore_vein_feature",
            () -> new NetherRedstoneOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //End Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> END_LAPIS_ORE_VEIN_FEATURE
            = FEATURES.register("end_lapis_ore_vein_feature",
            () -> new EndLapisOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> END_LEAD_ORE_VEIN_FEATURE
            = FEATURES.register("end_lead_ore_vein_feature",
            () -> new EndLeadOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> END_PLATINUM_ORE_VEIN_FEATURE
            = FEATURES.register("end_platinum_ore_vein_feature",
            () -> new EndPlatinumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> END_SILVER_ORE_VEIN_FEATURE
            = FEATURES.register("end_silver_ore_vein_feature",
            () -> new EndSilverOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //Aether Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> AETHER_GOLD_ORE_VEIN_FEATURE
            = FEATURES.register("aether_gold_ore_vein_feature",
            () -> new AetherGoldOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> AETHER_SILVER_ORE_VEIN_FEATURE
            = FEATURES.register("aether_silver_ore_vein_feature",
            () -> new AetherSilverOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> AETHER_COPPER_ORE_VEIN_FEATURE
            = FEATURES.register("aether_copper_ore_vein_feature",
            () -> new AetherCopperOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> AETHER_TIN_ORE_VEIN_FEATURE
            = FEATURES.register("aether_tin_ore_vein_feature",
            () -> new AetherTinOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> AETHER_LAPIS_ORE_VEIN_FEATURE
            = FEATURES.register("aether_lapis_ore_vein_feature",
            () -> new AetherLapisOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //Moon Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MOON_DESH_ORE_VEIN_FEATURE
            = FEATURES.register("moon_desh_ore_vein_feature",
            () -> new MoonDeshOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MOON_IRON_ORE_VEIN_FEATURE
            = FEATURES.register("moon_iron_ore_vein_feature",
            () -> new MoonIronOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MOON_ALUMINUM_ORE_VEIN_FEATURE
            = FEATURES.register("moon_aluminum_ore_vein_feature",
            () -> new MoonAluminumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MOON_TITANIUM_ORE_VEIN_FEATURE
            = FEATURES.register("moon_titanium_ore_vein_feature",
            () -> new MoonTitaniumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //Mars Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_OSTRUM_ORE_VEIN_FEATURE
            = FEATURES.register("mars_ostrum_ore_vein_feature",
            () -> new MarsOstrumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_ALUMINUM_ORE_VEIN_FEATURE
            = FEATURES.register("mars_aluminum_ore_vein_feature",
            () -> new MarsAluminumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_COPPER_ORE_VEIN_FEATURE
            = FEATURES.register("mars_copper_ore_vein_feature",
            () -> new MarsCopperOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_IRON_ORE_VEIN_FEATURE
            = FEATURES.register("mars_iron_ore_vein_feature",
            () -> new MarsIronOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_REDSTONE_ORE_VEIN_FEATURE
            = FEATURES.register("mars_redstone_ore_vein_feature",
            () -> new MarsRedstoneOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_TITANIUM_ORE_VEIN_FEATURE
            = FEATURES.register("mars_titanium_ore_vein_feature",
            () -> new MarsTitaniumOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> MARS_TUNGSTEN_ORE_VEIN_FEATURE
            = FEATURES.register("mars_tungsten_ore_vein_feature",
            () -> new MarsTungstenOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //Venus Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> VENUS_CALORITE_ORE_VEIN_FEATURE
            = FEATURES.register("venus_calorite_ore_vein_feature",
            () -> new VenusCaloriteOreVeinFeature(NoneFeatureConfiguration.CODEC));

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> VENUS_IRON_ORE_VEIN_FEATURE
            = FEATURES.register("venus_iron_ore_vein_feature",
            () -> new VenusIronOreVeinFeature(NoneFeatureConfiguration.CODEC));

    //Glacio Ore Veins
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> GLACIO_IRIDIUM_ORE_VEIN_FEATURE
            = FEATURES.register("glacio_iridium_ore_vein_feature",
            () -> new GlacioIridiumOreVeinFeature(NoneFeatureConfiguration.CODEC));
}
