package net.fpr.factorocraft.event;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.entity.custom.*;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = Factorocraft.MOD_ID)
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onBreak(BlockEvent.BreakEvent event) {

            BlockEntity blockEntity = event.getWorld().getBlockEntity(event.getPos());
            if (blockEntity instanceof OreVeinEntity) {
                //creative mode only can destroy the blocks
                if (!event.getPlayer().isCreative()) {
                    event.setCanceled(true);
                    event.getWorld().removeBlock(blockEntity.getBlockPos(), false);
                    event.getWorld().setBlock(blockEntity.getBlockPos(), blockEntity.getBlockState(), 2);

                    //In case I do make the ore veins finite
                    /*if (oreVein.getOreAmount() >= 1) {
                    //oreVein.setOreAmount(oreVein.getOreAmount());
                    //oreVein.setOreAmount(oreVein.getOreAmount() - 1);
                    //To-do: Drop Raw Ore (player or machine)
                    //event.setCanceled(true);
                    }*/

                    if (blockEntity instanceof CopperOreVeinEntity) {
                        ((CopperOreVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(Items.RAW_COPPER));
                    } else if (blockEntity instanceof IronOreVeinEntity) {
                        ((IronOreVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(Items.RAW_IRON));
                    } else if (blockEntity instanceof CoalOreVeinEntity) {
                        ((CoalOreVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(Items.COAL));
                    } else if (blockEntity instanceof RedstoneOreVeinEntity) {
                        ((RedstoneOreVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(Items.REDSTONE));
                    } else if (blockEntity instanceof UraniumOreVeinEntity) {
                        ((UraniumOreVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(ModItems.RAW_URANIUM.get()));
                    } else if (blockEntity instanceof TinOreVeinEntity) {
                        ((TinOreVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(ModItems.RAW_TIN.get()));
                    } else if (blockEntity instanceof StoneVeinEntity) {
                        ((StoneVeinEntity) blockEntity).dropItem((Level) event.getWorld(), new ItemStack(ModItems.STONE_CHUNK.get()));
                    }
                }
            }
        }
    }
}
