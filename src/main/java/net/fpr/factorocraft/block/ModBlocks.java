package net.fpr.factorocraft.block;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.custom.*;
//import net.fpr.factorocraft.fluid.ModFluids;
import net.fpr.factorocraft.block.custom.randomite.ore.*;
import net.fpr.factorocraft.block.custom.randomite.vein.*;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Factorocraft.MOD_ID);

    public static final DeferredBlock<Block> COPPER_ORE_VEIN = registerBlock("copper_ore_vein",
            () -> new CopperOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> IRON_ORE_VEIN = registerBlock("iron_ore_vein",
            () -> new IronOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COAL_ORE_VEIN = registerBlock("coal_ore_vein",
            () -> new CoalOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TIN_ORE_VEIN = registerBlock("tin_ore_vein",
            () -> new TinOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> URANIUM_ORE_VEIN = registerBlock("uranium_ore_vein",
            () -> new UraniumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> STONE_VEIN = registerBlock("stone_vein",
            () -> new StoneVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(12.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> REDSTONE_ORE_VEIN = registerBlock("redstone_ore_vein",
            () -> new RedstoneOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> GOLD_ORE_VEIN = registerBlock("gold_ore_vein",
            () -> new GoldOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> LAPIS_ORE_VEIN = registerBlock("lapis_ore_vein",
            () -> new LapisOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> LEAD_ORE_VEIN = registerBlock("lead_ore_vein",
            () -> new LeadOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> LITHIUM_ORE_VEIN = registerBlock("lithium_ore_vein",
            () -> new LithiumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> NICKEL_ORE_VEIN = registerBlock("nickel_ore_vein",
            () -> new NickelOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> SILVER_ORE_VEIN = registerBlock("silver_ore_vein",
            () -> new SilverOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ZINC_ORE_VEIN = registerBlock("zinc_ore_vein",
            () -> new ZincOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ALUMINUM_ORE_VEIN = registerBlock("aluminum_ore_vein",
            () -> new AluminumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> OSMIUM_ORE_VEIN = registerBlock("osmium_ore_vein",
            () -> new OsmiumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TITANIUM_ORE_VEIN = registerBlock("titanium_ore_vein",
            () -> new TitaniumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> PLATINUM_ORE_VEIN = registerBlock("platinum_ore_vein",
            () -> new PlatinumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> IRIDIUM_ORE_VEIN = registerBlock("iridium_ore_vein",
            () -> new IridiumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(150.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TUNGSTEN_ORE_VEIN = registerBlock("tungsten_ore_vein",
            () -> new TungstenOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DESH_ORE_VEIN = registerBlock("desh_ore_vein",
            () -> new DeshOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(100.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> OSTRUM_ORE_VEIN = registerBlock("ostrum_ore_vein",
            () -> new OstrumOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(100.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CALORITE_ORE_VEIN = registerBlock("calorite_ore_vein",
            () -> new CaloriteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(100.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    //Randomite Ores
    public static final DeferredBlock<Block> RANDOMITE_ORE = registerBlock("randomite_ore",
            () -> new RandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_RANDOMITE_ORE = registerBlock("deepslate_randomite_ore",
            () -> new RandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(4.5F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> NETHER_RANDOMITE_ORE = registerBlock("nether_randomite_ore",
            () -> new NetherRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> END_RANDOMITE_ORE = registerBlock("end_randomite_ore",
            () -> new EndRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> AETHER_RANDOMITE_ORE = registerBlock("aether_randomite_ore",
            () -> new AetherRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOON_RANDOMITE_ORE = registerBlock("moon_randomite_ore",
            () -> new MoonRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MARS_RANDOMITE_ORE = registerBlock("mars_randomite_ore",
            () -> new MarsRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> VENUS_RANDOMITE_ORE = registerBlock("venus_randomite_ore",
            () -> new VenusRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> GLACIO_RANDOMITE_ORE = registerBlock("glacio_randomite_ore",
            () -> new GlacioRandomiteOre(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    //Randomite Ore Veins
    public static final DeferredBlock<Block> RANDOMITE_ORE_VEIN = registerBlock("randomite_ore_vein",
            () -> new RandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> NETHER_RANDOMITE_ORE_VEIN = registerBlock("nether_randomite_ore_vein",
            () -> new NetherRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> END_RANDOMITE_ORE_VEIN = registerBlock("end_randomite_ore_vein",
            () -> new EndRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> AETHER_RANDOMITE_ORE_VEIN = registerBlock("aether_randomite_ore_vein",
            () -> new AetherRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOON_RANDOMITE_ORE_VEIN = registerBlock("moon_randomite_ore_vein",
            () -> new MoonRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MARS_RANDOMITE_ORE_VEIN = registerBlock("mars_randomite_ore_vein",
            () -> new MarsRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> VENUS_RANDOMITE_ORE_VEIN = registerBlock("venus_randomite_ore_vein",
            () -> new VenusRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> GLACIO_RANDOMITE_ORE_VEIN = registerBlock("glacio_randomite_ore_vein",
            () -> new GlacioRandomiteOreVein(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK).sound(SoundType.STONE)));


    public static final DeferredBlock<Block> OIL_WELL = registerBlock("oil_well",
            () -> new Block(BlockBehaviour.Properties.of().strength(-1.0F, 3600000.0F)/*.noDrops()*/));

    public static final DeferredBlock<Block> OIL_SAND = registerBlock("oil_sand",
            () -> new Block(BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    /*public static final RegistryObject<LiquidBlock> LUBRICANT_BLOCK = registerBlock("lubricant_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LUBRICANT, BlockBehaviour.Properties.copy(Blocks.LAVA).speedFactor(0.5f)));*/

    /*public static final RegistryObject<LiquidBlock> LUBRICANT_BLOCK = BLOCKS.register("lubricant_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LUBRICANT, BlockBehaviour.Properties.copy(Blocks.WATER)));*/

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
