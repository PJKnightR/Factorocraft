package net.fpr.factorocraft.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class NuclearFuelItem extends Item {
    public NuclearFuelItem(Properties properties) {
        super(properties);
    }

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 240000;
    }
}
