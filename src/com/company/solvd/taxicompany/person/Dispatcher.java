package com.company.solvd.taxicompany.person;

public class Dispatcher extends Employee implements IDispatcher {


    public Dispatcher(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public void makeClientOrder() {

    }


}
