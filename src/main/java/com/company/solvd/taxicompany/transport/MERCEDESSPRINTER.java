package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.employee.Driver;

import java.util.Objects;

public class MERCEDESSPRINTER extends Transport {

    private final String TYPE = "econom";
    private String number;
    private String model;
    private Driver driver;

    public MERCEDESSPRINTER(String model, String number, double rate, Driver driver) {
        super(model, rate, driver);
        this.number = number;
        this.model = model;
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        MERCEDESSPRINTER that = (MERCEDESSPRINTER) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "MERCEDESSPRINTER{" +
                "model='" + model + '\'' +
                "TYPE='" + TYPE + '\'' +
                "number='" + number + '\'' +
                ", driver=" + driver +
                '}';
    }
}
