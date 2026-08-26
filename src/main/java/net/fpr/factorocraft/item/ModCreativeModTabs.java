package net.fpr.factorocraft.item;

import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.block.custom.*;
import net.fpr.factorocraft.item.custom.FuelItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.fpr.factorocraft.Factorocraft;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Factorocraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FUEL.get()))
                    .title(Component.translatable("creativetab.factorocraft"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.AUTOMATION_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.LOGISTIC_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.CHEMICAL_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.MILITARY_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.PRODUCTION_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.UTILITY_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.SPACE_SCIENCE_PACK.get());
                        pOutput.accept(ModItems.STONE_CHUNK.get());
                        pOutput.accept(ModItems.RAW_TIN.get());
                        pOutput.accept(ModItems.RAW_URANIUM.get());
                        pOutput.accept(ModItems.PLASTIC.get());
                        pOutput.accept(ModItems.EXPLOSIVES.get());
                        pOutput.accept(ModItems.ELECTRIC_MOTOR.get());
                        pOutput.accept(ModItems.SOLID_FUEL.get());
                        pOutput.accept(ModItems.FUEL.get());
                        pOutput.accept(ModItems.NUCLEAR_FUEL.get());
                        pOutput.accept(ModItems.LOW_DENSITY_STRUCTURE.get());
                        pOutput.accept(ModItems.ROCKET_CONTROL_UNIT.get());
                        pOutput.accept(ModItems.ROCKET_PART.get());
                        pOutput.accept(ModItems.RAW_LEAD.get());
                        pOutput.accept(ModItems.RAW_LITHIUM.get());
                        pOutput.accept(ModItems.RAW_NICKEL.get());
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModItems.RAW_ZINC.get());
                        pOutput.accept(ModItems.RAW_ALUMINUM.get());
                        pOutput.accept(ModItems.RAW_OSMIUM.get());
                        pOutput.accept(ModItems.BASIC_CIRCUIT.get());
                        pOutput.accept(ModItems.ADVANCED_CIRCUIT.get());
                        pOutput.accept(ModItems.ELITE_CIRCUIT.get());
                        pOutput.accept(ModItems.ULTIMATE_CIRCUIT.get());
                        pOutput.accept(ModItems.URANIUM_235.get());
                        pOutput.accept(ModItems.URANIUM_238.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModItems.RAW_PLATINUM.get());
                        pOutput.accept(ModItems.RAW_IRIDIUM.get());
                        pOutput.accept(ModItems.RAW_TUNGSTEN.get());
                        pOutput.accept(ModItems.RAW_DESH.get());
                        pOutput.accept(ModItems.RAW_OSTRUM.get());
                        pOutput.accept(ModItems.RAW_CALORITE.get());
                        pOutput.accept(ModItems.TUNGSTEN_CARBIDE.get());

                        pOutput.accept(ModBlocks.COPPER_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.IRON_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.COAL_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.TIN_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.URANIUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.STONE_VEIN.get());
                        pOutput.accept(ModBlocks.REDSTONE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.GOLD_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.LAPIS_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.LEAD_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.LITHIUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.NICKEL_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.SILVER_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.ZINC_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.ALUMINUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.OSMIUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.TITANIUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.PLATINUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.IRIDIUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.TUNGSTEN_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.DESH_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.OSTRUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.CALORITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.END_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.AETHER_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.MOON_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.MARS_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.VENUS_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.GLACIO_RANDOMITE_ORE.get());
                        pOutput.accept(ModBlocks.RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.NETHER_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.END_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.AETHER_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.MOON_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.MARS_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.VENUS_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.GLACIO_RANDOMITE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.OIL_WELL.get());
                        pOutput.accept(ModBlocks.OIL_SAND.get());

                        /*pOutput.accept(ModItems.POWER_ARMOR_HELMET.get());
                        pOutput.accept(ModItems.POWER_ARMOR_CHESTPLATE.get());
                        pOutput.accept(ModItems.POWER_ARMOR_LEGGINGS.get());
                        pOutput.accept(ModItems.POWER_ARMOR_BOOTS.get());*/
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}