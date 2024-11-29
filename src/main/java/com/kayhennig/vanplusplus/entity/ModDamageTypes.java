package com.kayhennig.vanplusplus.entity;

import com.kayhennig.vanplusplus.Vanillaplusplus;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModDamageTypes {
    public static final RegistryKey<DamageType> SPEAR = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(Vanillaplusplus.MOD_ID, "spear"));
}
