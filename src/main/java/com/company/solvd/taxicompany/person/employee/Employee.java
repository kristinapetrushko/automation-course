

package com.company.solvd.taxicompany.person.employee;

import com.company.solvd.taxicompany.person.Person;

public abstract class Employee extends Person {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}