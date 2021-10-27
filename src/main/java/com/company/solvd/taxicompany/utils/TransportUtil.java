package com.company.solvd.taxicompany.utils;
import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.employee.Driver;
import com.company.solvd.taxicompany.transport.*;
import java.util.HashMap;
import java.util.Map;

public class TransportUtil {
    public static Map<String, Transport> createTransportMap() throws SalaryZeroException {
        Map<String, Transport> createTransportMap = new HashMap<>();

        Driver driver = DriverUtil.createDriverList().get(0);
        Driver driver1 = DriverUtil.createDriverList().get(1);
        Driver driver2 = DriverUtil.createDriverList().get(2);
        Driver driver3 = DriverUtil.createDriverList().get(3);
        Driver driver4 = DriverUtil.createDriverList().get(4);

        createTransportMap.put("X5", new BMW("X5", "CE9999CX", 100.0,driver));
        createTransportMap.put("SX", new DAEWOOLANOS("SX", "CE9090CX", 70.0, driver1));
        createTransportMap.put("316GRYS", new MERCEDESSPRINTER("316GRYS", "CE3567CX", 50.0,
                driver2));
        createTransportMap.put("CAMRY", new TOYOTA("CAMRY", "CE0100CX", 100.0, driver3));
        createTransportMap.put("V40", new VOLVO("V40", "CE7689CX", 70.0, driver4));
        return createTransportMap;
    }
}
