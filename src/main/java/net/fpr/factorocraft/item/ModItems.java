package net.fpr.factorocraft.item;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.item.custom.FuelItem;
import net.fpr.factorocraft.item.custom.NuclearFuelItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Factorocraft.MOD_ID);

    public static final RegistryObject<Item> AUTOMATION_SCIENCE_PACK = ITEMS.register("science_pack_automation", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LOGISTIC_SCIENCE_PACK = ITEMS.register("science_pack_logistic", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHEMICAL_SCIENCE_PACK = ITEMS.register("science_pack_chemical", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MILITARY_SCIENCE_PACK = ITEMS.register("science_pack_military", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PRODUCTION_SCIENCE_PACK = ITEMS.register("science_pack_production", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> UTILITY_SCIENCE_PACK = ITEMS.register("science_pack_utility", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SPACE_SCIENCE_PACK = ITEMS.register("science_pack_space", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STONE_CHUNK = ITEMS.register("stone_chunk", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> EXPLOSIVES = ITEMS.register("explosives", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ELECTRIC_MOTOR = ITEMS.register("electric_motor", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SOLID_FUEL = ITEMS.register("solid_fuel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", () -> new FuelItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NUCLEAR_FUEL = ITEMS.register("nuclear_fuel", () -> new NuclearFuelItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> LOW_DENSITY_STRUCTURE = ITEMS.register("low_density_structure", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ROCKET_CONTROL_UNIT = ITEMS.register("rocket_control_unit", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ROCKET_PART = ITEMS.register("rocket_part", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
