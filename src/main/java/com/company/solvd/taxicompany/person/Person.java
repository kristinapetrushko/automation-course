package com.company.solvd.taxicompany.person;

public abstract class Person {

    private String name;

    public Person(String name) throws IllegalArgumentException {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("The name should not be empty");
        } else {
            this.name = name;
        }
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
