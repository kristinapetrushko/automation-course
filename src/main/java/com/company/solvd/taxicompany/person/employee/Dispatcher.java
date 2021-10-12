package com.company.solvd.taxicompany.person.employee;

import com.company.solvd.taxicompany.person.utils.IDispatcher;
import com.company.solvd.taxicompany.person.utils.exception.SalaryZeroException;

public class Dispatcher extends Employee implements IDispatcher {


    private double salary;

    public Dispatcher(String name, double salary) throws SalaryZeroException {
        super(name, salary);
        if(salary<=0.0) {
            throw new SalaryZeroException("Salary should be greater than zero");
        }
        else {
            this.salary = salary;
        }
    }



    @Override
    public void makeClientOrder() {

    }


}

