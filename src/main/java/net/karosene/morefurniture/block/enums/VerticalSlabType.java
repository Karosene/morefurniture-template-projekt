package net.karosene.morefurniture.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum VerticalSlabType implements StringIdentifiable {
    HALF("half"),
    DOUBLE("double");

    private final String name;

    VerticalSlabType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}