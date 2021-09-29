package com.company.solvd.taxicompany.cars;

public class LORRY extends Car {
    private int weight;
    private int load;

    public LORRY(String model, int year, int passengers) {
        super(model, year, passengers);
        this.weight = weight;
        this.load = load;
    }

    public int getWeight (int weight) {
        return weight;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public int getLoad (int load) {
        return load;
    }
    public void setLoad (int load) {
        this.load = load;
    }
}
