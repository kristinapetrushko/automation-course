package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.employee.Driver;

import java.util.Objects;

public class TOYOTA extends Transport {

    private final String TYPE = "comfort";
    private String number;

    public TOYOTA(String model, String number, double rate, Driver driver) {
        super(model, rate, driver);
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
        TOYOTA toyota = (TOYOTA) o;
        return number == toyota.number && Objects.equals(TYPE, toyota.TYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, number);
    }

    @Override
    public String toString() {
        return "TOYOTA{" +
                "model='" + getModel() + '\'' +
                "TYPE='" + TYPE + '\'' +
                ", number=" + number +
                ", driver=" + getDriver() +
                '}';
    }
}
