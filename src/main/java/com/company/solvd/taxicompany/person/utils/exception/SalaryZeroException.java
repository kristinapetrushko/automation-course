package com.company.solvd.taxicompany.person.utils.exception;

public class SalaryZeroException extends Exception {
    public SalaryZeroException(String s) {
        super("Salary should be greater than zero.");
    }
}
