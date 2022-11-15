package net.architects.stormlightmod.entity.varient;

import java.util.Arrays;
import java.util.Comparator;

public enum SkyEelVariant {
    BLUE(0),
    LIGHT_BLUE(1),
    GREEN(2);

    private static final SkyEelVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SkyEelVariant::getId)).toArray(SkyEelVariant[]::new);
    private final int id;

    SkyEelVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SkyEelVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
