package net.fpr.factorocraft.block.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.IronOreVeinEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public abstract class OreVein extends BaseEntityBlock {
    public boolean destroyedByCreativePlayer = false;

    public OreVein(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public abstract BlockEntity newBlockEntity(BlockPos pPos, BlockState pState);

    /*@Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        if (!destroyedByCreativePlayer) {
            pLevel.setBlock(pPos, pState, 2);
        }
        setDestroyedByCreativePlayer(false);
    }*/

    @Override
    /*public static void updateOrDestroy(BlockState p_49903_, BlockState p_49904_, LevelAccessor p_49905_, BlockPos p_49906_, int p_49907_) {
        super.updateOrDestroy(p_49903_, p_49904_, p_49905_, p_49906_, p_49907_, 512);
    }*/
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        //System.out.println("Test");

        if (!destroyedByCreativePlayer) {
            pLevel.setBlock(pPos, pState, 2);
        }
        setDestroyedByCreativePlayer(false);
    }

    public void setDestroyedByCreativePlayer(boolean destroyed) {
        this.destroyedByCreativePlayer = destroyed;
    }
}
