package net.architects.stormlightmod.entity.varient;

import java.util.Arrays;
import java.util.Comparator;

public enum CremlingVariant {
    DEFAULT(0),
    RED(1),
    BLUE(2),
    YELLOW(3),

    ;

    private static final CremlingVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CremlingVariant::getId)).toArray(CremlingVariant[]::new);
    private final int id;

    CremlingVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static CremlingVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
