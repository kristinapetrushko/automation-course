package com.company.solvd.taxicompany.utils;

import org.apache.log4j.Logger;

import java.util.function.Supplier;

public class Lambda1 {
    public static final Logger LOGGER = Logger.getLogger(Lambda1.class);

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random()*10);
        LOGGER.info(supplier.get());
    }
}
