package tech.bessam.reflection.util;

import java.lang.reflect.Field;

/**
 * @author bessam on 28/12/2020
 */

public class PrimaryKeyField {

    private Field primaryKey;

    public PrimaryKeyField(Field primaryKey) {

        this.primaryKey = primaryKey;
    }

    public String getName() {
        return primaryKey.getName();
    }

    public Class<?> getType() {
        return primaryKey.getType();
    }

}
