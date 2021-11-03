package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.employee.Driver;

import java.util.Objects;

public class MERCEDESSPRINTER extends Transport {

    private final String TYPE = "econom";
    private String number;

    public MERCEDESSPRINTER(String model, String number, double rate, Driver driver) {
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
                "model='" + getModel() + '\'' +
                "TYPE='" + TYPE + '\'' +
                "number='" + number + '\'' +
                ", driver=" + getDriver() +
                '}';
    }
}
