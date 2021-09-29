package com.company.solvd.taxicompany.cars.personnel;

public class Dispatcher extends Person {
    private String workTime;

    public Dispatcher(String FIO, int age, String education) {
        super(FIO, age, education);
        this.workTime = workTime;
    }

    public String getWorkTime () {
        return workTime;
    }

    public void setWorkTime (String workTime) {
        this.workTime = workTime;
    }
}
