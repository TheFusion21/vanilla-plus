package com.kayhennig.vanplusplus.component;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent FISH_SOUP = createStew(6).build();

    private static FoodComponent.Builder createStew(int hunger) {
		return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.6F).usingConvertsTo(Items.BOWL);
	}
}
