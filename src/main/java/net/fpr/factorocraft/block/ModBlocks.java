package net.fpr.factorocraft.block;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.custom.*;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Factorocraft.MOD_ID);

    /*public static final RegistryObject<Block> COPPER_ORE_VEIN = registerBlock("copper_ore_vein",
            () -> new CopperOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);*/

    public static final RegistryObject<Block> COPPER_ORE_VEIN = registerBlock("copper_ore_vein",
            () -> new CopperOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    /*public static final RegistryObject<Block> COPPER_ORE_VEIN_TEST = registerBlock("copper_ore_vein_test",
            () -> new CopperOreVein(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), CreativeModeTab.TAB_MISC);*/

    public static final RegistryObject<Block> IRON_ORE_VEIN = registerBlock("iron_ore_vein",
            () -> new IronOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> COAL_ORE_VEIN = registerBlock("coal_ore_vein",
            () -> new CoalOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> TIN_ORE_VEIN = registerBlock("tin_ore_vein",
            () -> new TinOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> URANIUM_ORE_VEIN = registerBlock("uranium_ore_vein",
            () -> new UraniumOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> STONE_VEIN = registerBlock("stone_vein",
            () -> new StoneVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> REDSTONE_ORE_VEIN = registerBlock("redstone_ore_vein",
            () -> new RedstoneOreVein(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> OIL_WELL = registerBlock("oil_well",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(-1.0F, 3600000.0F).noDrops()), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> OIL_SAND = registerBlock("oil_sand",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND)), CreativeModeTab.TAB_MISC);

    /*public static final RegistryObject<Block> BASIC_CONVEYOR_BELT = registerBlock("basic_conveyor_belt",
            () -> new ConveyorBelt(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));*/

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
