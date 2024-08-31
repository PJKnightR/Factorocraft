package net.fpr.factorocraft.block.entity.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CopperOreVeinEntity extends OreVeinEntity {
    public ItemStack drop = new ItemStack(Items.RAW_COPPER);

    public CopperOreVeinEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.COPPER_ORE_VEIN_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
    }

    public CopperOreVeinEntity(BlockEntityType<?> entityType, BlockPos pWorldPosition, BlockState pBlockState) {
        super(entityType, pWorldPosition, pBlockState);
    }

    @Override
    public void dropItem(Level level, ItemStack itemstack) {
        level.addFreshEntity(new ItemEntity(level, this.getBlockPos().getX(), this.getBlockPos().getY(), this.getBlockPos().getZ(), itemstack));
    }
}
