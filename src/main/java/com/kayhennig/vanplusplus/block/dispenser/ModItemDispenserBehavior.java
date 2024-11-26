package com.kayhennig.vanplusplus.block.dispenser;

import com.kayhennig.vanplusplus.ModItems;

import net.minecraft.block.DispenserBlock;

public class ModItemDispenserBehavior {
    public static void registerDefaults()
    {
        DispenserBlock.registerProjectileBehavior(ModItems.DYNAMITE);
    }
}
