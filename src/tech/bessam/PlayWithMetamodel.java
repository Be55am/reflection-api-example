package tech.bessam;

import tech.bessam.model.Person;
import tech.bessam.reflection.util.ColumnField;
import tech.bessam.reflection.util.Metamodel;
import tech.bessam.reflection.util.PrimaryKeyField;

import java.util.List;

/**
 * @author bessam on 28/12/2020
 */

public class PlayWithMetamodel {

    public static void main(String[] args) {

        Metamodel<Person> metamodel = Metamodel.of(Person.class);
        PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
        List<ColumnField> columnFields = metamodel.getColumns();

        System.out.println("Primary Key name = " + primaryKeyField.getName() + "  Primary key Type = " + primaryKeyField.getType().getSimpleName());
        System.out.println("Columns  : ");
        columnFields.forEach(columnField -> System.out.println("name : " + columnField.getName() + " Type : " + columnField.getType()));
    }
}
