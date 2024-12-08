package net.fpr.factorocraft.fluid;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, Factorocraft.MOD_ID);


    public static final RegistryObject<FlowingFluid> LUBRICANT_FLUID
            = FLUIDS.register("lubricant_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.LUBRICANT_PROPERTIES));

    public static final RegistryObject<FlowingFluid> LUBRICANT_FLOWING
            = FLUIDS.register("lubricant_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.LUBRICANT_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LUBRICANT_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LUBRICANT_FLUID.get(), () -> LUBRICANT_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(1).sound(SoundEvents.SLIME_BLOCK_PLACE).overlay(WATER_OVERLAY_RL)
            .color(0xbf093d03)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.LUBRICANT_BLOCK.get()).bucket(() -> ModItems.LUBRICANT_BUCKET.get());

    public static final RegistryObject<LiquidBlock> LUBRICANT_BLOCK = ModBlocks.BLOCKS.register("lubricant",
            () -> new LiquidBlock(() -> ModFluids.LUBRICANT_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
