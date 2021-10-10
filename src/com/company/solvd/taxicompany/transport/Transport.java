package com.company.solvd.taxicompany.transport;

public abstract class Transport {

    private String model;
    private double RATE_PER_KM;

    public Transport(String model, double RATE_PER_KM) {
        this.model = model;
        this.RATE_PER_KM = RATE_PER_KM;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getRATE_PER_KM() {
        return RATE_PER_KM;
    }

    public void setRATE_PER_KM(double RATE_PER_KM) {
        this.RATE_PER_KM = RATE_PER_KM;
    }
}
