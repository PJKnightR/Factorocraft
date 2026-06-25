/*package net.fpr.factorocraft.fluid;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.fluid.custom.LubricantFluid;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {*/
    /*public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Factorocraft.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_LUBRICANT
            = FLUIDS.register("lubricant",
            () -> new LubricantFluid.Source(ModFluids.LUBRICANT_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_LUBRICANT
            = FLUIDS.register("flowing_lubricant",
            () -> new LubricantFluid.Flowing(ModFluids.LUBRICANT_PROPERTIES));

    public static final ForgeFlowingFluid.Properties LUBRICANT_PROPERTIES
            = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LUBRICANT, SOURCE_LUBRICANT, FLOWING_LUBRICANT)
            .slopeFindDistance(4)
            .levelDecreasePerBlock(1)
            .tickRate(30)
            .block(ModBlocks.LUBRICANT_BLOCK);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }*//*

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Factorocraft.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_LUBRICANT = FLUIDS.register("lubricant_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.LUBRICANT_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LUBRICANT = FLUIDS.register("flowing_lubricant",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LUBRICANT_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LUBRICANT_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LUBRICANT_FLUID_TYPE, SOURCE_LUBRICANT, FLOWING_LUBRICANT)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.LUBRICANT_BLOCK)
            .bucket(ModItems.LUBRICANT_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}*/
