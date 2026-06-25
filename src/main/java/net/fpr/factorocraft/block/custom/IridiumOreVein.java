package net.fpr.factorocraft.block.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.IridiumOreVeinEntity;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public class IridiumOreVein extends OreVein {

    public IridiumOreVein(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new IridiumOreVeinEntity(ModBlockEntities.IRIDIUM_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        Optional<Item> atm = Optional.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("alltheores", "raw_iridium")));
        boolean found = false;

        if (atm.isPresent() && !found) {
            if (!atm.get().equals(Items.AIR)) {
                popResource(pLevel, pPos, new ItemStack(atm.get()));
                found = true;
            }
        }
        if (!found) {
            popResource(pLevel, pPos, new ItemStack(ModItems.RAW_IRIDIUM.get()));
        }
    }
}
