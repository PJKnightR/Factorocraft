package net.fpr.factorocraft.block.entity.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class OreVeinEntity extends BlockEntity {
    public int oreAmount = -1;

    public OreVeinEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.COPPER_ORE_VEIN_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        //oreAmount = -1;
        load(new CompoundTag());
    }

    public OreVeinEntity(BlockEntityType<?> entityType, BlockPos pWorldPosition, BlockState pBlockState) {
        super(entityType, pWorldPosition, pBlockState);
        //oreAmount = -1;
        load(new CompoundTag());
    }

    protected void dropItem(Level level, ItemStack itemstack) {}

    /*public void saveAdditional(CompoundTag nbt) {
        System.out.println("Save Test");
        super.saveAdditional(nbt);
        nbt.putInt("factorocraft:ore_amount", this.oreAmount);
    }

    public void load(CompoundTag nbt) {
        System.out.println("Load Test");
        super.load(nbt);
        if (nbt.contains("factorocraft:ore_amount")) {
            this.oreAmount = nbt.getInt("factorocraft:ore_amount");
            System.out.println("Loaded ore amount from data");
        } else if (oreAmount == -1) {
            this.oreAmount = 3;
            //this.getBlockState().setValue(AMOUNT, oreAmount);
            System.out.println("Initialized value to 3");
        }
    }*/

    public int getOreAmount() {
        return oreAmount;
        //return this.getBlockState().getValue(AMOUNT);
    }

    public void setOreAmount(int oreAmount) {
        this.oreAmount = oreAmount;
        saveAdditional(new CompoundTag());
        //this.getBlockState().setValue(AMOUNT, oreAmount);
    }
}
