package net.fpr.factorocraft.block.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.UraniumOreVeinEntity;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;

import static net.fpr.factorocraft.util.ModTags.Items.URANIUM_ORE_VEIN_DROP;

public class UraniumOreVein extends OreVein {

    public UraniumOreVein(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new UraniumOreVeinEntity(ModBlockEntities.URANIUM_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        Optional<HolderSet.Named<Item>> dropFromTag = BuiltInRegistries.ITEM.getTag(URANIUM_ORE_VEIN_DROP);

        if (dropFromTag.isPresent()) {
            if (dropFromTag.get().size() > 0) {
                popResource(pLevel, pPos, new ItemStack(dropFromTag.get().get(0)));
            } else {
                dropDefaultItem(pLevel, pPos);
            }
        } else {
            dropDefaultItem(pLevel, pPos);
        }
    }

    public static void dropDefaultItem(Level pLevel, BlockPos pPos) {
        Optional<Item> mekanismItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism", "raw_uranium")));
        Optional<Item> immersiveItem = Optional.ofNullable(ForgeRegistries.ITEMS.getValue(new ResourceLocation("immersiveengineering", "raw_uranium")));
        boolean found = false;

        if (mekanismItem.isPresent() && !found) {
            if (!mekanismItem.get().equals(Items.AIR)) {
                popResource(pLevel, pPos, new ItemStack(mekanismItem.get()));
                found = true;
            }
        }
        if (immersiveItem.isPresent() && !found) {
            if (!immersiveItem.get().equals(Items.AIR)) {
                popResource(pLevel, pPos, new ItemStack(immersiveItem.get()));
                found = true;
            }
        }
        if (!found) {
            popResource(pLevel, pPos, new ItemStack(ModItems.RAW_URANIUM.get()));
        }
    }
}
