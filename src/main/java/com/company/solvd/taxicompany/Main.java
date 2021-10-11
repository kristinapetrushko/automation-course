package com.company.solvd.taxicompany;

import com.company.solvd.taxicompany.person.Client;
import com.company.solvd.taxicompany.person.Driver;
import com.company.solvd.taxicompany.transport.BMW;
import com.company.solvd.taxicompany.transport.Trip;

public class Main {
    public static void main(String[] args) {
        BMW bmwX5 = new BMW ("X5","CE0700CX",150.0);
        Driver driverBMW = new Driver("Anton", 100, bmwX5 );
        Client client = new Client("Kolya", "380959223789");
        Trip trip = new Trip("Che", "Migovo", 100.0);
        client.setTrip(trip);
        trip.setDriver(driverBMW);

        System.out.println(trip);
        System.out.println(client);

    }

}

