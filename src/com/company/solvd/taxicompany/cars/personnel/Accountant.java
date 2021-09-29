package com.company.solvd.taxicompany.cars.personnel;

public class Accountant extends Person {
    private String workedHours;

    public Accountant(String FIO, int age, String education) {
        super(FIO, age, education);
        this.workedHours = workedHours;
    }

    public String getWorkedHours () {
        return workedHours;
    }

    public void setWorkedHours (String workedHours); {
        this.workedHours = workedHours;
    }

}
