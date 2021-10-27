package com.company.solvd.taxicompany.utils;

public enum TaxiPark {
    BMW(100, "X5"), DAEWOOLANOS(99, "SX"), MERCEDESSPRONTER(85,
            "16GRYS"),TOYOTA(105, "CAMRY"), VOLVO(53, "V40");

    private int quantiti;
    private String model;

    TaxiPark(int quantiti, String model) {
        this.quantiti = quantiti;
        this.model = model;
    }

    public int getQuantiti() {
        return quantiti;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "quantiti=" + quantiti +
                ", model='" + model + '\'' +
                '}';
    }
}
