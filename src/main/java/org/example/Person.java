package org.example;

import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    private Animal animal;
    private String name;
    private int age;

    public Person() {
    }

    public Person(@Qualifier("horse") Animal animal) {
        this.animal = animal;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfoAnimal() {
        animal.animalPlus();
        animal.animalMinus();
    }


    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
