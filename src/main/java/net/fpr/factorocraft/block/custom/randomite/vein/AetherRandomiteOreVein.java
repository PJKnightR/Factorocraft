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

public class AetherRandomiteOreVein extends OreVein {
    public static List<TagKey<Item>> rarityTags = new ArrayList<>();

    public AetherRandomiteOreVein(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new RandomiteOreVeinEntity(ModBlockEntities.AETHER_RANDOMITE_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        if (RandomiteDropsResolver.aetherRandomiteWeightedDrops.isEmpty()) {
            rarityTags.add(AETHER_COMMON_ORE_VEIN_DROP);
            rarityTags.add(AETHER_UNCOMMON_ORE_VEIN_DROP);
            rarityTags.add(AETHER_RARE_ORE_VEIN_DROP);
            rarityTags.add(AETHER_SUPER_RARE_ORE_VEIN_DROP);
            rarityTags.add(AETHER_ULTRA_RARE_ORE_VEIN_DROP);
            rarityTags.add(AETHER_HYPER_RARE_ORE_VEIN_DROP);
            rarityTags.add(AETHER_LEGENDARY_ORE_VEIN_DROP);
            rarityTags.add(AETHER_MYTHICAL_ORE_VEIN_DROP);
            RandomiteDropsResolver.resolveDrops(RandomiteDropsResolver.DropDimension.AETHER, rarityTags);
        }

        if (!RandomiteDropsResolver.aetherRandomiteWeightedDrops.isEmpty()) {
            ItemStack drop = new ItemStack(RandomiteDropsResolver.getNextDrop(RandomiteDropsResolver.DropDimension.AETHER));
            popResource(pLevel, pPos, drop/*RandomiteDropsResolver.getNextDrop()*/);
            System.out.println("Dropped: " + drop.getDisplayName());
        }
    }
}
