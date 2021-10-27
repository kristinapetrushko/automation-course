package com.company.solvd.taxicompany.exception;

public class SalaryZeroException extends Exception {
    public SalaryZeroException() {
        super("Salary should be greater than zero.");
    }

    public SalaryZeroException(String message) {
        super(message);
    }
}
