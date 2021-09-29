package com.company.solvd.taxicompany.cars;

import java.util.Objects;

public class TOYOTA extends Car {
    private int fuel;

    public TOYOTA(String model, int year, int passengers) {
        super(model, year, passengers);
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOYOTA toyota = (TOYOTA) o;
        return fuel == toyota.fuel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuel);
    }

    @Override
    public String toString() {
        return "TOYOTA{" +
                "model=" + getModel() +
                "year=" + getYear() +
                "passengers=" + getPassengers() +
                "fuel=" + fuel +
                '}';
    }
}
