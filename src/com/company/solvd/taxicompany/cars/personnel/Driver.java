package com.company.solvd.taxicompany.cars.personnel;

public class Driver extends Person {
    private int numberDriver;
    private int salary;


    public Driver(String FIO, int age, String education) {
        super(FIO, age, education);
        this.numberDriver = numberDriver;
        this.salary = salary;
    }

    public int getNumberDriver (){
        return numberDriver;
    }

    public void setNumberDriver (int numberDriver) {
        this.numberDriver = numberDriver;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }
}
