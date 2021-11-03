package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.employee.Driver;

import java.util.Objects;

public class DAEWOOLANOS extends Transport {

    private final String TYPE = "econom";
    private String number;

    public DAEWOOLANOS(String model, String number, double rate, Driver driver) {
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
        DAEWOOLANOS that = (DAEWOOLANOS) o;
        return Objects.equals(TYPE, that.TYPE) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, number);
    }

    @Override
    public String toString() {
        return "DAEWOOLANOS{" +
                "model='" + getModel() + '\'' +
                "TYPE='" + TYPE + '\'' +
                ", number='" + number + '\'' +
                ", driver=" + getDriver() +
                '}';
    }
}
