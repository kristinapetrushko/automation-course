package com.company.solvd.taxicompany.utils;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.employee.Driver;
import com.company.solvd.taxicompany.transport.Transport;

import java.util.ArrayList;

public class DriverUtil {

    public static ArrayList<Driver> createDriverList() throws SalaryZeroException {
        ArrayList<Driver> drivers = new ArrayList<>();
        Transport bmwX5 = null;
        Transport camry = null;
        Transport daewoolanos = null;
        Transport mercedessprinter = null;
        Transport volvo = null;
        Driver driverBMW = new Driver("Maks", 20000.0,bmwX5);
        Driver driverTOYOTA = new Driver("Oktavian", 25000.0,camry);
        Driver driverDAEWOOLANOS = new Driver("Katya", 27000.0, daewoolanos);
        Driver driverMERCEDESSPRINTER = new Driver("Andriy", 20000.0, mercedessprinter);
        Driver driverVOLVO = new Driver("Oleksandr", 24000.0, volvo);
        drivers.add(driverBMW);
        drivers.add(driverTOYOTA);
        drivers.add(driverDAEWOOLANOS);
        drivers.add(driverMERCEDESSPRINTER);
        drivers.add(driverVOLVO);
        return drivers;
    }
}
