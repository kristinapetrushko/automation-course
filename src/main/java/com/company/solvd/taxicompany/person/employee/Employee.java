

package com.company.solvd.taxicompany.person.employee;

import com.company.solvd.taxicompany.person.Person;
import com.company.solvd.taxicompany.exception.SalaryZeroException;

public abstract class Employee extends Person {

    private double salary;

    public Employee(String name, double salary) throws SalaryZeroException {
        super(name);
        if (salary <= 0.0) {
            throw new SalaryZeroException("Salary should be greater than zero");
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}