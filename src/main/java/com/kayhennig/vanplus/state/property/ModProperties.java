package com.kayhennig.vanplus.state.property;

import com.kayhennig.vanplus.block.enums.VerticalSlabType;

import net.minecraft.state.property.EnumProperty;

public class ModProperties {
    public static final EnumProperty<VerticalSlabType> VERTICAL_SLAB_TYPE = EnumProperty.of("type", VerticalSlabType.class);
}
