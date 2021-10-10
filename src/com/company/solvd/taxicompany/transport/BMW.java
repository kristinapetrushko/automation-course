package com.company.solvd.taxicompany.transport;

import java.util.Objects;

public class BMW extends Lehkovi {
    private final String TYPE = "comfort";
    private String number;

    public BMW(String model, String number, double rate) {
        super(model, rate);
        this.number = number;

    }

    public String getTYPE() {
        return TYPE;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return number == bmw.number && Objects.equals(TYPE, bmw.TYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, number);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "TYPE='" + TYPE + '\'' +
                ", number=" + number +
                '}';
    }
}

