package com.company.solvd.taxicompany;

import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.person.employee.Driver;
import com.company.solvd.taxicompany.person.utils.exception.SalaryZeroException;
import com.company.solvd.taxicompany.transport.*;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Transport> createFullTransportList() {
        ArrayList<Transport> transports = new ArrayList<>();
        Transport BMW = new BMW ("X5","CE0700CX",100.0);
        Transport DAEWOOLANOS = new DAEWOOLANOS("SX", "CE9090CX", 70.0);
        Transport MERCEDESSPRINTER = new MERCEDESSPRINTER("316GRYS", "CE3567CX", 50.0);
        Transport TOYOTA = new TOYOTA("CAMRY", "CE0100CX", 100.0);
        Transport VOLVO = new VOLVO("V40", "CE7689CX", 70.0);
        transports.add(BMW);
        transports.add(DAEWOOLANOS);
        transports.add(MERCEDESSPRINTER);
        transports.add(TOYOTA);
        transports.add(VOLVO);
        return transports;
    }

    public static void main(String[] args) throws SalaryZeroException {
        BMW bmwX5 = new BMW ("X5","CE0700CX",150.0);
        Driver driverBMW = new Driver("Anton", 20000.0, bmwX5 );
        Client client = new Client( "Oksana","380959223789");
        Trip trip = new Trip("GolovnaSt", "Maidan", 5.0);
        client.setTrip(trip);
        trip.setDriver(driverBMW);

        System.out.println(client);
        System.out.println(trip);

    }

}
