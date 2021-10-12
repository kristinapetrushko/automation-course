package com.company.solvd.taxicompany.person;

public abstract class Person {

    private String name;

    public Person(String name, double salary) {
        this.name = name;
    }

    public Person(String name, String numberContact) {
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
