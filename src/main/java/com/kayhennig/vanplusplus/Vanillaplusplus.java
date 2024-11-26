package com.kayhennig.vanplusplus;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kayhennig.vanplusplus.block.dispenser.ModItemDispenserBehavior;
import com.kayhennig.vanplusplus.block.entity.ModBlockEntityType;
import com.kayhennig.vanplusplus.item.ModItemGroups;
import com.kayhennig.vanplusplus.recipe.DynamiteRecipeSerializer;

public class Vanillaplusplus implements ModInitializer {
	public static final String MOD_ID = "vanilla-plus-plus";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerItems();
		ModItemGroups.initialize();
        ModBlockEntityType.initialize();
        DynamiteRecipeSerializer.initialize();
        ModItemDispenserBehavior.registerDefaults();
	}

}