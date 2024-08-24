package net.fpr.factorocraft.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class FuelItem extends Item {
    public FuelItem(Properties properties) {
        super(properties);
    }

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 20000;
    }
}
