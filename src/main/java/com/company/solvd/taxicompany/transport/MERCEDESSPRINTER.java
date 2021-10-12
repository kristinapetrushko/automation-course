package com.company.solvd.taxicompany.transport;

import java.util.Objects;

public class MERCEDESSPRINTER extends Hruzovi {

    private String number;

    public MERCEDESSPRINTER(String model, String number, double RATE_PER_KM) {
        super(model, RATE_PER_KM);
        this.number = number;
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
                "number='" + number + '\'' +
                '}';
    }
}
