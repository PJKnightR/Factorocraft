/*package net.fpr.factorocraft.fluid;

import net.fpr.factorocraft.Factorocraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {*/
    /*public static final ResourceLocation LUBRICANT_STILL_RL
            = new ResourceLocation(Factorocraft.MOD_ID, "block/lubricant_still");
    public static final ResourceLocation LUBRICANT_FLOWING_RL
            = new ResourceLocation(Factorocraft.MOD_ID, "block/lubricant_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Factorocraft.MOD_ID);

    public static final RegistryObject<FluidType> LUBRICANT = register("lubricant",
            FluidType.Properties.create()
                    .canSwim(false)
                    .pathType(BlockPathTypes.LAVA)
                    .adjacentPathType(BlockPathTypes.LAVA)
                    .lightLevel(5)
                    .density(3000)
                    .viscosity(10)
                    .supportsBoating(true)
                    .canConvertToSource(false)
                    .canDrown(false)
                    .canPushEntity(true)
                    .motionScale(0.01f)
                    .sound(SoundAction.get("splash"), SoundEvents.HONEY_DRINK)
                    .sound(SoundAction.get("swim"), SoundEvents.HONEY_BLOCK_SLIDE)
                    .sound(SoundAction.get("wade"), SoundEvents.HONEY_DRINK));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name,
                () -> new BaseFluidType(LUBRICANT_STILL_RL, LUBRICANT_FLOWING_RL,
                        0xbf093d03, new Vector3f(4f / 255f, 34f / 255f, 36f / 255f), properties));
    }*//*

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation LUBRICANT_OVERLAY_RL = new ResourceLocation(Factorocraft.MOD_ID, "misc/in_lubricant");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Factorocraft.MOD_ID);

    public static final RegistryObject<FluidType> LUBRICANT_FLUID_TYPE = register("lubricant_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, LUBRICANT_OVERLAY_RL,
                0xbf093d03, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}*/
