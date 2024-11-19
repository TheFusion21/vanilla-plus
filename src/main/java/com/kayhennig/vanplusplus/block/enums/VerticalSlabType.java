package com.kayhennig.vanplusplus.block.enums;

import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.Direction;

public enum VerticalSlabType implements StringIdentifiable {
    NORTH("north"),
    SOUTH("south"),
    EAST("east"),
    WEST("west"),
    DOUBLE_NORTH("double_north"),
	DOUBLE_EAST("double_east");

    private final String name;

	private VerticalSlabType(final String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public String asString() {
		return this.name;
	}

	public static VerticalSlabType fromDirection(Direction direction) {
		return switch (direction) {
			case NORTH -> NORTH;
			case SOUTH -> SOUTH;
			case EAST -> EAST;
			case WEST -> WEST;
			default -> DOUBLE_NORTH;
		};
	}
}
