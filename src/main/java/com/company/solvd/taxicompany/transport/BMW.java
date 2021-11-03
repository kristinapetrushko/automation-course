package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.employee.Driver;

import java.util.Objects;

public class BMW extends Transport {
    private final String TYPE = "comfort";
    private String number;

    public BMW(String model, String number, double rate, Driver driver) {
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
        BMW bmw = (BMW) o;
        return Objects.equals(TYPE, bmw.TYPE) && Objects.equals(number, bmw.number) &&
                Objects.equals(getModel(), bmw.getModel()) && Objects.equals(getDriver(), bmw.getDriver());
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, number, getModel(), getDriver());
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + getModel() + '\'' +
                "TYPE='" + TYPE + '\'' +
                ", number='" + number + '\'' +
                ", driver=" + getDriver() +
                '}';
    }

}
