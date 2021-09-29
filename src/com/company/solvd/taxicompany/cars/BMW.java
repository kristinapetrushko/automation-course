package com.company.solvd.taxicompany.cars;

import java.util.Objects;

public class BMW extends Car {
    private int number;

    public BMW(String model, int year, int passengers) {
        super(model, year, passengers);
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return number == bmw.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model=" + getModel() +
                "year=" + getYear() +
                "passengers=" + getPassengers() +
                "number=" + number +
                '}';
    }
}
