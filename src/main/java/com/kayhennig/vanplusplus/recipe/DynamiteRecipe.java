package com.kayhennig.vanplusplus.recipe;

import com.kayhennig.vanplusplus.ModItems;
import com.kayhennig.vanplusplus.component.ModDataComponentTypes;
import com.kayhennig.vanplusplus.item.DynamiteItem;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.recipe.input.CraftingRecipeInput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;

public class DynamiteRecipe extends SpecialCraftingRecipe  {

    public DynamiteRecipe(CraftingRecipeCategory craftingRecipeCategory) {
		super(craftingRecipeCategory);
	}

    public boolean matches(CraftingRecipeInput craftingRecipeInput, World world) {
        // the recipe requires at least 1 gunpowder, 1 sand and 1 string
        int hasGunpowder = 0;
        int hasSand = 0;
        int hasString = 0;

        for (int i = 0; i < craftingRecipeInput.getSize(); i++) {
            ItemStack itemStack = craftingRecipeInput.getStackInSlot(i);
            if (!itemStack.isEmpty()) {
                if (Ingredient.ofItems(Items.GUNPOWDER).test(itemStack)) {
                    hasGunpowder++;
                } else if (Ingredient.ofItems(Items.SAND).test(itemStack)) {
                    hasSand++;
                } else if (Ingredient.ofItems(Items.STRING).test(itemStack)) {
                    hasString++;
                }
            }
        }

        return hasGunpowder > 0 && hasGunpowder <= 3 && hasSand == 1 && hasString == 1;
    }

    public ItemStack craft(CraftingRecipeInput craftingRecipeInput, RegistryWrapper.WrapperLookup wrapperLookup) {
        int i = 0;

        for (int j = 0; j < craftingRecipeInput.getSize(); j++) {
            ItemStack itemStack = craftingRecipeInput.getStackInSlot(j);
            if (!itemStack.isEmpty()) {
                if (Ingredient.ofItems(Items.GUNPOWDER).test(itemStack)) {
                    i++;
                }
            }
        }

        ItemStack itemStack2 = new ItemStack(ModItems.DYNAMITE, 2);
        itemStack2.set(ModDataComponentTypes.FUSE_TIME, DynamiteItem.FUSE_TIMES[i - 1]);
        return itemStack2;
    }

    @Override
	public boolean fits(int width, int height) {
		return width * height >= 2;
	}

	@Override
	public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
		return new ItemStack(ModItems.DYNAMITE);
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return DynamiteRecipeSerializer.INSTANCE;
	}
}
