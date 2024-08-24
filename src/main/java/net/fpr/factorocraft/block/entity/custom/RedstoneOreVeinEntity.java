package net.fpr.factorocraft.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneOreVeinEntity extends OreVeinEntity {
    public ItemStack drop = new ItemStack(Items.REDSTONE);

    public RedstoneOreVeinEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(pWorldPosition, pBlockState);
    }

    public RedstoneOreVeinEntity(BlockEntityType<?> entityType, BlockPos pWorldPosition, BlockState pBlockState) {
        super(entityType, pWorldPosition, pBlockState);
    }

    @Override
    public void dropItem(Level level, ItemStack itemstack) {
        level.addFreshEntity(new ItemEntity(level, this.getBlockPos().getX(), this.getBlockPos().getY(), this.getBlockPos().getZ(), itemstack));
    }
}
