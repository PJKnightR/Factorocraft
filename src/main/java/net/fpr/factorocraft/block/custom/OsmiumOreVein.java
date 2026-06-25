package net.fpr.factorocraft.block.custom;

import net.fpr.factorocraft.block.entity.ModBlockEntities;
import net.fpr.factorocraft.block.entity.custom.GoldOreVeinEntity;
import net.fpr.factorocraft.block.entity.custom.OsmiumOreVeinEntity;
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

public class OsmiumOreVein extends OreVein {

    public OsmiumOreVein(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new OsmiumOreVeinEntity(ModBlockEntities.OSMIUM_ORE_VEIN_BLOCK_ENTITY.get(), pPos, pState);
    }
    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);

        Optional<Item> mekanismItem = Optional.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mekanism", "raw_osmium")));
        boolean found = false;

        if (mekanismItem.isPresent() && !found) {
            if (!mekanismItem.get().equals(Items.AIR)) {
                popResource(pLevel, pPos, new ItemStack(mekanismItem.get()));
                found = true;
            }
        }
        if (!found) {
            popResource(pLevel, pPos, new ItemStack(ModItems.RAW_OSMIUM.get()));
        }
    }

}
