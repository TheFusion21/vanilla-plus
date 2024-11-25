package com.kayhennig.vanplusplus.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class DynamiteRecipeSerializer extends SpecialRecipeSerializer<DynamiteRecipe> {
    public static final DynamiteRecipeSerializer INSTANCE = register("dynamite", new DynamiteRecipeSerializer());
    public DynamiteRecipeSerializer() {
        super(DynamiteRecipe::new);
    }

    static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String id, S serializer) {
		return Registry.register(Registries.RECIPE_SERIALIZER, id, serializer);
	}

    public static void initialize() {
        // NO-OP
    }
}