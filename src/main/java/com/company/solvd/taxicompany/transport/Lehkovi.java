package com.company.solvd.taxicompany.transport;

public abstract class Lehkovi extends Transport {

    private String mark;
    private int year;
    private int passengers;

    public Lehkovi(String model, double RATE_PER_KM) {
        super(model, RATE_PER_KM);
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}





