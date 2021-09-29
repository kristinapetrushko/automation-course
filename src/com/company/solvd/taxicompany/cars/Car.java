package com.company.solvd.taxicompany.cars;

public abstract class Car {
    private String model;
    private int year;
    private int passengers;

    public Car(String model, int year, int passengers) {
        this.model = model;
        this.year = year;
        this.passengers = passengers;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
}
