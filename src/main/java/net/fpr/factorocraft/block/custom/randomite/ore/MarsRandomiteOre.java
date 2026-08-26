package net.fpr.factorocraft.block.custom.randomite.ore;

import net.fpr.factorocraft.block.custom.OreVein;
import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.RandomiteOreVeinEntity;
import net.fpr.factorocraft.item.RandomiteDropsResolver;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

import static net.fpr.factorocraft.util.ModTags.Items.*;

public class MarsRandomiteOre extends Block {
    public static List<TagKey<Item>> rarityTags = new ArrayList<>();

    public MarsRandomiteOre(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    /*public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new RandomiteOreVeinEntity(ModBlockEntities.MARS_RANDOMITE_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }*/

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        if (RandomiteDropsResolver.marsRandomiteWeightedDrops.isEmpty()) {
            rarityTags.add(MARS_COMMON_ORE_VEIN_DROP);
            rarityTags.add(MARS_UNCOMMON_ORE_VEIN_DROP);
            rarityTags.add(MARS_RARE_ORE_VEIN_DROP);
            rarityTags.add(MARS_SUPER_RARE_ORE_VEIN_DROP);
            rarityTags.add(MARS_ULTRA_RARE_ORE_VEIN_DROP);
            rarityTags.add(MARS_HYPER_RARE_ORE_VEIN_DROP);
            rarityTags.add(MARS_LEGENDARY_ORE_VEIN_DROP);
            rarityTags.add(MARS_MYTHICAL_ORE_VEIN_DROP);
            RandomiteDropsResolver.resolveDrops(RandomiteDropsResolver.DropDimension.MARS, rarityTags);
        }

        if (!RandomiteDropsResolver.marsRandomiteWeightedDrops.isEmpty()) {
            ItemStack drop = new ItemStack(RandomiteDropsResolver.getNextDrop(RandomiteDropsResolver.DropDimension.MARS));
            popResource(pLevel, pPos, drop/*RandomiteDropsResolver.getNextDrop()*/);
            System.out.println("Dropped: " + drop.getDisplayName());
        }
    }
}
