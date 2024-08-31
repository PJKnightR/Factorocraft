package net.fpr.factorocraft.block.entity.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class StoneVeinEntity extends OreVeinEntity {
    public ItemStack drop = new ItemStack(ModItems.STONE_CHUNK.get());

    public StoneVeinEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.STONE_VEIN_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
    }

    public StoneVeinEntity(BlockEntityType<?> entityType, BlockPos pWorldPosition, BlockState pBlockState) {
        super(entityType, pWorldPosition, pBlockState);
    }

    @Override
    public void dropItem(Level level, ItemStack itemstack) {
        level.addFreshEntity(new ItemEntity(level, this.getBlockPos().getX(), this.getBlockPos().getY(), this.getBlockPos().getZ(), itemstack));
    }
}
