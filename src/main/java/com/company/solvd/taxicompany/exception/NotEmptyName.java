package com.company.solvd.taxicompany.exception;

public class NotEmptyName extends Exception {
    public NotEmptyName() {
        super("The name should not be empty");
    }
}
