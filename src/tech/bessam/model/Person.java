package tech.bessam.model;

import tech.bessam.reflection.annotation.Column;
import tech.bessam.reflection.annotation.PrimaryKey;

/**
 * @author bessam on 28/12/2020
 */

public class Person {

    @PrimaryKey
    private long id;
    @Column
    private String name;
    @Column
    private int age;

    public Person() {
    }

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static Person of(long id, String name, int age) {
        return new Person(id, name, age);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
