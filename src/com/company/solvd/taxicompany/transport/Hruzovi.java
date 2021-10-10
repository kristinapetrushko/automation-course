package com.company.solvd.taxicompany.transport;

public abstract class Hruzovi extends Transport {

    private int weight;
    private int width;
    private int height;

    public Hruzovi(String model, double RATE_PER_KM) {
        super(model, RATE_PER_KM);
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
