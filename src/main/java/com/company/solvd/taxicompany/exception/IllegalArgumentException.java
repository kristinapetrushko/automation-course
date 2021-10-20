package com.company.solvd.taxicompany.exception;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String s) {
        super("The name should not be empty");
    }
}
