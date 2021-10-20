package com.company.solvd.taxicompany;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.person.employee.Dispatcher;
import com.company.solvd.taxicompany.person.employee.Driver;
import com.company.solvd.taxicompany.transport.BMW;
import com.company.solvd.taxicompany.trip.Trip;
import com.company.solvd.taxicompany.utils.ClientUtil;
import com.company.solvd.taxicompany.utils.DispatcherUtil;
import com.company.solvd.taxicompany.utils.TransportUtil;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SalaryZeroException {
        BMW bmwX5 = new BMW("X5", "CE9999CX", 100.0);
        Driver driverBMW = new Driver("Maks", 20000.0, bmwX5);
        Client client = ClientUtil.createClientsList().get(1);
        Dispatcher dispatcher = DispatcherUtil.createDispatcherList().get(1);
        dispatcher.setDriver(driverBMW);
        dispatcher.setClient(client);


        System.out.println(client);
        System.out.println(dispatcher);


    }


}


