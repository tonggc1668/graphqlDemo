package com.example.graphql.entities;

import com.example.graphql.enums.Animal;

public class PetInput {

    private String name;

    private Animal type;

    private int age;

    public PetInput(String name, Animal type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public PetInput() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}