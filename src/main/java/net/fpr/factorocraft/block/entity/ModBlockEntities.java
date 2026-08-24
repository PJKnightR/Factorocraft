package net.fpr.factorocraft.block.entity;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.block.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Factorocraft.MOD_ID);

    public static final Supplier<BlockEntityType<CopperOreVeinEntity>> COPPER_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("copper_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(CopperOreVeinEntity::new,
                            ModBlocks.COPPER_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<IronOreVeinEntity>> IRON_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("iron_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(IronOreVeinEntity::new,
                            ModBlocks.IRON_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<CoalOreVeinEntity>> COAL_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("coal_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(CoalOreVeinEntity::new,
                            ModBlocks.COAL_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<TinOreVeinEntity>> TIN_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("tin_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(TinOreVeinEntity::new,
                            ModBlocks.TIN_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<UraniumOreVeinEntity>> URANIUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("uranium_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(UraniumOreVeinEntity::new,
                            ModBlocks.URANIUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<StoneVeinEntity>> STONE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("stone_vein_block_entity", () ->
                    BlockEntityType.Builder.of(StoneVeinEntity::new,
                            ModBlocks.STONE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RedstoneOreVeinEntity>> REDSTONE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("redstone_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RedstoneOreVeinEntity::new,
                            ModBlocks.REDSTONE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<GoldOreVeinEntity>> GOLD_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("gold_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(GoldOreVeinEntity::new,
                            ModBlocks.GOLD_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<LapisOreVeinEntity>> LAPIS_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("lapis_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(LapisOreVeinEntity::new,
                            ModBlocks.LAPIS_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<LeadOreVeinEntity>> LEAD_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("lead_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(LeadOreVeinEntity::new,
                            ModBlocks.LEAD_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<LithiumOreVeinEntity>> LITHIUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("lithium_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(LithiumOreVeinEntity::new,
                            ModBlocks.LITHIUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<NickelOreVeinEntity>> NICKEL_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("nickel_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(NickelOreVeinEntity::new,
                            ModBlocks.NICKEL_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<SilverOreVeinEntity>> SILVER_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("silver_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(SilverOreVeinEntity::new,
                            ModBlocks.SILVER_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<ZincOreVeinEntity>> ZINC_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("zinc_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(ZincOreVeinEntity::new,
                            ModBlocks.ZINC_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<AluminumOreVeinEntity>> ALUMINUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("aluminum_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(AluminumOreVeinEntity::new,
                            ModBlocks.ALUMINUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<OsmiumOreVeinEntity>> OSMIUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("osmium_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(OsmiumOreVeinEntity::new,
                            ModBlocks.OSMIUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<TitaniumOreVeinEntity>> TITANIUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("titanium_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(TitaniumOreVeinEntity::new,
                            ModBlocks.TITANIUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<PlatinumOreVeinEntity>> PLATINUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("platinum_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(PlatinumOreVeinEntity::new,
                            ModBlocks.PLATINUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<IridiumOreVeinEntity>> IRIDIUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("iridium_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(IridiumOreVeinEntity::new,
                            ModBlocks.IRIDIUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<TungstenOreVeinEntity>> TUNGSTEN_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("tungsten_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(TungstenOreVeinEntity::new,
                            ModBlocks.TUNGSTEN_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<DeshOreVeinEntity>> DESH_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("desh_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(DeshOreVeinEntity::new,
                            ModBlocks.DESH_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<OstrumOreVeinEntity>> OSTRUM_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("ostrum_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(OstrumOreVeinEntity::new,
                            ModBlocks.OSTRUM_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<CaloriteOreVeinEntity>> CALORITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("calorite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(CaloriteOreVeinEntity::new,
                            ModBlocks.CALORITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> NETHER_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("nether_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.NETHER_RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> END_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("end_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.END_RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> AETHER_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("aether_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.AETHER_RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> MOON_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("moon_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.MOON_RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> MARS_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("mars_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.MARS_RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> VENUS_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("venus_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.VENUS_RANDOMITE_ORE_VEIN.get()).build(null));

    public static final Supplier<BlockEntityType<RandomiteOreVeinEntity>> GLACIO_RANDOMITE_ORE_VEIN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("glacio_randomite_ore_vein_block_entity", () ->
                    BlockEntityType.Builder.of(RandomiteOreVeinEntity::new,
                            ModBlocks.GLACIO_RANDOMITE_ORE_VEIN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
