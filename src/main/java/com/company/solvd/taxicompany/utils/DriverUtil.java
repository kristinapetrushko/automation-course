package com.company.solvd.taxicompany.utils;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.employee.Driver;
import com.company.solvd.taxicompany.transport.Transport;

import java.util.ArrayList;

public class DriverUtil {

    public static ArrayList<Driver> createDriverList() throws SalaryZeroException {
        ArrayList<Driver> drivers = new ArrayList<>();
        Driver driver = new Driver("Maks", 20000.0);
        Driver driver1 = new Driver("Oktavian", 25000.0);
        Driver driver2 = new Driver("Katya", 27000.0);
        Driver driver3 = new Driver("Andriy", 20000.0);
        Driver driver4 = new Driver("Oleksandr", 24000.0);
        drivers.add(driver);
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        return drivers;
    }
}
