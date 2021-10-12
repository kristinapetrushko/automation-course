package com.company.solvd.taxicompany.person.utils.exception;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String s) {
        super("The name should not be empty");
    }
}
