package net.fpr.factorocraft.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.fpr.factorocraft.util.ModTags;

public class ModToolTiers {
    public static final Tier VEIN_BREAKER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_VEIN_BREAKER,
            250, 4f, 0f, 10, () -> Ingredient.of(ModItems.ORE_VEIN_BREAKER));
}
