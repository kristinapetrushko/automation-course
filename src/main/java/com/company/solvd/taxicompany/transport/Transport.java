package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.employee.Driver;

public abstract class Transport {

    private String model;
    private double RATE_PER_KM;
    private Driver driver;

    public Transport(String model, double RATE_PER_KM, Driver driver) {
        this.model = model;
        this.RATE_PER_KM = RATE_PER_KM;
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

    public double getRATE_PER_KM() {
        return RATE_PER_KM;
    }

    public void setRATE_PER_KM(double RATE_PER_KM) {
        this.RATE_PER_KM = RATE_PER_KM;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", driver=" + driver +
                ", RATE_PER_KM=" + RATE_PER_KM +
                '}';
    }
}

