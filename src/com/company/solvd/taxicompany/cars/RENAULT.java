package com.company.solvd.taxicompany.cars;

import java.util.Objects;

public class RENAULT extends Car {
    private int color;

    public RENAULT(String model, int year, int passengers) {
        super(model, year, passengers);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RENAULT renault = (RENAULT) o;
        return color == renault.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "RENAULT{" +
                "model=" + getModel() +
                "year=" + getYear() +
                "passengers=" + getPassengers() +
                "color=" + color +
                '}';
    }
}
