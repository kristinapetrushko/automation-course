package com.company.solvd.taxicompany.utils;

import java.util.HashMap;
import java.util.Map;

public class TransportUtil {
    public static Map<String, String> createTransportMap() {
        Map<String, String> createTransportMap = new HashMap<>();
        createTransportMap.put("X5", "BMW");
        createTransportMap.put("SX", "DAEWOOLANOS");
        createTransportMap.put("316GRYS", "MERCEDESSPRINTER");
        createTransportMap.put("CAMRY", "TOYOTA");
        createTransportMap.put("V40", "VOLVO");
        return createTransportMap;
    }
}
