package net.fpr.factorocraft.item;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Factorocraft.MOD_ID);

    public static final Supplier<CreativeModeTab> FACTOROCRAFT_TAB = CREATIVE_MODE_TAB.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FUEL.get()))
                    .title(Component.translatable("creativetab.factorocraft"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.AUTOMATION_SCIENCE_PACK.get());
                        output.accept(ModItems.LOGISTIC_SCIENCE_PACK.get());
                        output.accept(ModItems.CHEMICAL_SCIENCE_PACK.get());
                        output.accept(ModItems.MILITARY_SCIENCE_PACK.get());
                        output.accept(ModItems.PRODUCTION_SCIENCE_PACK.get());
                        output.accept(ModItems.UTILITY_SCIENCE_PACK.get());
                        output.accept(ModItems.SPACE_SCIENCE_PACK.get());
                        output.accept(ModItems.STONE_CHUNK.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.RAW_URANIUM.get());
                        output.accept(ModItems.PLASTIC.get());
                        output.accept(ModItems.EXPLOSIVES.get());
                        output.accept(ModItems.ELECTRIC_MOTOR.get());
                        output.accept(ModItems.SOLID_FUEL.get());
                        output.accept(ModItems.FUEL.get());
                        output.accept(ModItems.NUCLEAR_FUEL.get());
                        output.accept(ModItems.LOW_DENSITY_STRUCTURE.get());
                        output.accept(ModItems.ROCKET_CONTROL_UNIT.get());
                        output.accept(ModItems.ROCKET_PART.get());
                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.RAW_LITHIUM.get());
                        output.accept(ModItems.RAW_NICKEL.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.RAW_ZINC.get());
                        output.accept(ModItems.RAW_ALUMINUM.get());
                        output.accept(ModItems.RAW_OSMIUM.get());
                        output.accept(ModItems.BASIC_CIRCUIT.get());
                        output.accept(ModItems.ADVANCED_CIRCUIT.get());
                        output.accept(ModItems.ELITE_CIRCUIT.get());
                        output.accept(ModItems.ULTIMATE_CIRCUIT.get());
                        output.accept(ModItems.URANIUM_235.get());
                        output.accept(ModItems.URANIUM_238.get());
                        output.accept(ModItems.RAW_TITANIUM.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.RAW_IRIDIUM.get());
                        output.accept(ModItems.RAW_TUNGSTEN.get());
                        output.accept(ModItems.RAW_DESH.get());
                        output.accept(ModItems.RAW_OSTRUM.get());
                        output.accept(ModItems.RAW_CALORITE.get());
                        output.accept(ModItems.TUNGSTEN_CARBIDE.get());

                        output.accept(ModBlocks.COPPER_ORE_VEIN.get());
                        output.accept(ModBlocks.IRON_ORE_VEIN.get());
                        output.accept(ModBlocks.COAL_ORE_VEIN.get());
                        output.accept(ModBlocks.TIN_ORE_VEIN.get());
                        output.accept(ModBlocks.URANIUM_ORE_VEIN.get());
                        output.accept(ModBlocks.STONE_VEIN.get());
                        output.accept(ModBlocks.REDSTONE_ORE_VEIN.get());
                        output.accept(ModBlocks.GOLD_ORE_VEIN.get());
                        output.accept(ModBlocks.LAPIS_ORE_VEIN.get());
                        output.accept(ModBlocks.LEAD_ORE_VEIN.get());
                        output.accept(ModBlocks.LITHIUM_ORE_VEIN.get());
                        output.accept(ModBlocks.NICKEL_ORE_VEIN.get());
                        output.accept(ModBlocks.SILVER_ORE_VEIN.get());
                        output.accept(ModBlocks.ZINC_ORE_VEIN.get());
                        output.accept(ModBlocks.ALUMINUM_ORE_VEIN.get());
                        output.accept(ModBlocks.OSMIUM_ORE_VEIN.get());
                        output.accept(ModBlocks.TITANIUM_ORE_VEIN.get());
                        output.accept(ModBlocks.PLATINUM_ORE_VEIN.get());
                        output.accept(ModBlocks.IRIDIUM_ORE_VEIN.get());
                        output.accept(ModBlocks.TUNGSTEN_ORE_VEIN.get());
                        output.accept(ModBlocks.DESH_ORE_VEIN.get());
                        output.accept(ModBlocks.OSTRUM_ORE_VEIN.get());
                        output.accept(ModBlocks.CALORITE_ORE_VEIN.get());
                        output.accept(ModBlocks.RANDOMITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.NETHER_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.END_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.AETHER_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.MOON_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.MARS_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.VENUS_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.GLACIO_RANDOMITE_ORE.get());
                        output.accept(ModBlocks.RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.NETHER_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.END_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.AETHER_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.MOON_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.MARS_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.VENUS_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.GLACIO_RANDOMITE_ORE_VEIN.get());
                        output.accept(ModBlocks.OIL_WELL.get());
                        output.accept(ModBlocks.OIL_SAND.get());

                        /*pOutput.accept(ModItems.POWER_ARMOR_HELMET.get());
                        pOutput.accept(ModItems.POWER_ARMOR_CHESTPLATE.get());
                        pOutput.accept(ModItems.POWER_ARMOR_LEGGINGS.get());
                        pOutput.accept(ModItems.POWER_ARMOR_BOOTS.get());*/
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}