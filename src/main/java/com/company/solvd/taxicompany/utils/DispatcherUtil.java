package com.company.solvd.taxicompany.utils;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.person.employee.Dispatcher;
import com.company.solvd.taxicompany.transport.BMW;
import com.company.solvd.taxicompany.transport.TOYOTA;

import java.util.ArrayList;

public class DispatcherUtil {

    public static ArrayList<Dispatcher> createDispatcherList() throws SalaryZeroException {
        ArrayList<Dispatcher> dispatchers = new ArrayList<>();

        BMW X5 = (BMW) TransportUtil.createTransportMap().get("X5");
        TOYOTA CAMRY = (TOYOTA) TransportUtil.createTransportMap().get("CAMRY");

        Client client = ClientUtil.createClientsList().get(0);
        Client client1 = ClientUtil.createClientsList().get(1);


        Dispatcher dispatcher = new Dispatcher("Vika", 30000.0,X5, client);
        Dispatcher dispatcher1 = new Dispatcher("Tanya", 32000.0, CAMRY, client1);
        dispatchers.add(dispatcher);
        dispatchers.add(dispatcher1);
        return  dispatchers;

    }
}
