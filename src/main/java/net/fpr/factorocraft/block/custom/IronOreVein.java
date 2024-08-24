package net.fpr.factorocraft.block.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.CopperOreVeinEntity;
import net.fpr.factorocraft.block.entity.custom.IronOreVeinEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class IronOreVein extends BaseEntityBlock {

    public IronOreVein(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new IronOreVeinEntity(ModBlockEntities.IRON_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }
}
