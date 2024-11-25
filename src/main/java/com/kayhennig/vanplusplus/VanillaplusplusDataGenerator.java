package com.kayhennig.vanplusplus;

import com.kayhennig.vanplusplus.datagen.ModBlockTagProvider;
import com.kayhennig.vanplusplus.datagen.ModItemTagProvider;
import com.kayhennig.vanplusplus.datagen.ModLootTableProvider;
import com.kayhennig.vanplusplus.datagen.ModModelProvider;
import com.kayhennig.vanplusplus.datagen.ModRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VanillaplusplusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModItemTagProvider::new);
	}
}
