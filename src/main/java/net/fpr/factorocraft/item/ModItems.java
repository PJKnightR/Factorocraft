package net.fpr.factorocraft.item;

//import net.fpr.factorocraft.fluid.ModFluids;
//import net.fpr.factorocraft.experimental.Battery;
//import net.fpr.factorocraft.experimental.*;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Factorocraft.MOD_ID);

    public static final RegistryObject<Item> AUTOMATION_SCIENCE_PACK = ITEMS.register("science_pack_automation",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LOGISTIC_SCIENCE_PACK = ITEMS.register("science_pack_logistic",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHEMICAL_SCIENCE_PACK = ITEMS.register("science_pack_chemical",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MILITARY_SCIENCE_PACK = ITEMS.register("science_pack_military",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRODUCTION_SCIENCE_PACK = ITEMS.register("science_pack_production",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UTILITY_SCIENCE_PACK = ITEMS.register("science_pack_utility",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPACE_SCIENCE_PACK = ITEMS.register("science_pack_space",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BASIC_CIRCUIT = ITEMS.register("basic_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELITE_CIRCUIT = ITEMS.register("elite_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ULTIMATE_CIRCUIT = ITEMS.register("ultimate_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STONE_CHUNK = ITEMS.register("stone_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXPLOSIVES = ITEMS.register("explosives",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELECTRIC_MOTOR = ITEMS.register("electric_motor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOLID_FUEL = ITEMS.register("solid_fuel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FUEL = ITEMS.register("fuel",
            () -> new FuelItem(new Item.Properties(), 20000));

    public static final RegistryObject<Item> NUCLEAR_FUEL = ITEMS.register("nuclear_fuel",
            () -> new FuelItem(new Item.Properties(), 240000));

    public static final RegistryObject<Item> LOW_DENSITY_STRUCTURE = ITEMS.register("low_density_structure",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCKET_CONTROL_UNIT = ITEMS.register("rocket_control_unit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCKET_PART = ITEMS.register("rocket_part",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_235 = ITEMS.register("uranium_235",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_238 = ITEMS.register("uranium_238",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DESH = ITEMS.register("raw_desh",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_OSTRUM = ITEMS.register("raw_ostrum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CALORITE = ITEMS.register("raw_calorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TUNGSTEN_CARBIDE = ITEMS.register("tungsten_carbide",
            () -> new Item(new Item.Properties()));

    // Energy Storage
    /*public static final RegistryObject<Item> BASIC_BATTERY = ITEMS.register(NuminaConstants.MODULE_BATTERY_BASIC__REGNAME,
            () -> new Battery(1000000, 1000000, 1));

    public static final RegistryObject<Item> ADVANCED_BATTERY = ITEMS.register(NuminaConstants.MODULE_BATTERY_ADVANCED__REGNAME,
            () -> new Battery(5000000,5000000, 2));

    public static final RegistryObject<Item> ELITE_BATTERY = ITEMS.register(NuminaConstants.MODULE_BATTERY_ELITE__REGNAME,
            () -> new Battery(50000000,50000000, 3));

    public static final RegistryObject<Item> ULTIMATE_BATTERY = ITEMS.register(NuminaConstants.MODULE_BATTERY_ULTIMATE__REGNAME,
            () -> new Battery(100000000,100000000, 4));*/

    /*public static final RegistryObject<Item> LUBRICANT_BUCKET = ITEMS.register("lubricant_bucket",
            () -> new BucketItem(ModFluids.SOURCE_LUBRICANT, new Item.Properties()*//*.tab(ModCreativeModeTab.TUTORIAL_TAB)*//*.craftRemainder(Items.BUCKET).stacksTo(1)));*/

    /* Armor -------------------------------------------------------------------------------------- */
    /*public static final RegistryObject<Item> POWER_ARMOR_HELMET = ITEMS.register("power_armor_helmet",
            PowerArmorHelmet::new);

    public static final RegistryObject<Item> POWER_ARMOR_CHESTPLATE = ITEMS.register("power_armor_chestplate",
            PowerArmorChestplate::new);

    public static final RegistryObject<Item> POWER_ARMOR_LEGGINGS = ITEMS.register("power_armor_leggings",
            PowerArmorLeggings::new);

    public static final RegistryObject<Item> POWER_ARMOR_BOOTS = ITEMS.register("power_armor_boots",
            PowerArmorBoots::new);*/

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
