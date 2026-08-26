package net.fpr.factorocraft.block.custom.randomite.vein;

import net.fpr.factorocraft.block.custom.OreVein;
import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.RandomiteOreVeinEntity;
import net.fpr.factorocraft.item.RandomiteDropsResolver;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

import static net.fpr.factorocraft.util.ModTags.Items.*;

public class RandomiteOreVein extends OreVein {
    public static List<TagKey<Item>> rarityTags = new ArrayList<>();

    public RandomiteOreVein(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new RandomiteOreVeinEntity(ModBlockEntities.RANDOMITE_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        if (RandomiteDropsResolver.overworldRandomiteWeightedDrops.isEmpty()) {
            rarityTags.add(OVERWORLD_COMMON_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_UNCOMMON_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_RARE_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_SUPER_RARE_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_ULTRA_RARE_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_HYPER_RARE_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_LEGENDARY_ORE_VEIN_DROP);
            rarityTags.add(OVERWORLD_MYTHICAL_ORE_VEIN_DROP);
            RandomiteDropsResolver.resolveDrops(RandomiteDropsResolver.DropDimension.OVERWORLD, rarityTags);
        }

        if (!RandomiteDropsResolver.overworldRandomiteWeightedDrops.isEmpty()) {
            ItemStack drop = new ItemStack(RandomiteDropsResolver.getNextDrop(RandomiteDropsResolver.DropDimension.OVERWORLD));
            popResource(pLevel, pPos, drop/*RandomiteDropsResolver.getNextDrop()*/);
            //System.out.println("Dropped: " + drop.getDisplayName());
        }
    }
}
