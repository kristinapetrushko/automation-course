package com.company.solvd.taxicompany.utils;

import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.interfaces.IClient;
import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.person.employee.Dispatcher;
import com.company.solvd.taxicompany.transport.BMW;
import com.company.solvd.taxicompany.transport.Transport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class UserInterface {
    private static final Logger LOGGER = LogManager.getLogger(UserInterface.class);

    public static void letsGo() throws SalaryZeroException {
        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Welcome to our best Taxi Company!");
        LOGGER.info("Here is a list of our cars:");
        LOGGER.info(TransportUtil.createTransportMap().keySet());
        LOGGER.info("Please, choose a car - ");

        boolean isCarInList = false;
        String car = "";
        double yourPrice;
        double distanceInKm;

        while (!isCarInList) {
            car = scanner.nextLine();
            isCarInList = TransportUtil.createTransportMap().containsKey(car);
            if (!isCarInList)
                LOGGER.info("Please, choose car from our list");
        }

        Transport myCar = TransportUtil.createTransportMap().get(car);
        LOGGER.info("Your car - ");
        LOGGER.info(myCar);


        LOGGER.info("Please, enter where to submit a car - ");
        String starting = scanner.nextLine();
        LOGGER.info("Where will you go?");
        String destination = scanner.nextLine();
        LOGGER.info("Please, enter distance in Km");
        distanceInKm = Double.parseDouble(scanner.nextLine());
        Client client = ClientUtil.createClientsList().get(0);
        client.setDistanceInKm(distanceInKm);
        Dispatcher dispatcher = DispatcherUtil.createDispatcherList().get(0);
        yourPrice = dispatcher.getCalculatedPrice();

        LOGGER.info("From - ");
        LOGGER.info(starting);
        LOGGER.info("To - ");
        LOGGER.info(destination);
        LOGGER.info("Your trip price - " + yourPrice);
        LOGGER.info("Have a nice trip!");


        scanner.close();
    }
}
