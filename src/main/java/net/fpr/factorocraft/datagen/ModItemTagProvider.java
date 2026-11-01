package net.fpr.factorocraft.datagen;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Factorocraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /*tag(ItemTags.PICKAXES)
                .add(ModItems.ORE_VEIN_BREAKER.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .remove(ModItems.ORE_VEIN_BREAKER.get());*/
        /*tag(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.ORE_VEIN_BREAKER.get());
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.ORE_VEIN_BREAKER.get());*/

    }
}
