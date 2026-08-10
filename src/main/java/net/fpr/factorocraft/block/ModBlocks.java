package net.fpr.factorocraft.block;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.custom.*;
//import net.fpr.factorocraft.fluid.ModFluids;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Factorocraft.MOD_ID);

    public static final RegistryObject<Block> COPPER_ORE_VEIN = registerBlock("copper_ore_vein",
            () -> new CopperOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> IRON_ORE_VEIN = registerBlock("iron_ore_vein",
            () -> new IronOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> COAL_ORE_VEIN = registerBlock("coal_ore_vein",
            () -> new CoalOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> TIN_ORE_VEIN = registerBlock("tin_ore_vein",
            () -> new TinOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> URANIUM_ORE_VEIN = registerBlock("uranium_ore_vein",
            () -> new UraniumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> STONE_VEIN = registerBlock("stone_vein",
            () -> new StoneVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(12.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> REDSTONE_ORE_VEIN = registerBlock("redstone_ore_vein",
            () -> new RedstoneOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> GOLD_ORE_VEIN = registerBlock("gold_ore_vein",
            () -> new GoldOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> LAPIS_ORE_VEIN = registerBlock("lapis_ore_vein",
            () -> new LapisOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> LEAD_ORE_VEIN = registerBlock("lead_ore_vein",
            () -> new LeadOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> LITHIUM_ORE_VEIN = registerBlock("lithium_ore_vein",
            () -> new LithiumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> NICKEL_ORE_VEIN = registerBlock("nickel_ore_vein",
            () -> new NickelOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> SILVER_ORE_VEIN = registerBlock("silver_ore_vein",
            () -> new SilverOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> ZINC_ORE_VEIN = registerBlock("zinc_ore_vein",
            () -> new ZincOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> ALUMINUM_ORE_VEIN = registerBlock("aluminum_ore_vein",
            () -> new AluminumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> OSMIUM_ORE_VEIN = registerBlock("osmium_ore_vein",
            () -> new OsmiumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(25.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> TITANIUM_ORE_VEIN = registerBlock("titanium_ore_vein",
            () -> new TitaniumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> PLATINUM_ORE_VEIN = registerBlock("platinum_ore_vein",
            () -> new PlatinumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> IRIDIUM_ORE_VEIN = registerBlock("iridium_ore_vein",
            () -> new IridiumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(150.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> TUNGSTEN_ORE_VEIN = registerBlock("tungsten_ore_vein",
            () -> new TungstenOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> DESH_ORE_VEIN = registerBlock("desh_ore_vein",
            () -> new DeshOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(100.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> OSTRUM_ORE_VEIN = registerBlock("ostrum_ore_vein",
            () -> new OstrumOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(100.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));

    public static final RegistryObject<Block> CALORITE_ORE_VEIN = registerBlock("calorite_ore_vein",
            () -> new CaloriteOreVein(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(100.0F, 1200.0F).pushReaction(PushReaction.BLOCK)));


    public static final RegistryObject<Block> OIL_WELL = registerBlock("oil_well",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(-1.0F, 3600000.0F)/*.noDrops()*/));

    public static final RegistryObject<Block> OIL_SAND = registerBlock("oil_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND/*, MaterialColor.SAND*/).strength(0.5F).sound(SoundType.SAND)));

    /*public static final RegistryObject<LiquidBlock> LUBRICANT_BLOCK = registerBlock("lubricant_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LUBRICANT, BlockBehaviour.Properties.copy(Blocks.LAVA).speedFactor(0.5f)));*/

    /*public static final RegistryObject<LiquidBlock> LUBRICANT_BLOCK = BLOCKS.register("lubricant_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LUBRICANT, BlockBehaviour.Properties.copy(Blocks.WATER)));*/

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
