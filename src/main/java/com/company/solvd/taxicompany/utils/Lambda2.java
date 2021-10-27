package com.company.solvd.taxicompany.utils;

import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class Lambda2 {
    public static final Logger LOGGER = Logger.getLogger(Lambda2.class);

    public static void main(String[] args) {
        UnaryOperator<String> BMW = s -> s.toUpperCase();
        LOGGER.info(BMW.apply("X5"));
    }
}
