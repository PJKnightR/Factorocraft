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
                    .title(Component.translatable("creativetab.tutorial_tab"))
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

                        pOutput.accept(ModBlocks.COPPER_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.IRON_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.COAL_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.TIN_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.URANIUM_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.STONE_VEIN.get());
                        pOutput.accept(ModBlocks.REDSTONE_ORE_VEIN.get());
                        pOutput.accept(ModBlocks.OIL_WELL.get());
                        pOutput.accept(ModBlocks.OIL_SAND.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}