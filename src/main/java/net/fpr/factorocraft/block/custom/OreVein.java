package net.fpr.factorocraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class OreVein extends BaseEntityBlock {
    public boolean destroyedByCreativePlayer = false;

    protected OreVein(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        if (!destroyedByCreativePlayer) {
            pLevel.setBlock(pPos, pState, 2);
        }
        setDestroyedByCreativePlayer(false);
    }

    public void setDestroyedByCreativePlayer(boolean destroyed) {
        this.destroyedByCreativePlayer = destroyed;
    }
}
