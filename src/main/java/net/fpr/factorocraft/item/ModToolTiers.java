package net.fpr.factorocraft.item;

import net.fpr.factorocraft.Factorocraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.fpr.factorocraft.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier VEIN_BREAKER = TierSortingRegistry.registerTier(
            new ForgeTier(4, 250, 4f, 0f, 10,
                    ModTags.Blocks.NEEDS_VEIN_BREAKER, () -> Ingredient.of(ModItems.ORE_VEIN_BREAKER.get())),
            new ResourceLocation(Factorocraft.MOD_ID, "ore_vein_breaker"), List.of(Tiers.DIAMOND), List.of());
}
