package net.fpr.factorocraft.datagen;

import net.fpr.factorocraft.Factorocraft;
import net.fpr.factorocraft.block.ModBlocks;
import net.fpr.factorocraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Factorocraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Blocks.NEEDS_VEIN_BREAKER)
                .add(ModBlocks.COPPER_ORE_VEIN.get())
                .add(ModBlocks.IRON_ORE_VEIN.get())
                .add(ModBlocks.COAL_ORE_VEIN.get())
                .add(ModBlocks.TIN_ORE_VEIN.get())
                .add(ModBlocks.STONE_VEIN.get())
                .add(ModBlocks.LAPIS_ORE_VEIN.get())
                .add(ModBlocks.ZINC_ORE_VEIN.get())
                .add(ModBlocks.ALUMINUM_ORE_VEIN.get())
                .add(ModBlocks.RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.NETHER_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.END_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.AETHER_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.MOON_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.MARS_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.VENUS_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.GLACIO_RANDOMITE_ORE_VEIN.get())
                .add(ModBlocks.REDSTONE_ORE_VEIN.get())
                .add(ModBlocks.URANIUM_ORE_VEIN.get())
                .add(ModBlocks.GOLD_ORE_VEIN.get())
                .add(ModBlocks.LEAD_ORE_VEIN.get())
                .add(ModBlocks.LITHIUM_ORE_VEIN.get())
                .add(ModBlocks.NICKEL_ORE_VEIN.get())
                .add(ModBlocks.SILVER_ORE_VEIN.get())
                .add(ModBlocks.OSMIUM_ORE_VEIN.get())
                .add(ModBlocks.DIAMOND_ORE_VEIN.get())
                .add(ModBlocks.EMERALD_ORE_VEIN.get())
                .add(ModBlocks.TITANIUM_ORE_VEIN.get())
                .add(ModBlocks.PLATINUM_ORE_VEIN.get())
                .add(ModBlocks.TUNGSTEN_ORE_VEIN.get())
                .add(ModBlocks.IRIDIUM_ORE_VEIN.get())
                .add(ModBlocks.DESH_ORE_VEIN.get())
                .add(ModBlocks.OSTRUM_ORE_VEIN.get())
                .add(ModBlocks.CALORITE_ORE_VEIN.get())
                .add(ModBlocks.NETHERITE_ORE_VEIN.get())
                .add(ModBlocks.ENDERITE_ORE_VEIN.get());

        tag(ModTags.Blocks.INCORRECT_FOR_VEIN_BREAKER)
                .remove(ModTags.Blocks.NEEDS_VEIN_BREAKER);
    }
}
