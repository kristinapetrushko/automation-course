package com.company.solvd.taxicompany.transport;

import java.util.Objects;

public class VOLVO extends Lehkovi {

    private final String TYPE = "econom";
    private String number;

    public VOLVO(String model, String number, double rate) {
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
        VOLVO volvo = (VOLVO) o;
        return Objects.equals(TYPE, volvo.TYPE) && Objects.equals(number, volvo.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE, number);
    }

    @Override
    public String toString() {
        return "VOLVO{" +
                "TYPE='" + TYPE + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}