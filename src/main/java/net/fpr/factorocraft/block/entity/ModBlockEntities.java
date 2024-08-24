package net.fpr.factorocraft.block.entity;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.block.entity.custom.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Factorocraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<CopperOreVeinEntity>> COPPER_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("copper_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(CopperOreVeinEntity::new,
                            ModBlocks.COPPER_ORE_VEIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<IronOreVeinEntity>> IRON_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("iron_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(IronOreVeinEntity::new,
                            ModBlocks.IRON_ORE_VEIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<CoalOreVeinEntity>> COAL_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("coal_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(CoalOreVeinEntity::new,
                            ModBlocks.COAL_ORE_VEIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<OreVeinEntity>> TIN_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("tin_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(OreVeinEntity::new,
                            ModBlocks.TIN_ORE_VEIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<OreVeinEntity>> URANIUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("uranium_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(OreVeinEntity::new,
                            ModBlocks.URANIUM_ORE_VEIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<OreVeinEntity>> STONE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("stone_vein_block_entity", () ->
                    BlockEntityType.Builder.of(OreVeinEntity::new,
                            ModBlocks.STONE_VEIN.get()).build(null));

    public static final RegistryObject<BlockEntityType<RedstoneOreVeinEntity>> REDSTONE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("redstone_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RedstoneOreVeinEntity::new,
                            ModBlocks.REDSTONE_ORE_VEIN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
