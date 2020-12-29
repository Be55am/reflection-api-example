package tech.bessam.reflection.util;

import java.lang.reflect.Field;

/**
 * @author bessam on 28/12/2020
 */

public class ColumnField {
    private Field field;

    public ColumnField(Field field) {

        this.field = field;
    }

    public String getName() {
        return field.getName();
    }

    public Class<?> getType() {

        return field.getType();
    }
}
