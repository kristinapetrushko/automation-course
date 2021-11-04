package com.company.solvd.taxicompany;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.person.employee.Dispatcher;
import com.company.solvd.taxicompany.transport.BMW;
import com.company.solvd.taxicompany.utils.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SalaryZeroException {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newNumbers = numbers.stream().filter(e -> e > 3).collect(Collectors.toList());
        LOGGER.info(numbers);
        LOGGER.info(newNumbers);



        LOGGER.info(Arrays.toString(TaxiPark.values()));

        IPrinter printerInfo = (s -> LOGGER.info(s));
        printerInfo.print("BMW");

        LOGGER.info(ClientUtil.sortClientByName(ClientUtil.createClientsList()));


        BMW X5 = (BMW) TransportUtil.createTransportMap().get("X5");
        Client client = ClientUtil.createClientsList().get(1);
        Dispatcher dispatcher = DispatcherUtil.createDispatcherList().get(1);
        dispatcher.setTransport(dispatcher.getTransport());
        dispatcher.setClient(client);


        LOGGER.info(client);
        LOGGER.info(dispatcher);
    }

}


