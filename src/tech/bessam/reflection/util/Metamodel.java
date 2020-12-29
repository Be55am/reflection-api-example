package tech.bessam.reflection.util;

import tech.bessam.reflection.annotation.Column;
import tech.bessam.reflection.annotation.PrimaryKey;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bessam on 28/12/2020
 */

public class Metamodel<T> {
    private Class<T> clss;

    public Metamodel(Class<T> clss) {
        this.clss = clss;

    }

    public static <T> Metamodel<T> of(Class<T> clss) {
        return new Metamodel<>(clss);
    }

    public PrimaryKeyField getPrimaryKey() {

        Field[] declaredFields = clss.getDeclaredFields();
        for (Field field : declaredFields) {
            PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
            if (primaryKey != null) {
                PrimaryKeyField primaryKeyField = new PrimaryKeyField(field);
                return primaryKeyField;
            }

        }
        throw new IllegalArgumentException("No Primary key found in class " + clss.getSimpleName());
    }

    public List<ColumnField> getColumns() {

        Field[] declaredFields = clss.getDeclaredFields();
        List<ColumnField> columnFields = new ArrayList<>();
        for (Field field : declaredFields) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
                ColumnField columnField = new ColumnField(field);
                columnFields.add(columnField);
            }
        }

        return columnFields;
    }
}
