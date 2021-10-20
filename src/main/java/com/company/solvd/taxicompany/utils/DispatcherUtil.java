package com.company.solvd.taxicompany.utils;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.employee.Dispatcher;

import java.util.ArrayList;

public class DispatcherUtil {

    public static ArrayList<Dispatcher> createDispatcherList() throws SalaryZeroException {
        ArrayList<Dispatcher> dispatchers = new ArrayList<>();
        Dispatcher dispatcher = new Dispatcher("Vika", 30000.0);
        Dispatcher dispatcher1 = new Dispatcher("Tanya", 31000.0);
        dispatchers.add(dispatcher);
        dispatchers.add(dispatcher1);
        return dispatchers;
    }
}
