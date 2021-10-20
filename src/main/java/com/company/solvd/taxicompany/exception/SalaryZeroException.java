package com.company.solvd.taxicompany.exception;

public class SalaryZeroException extends Exception {
    public SalaryZeroException(String s) {
        super("Salary should be greater than zero.");
    }
}
