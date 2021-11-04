package com.company.solvd.taxicompany.utils;

import com.company.solvd.taxicompany.person.client.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientUtil {

    public static ArrayList<Client> createClientsList() {
        ArrayList<Client> clients = new ArrayList<>();
        Client client = new Client("Ira", "380952343785", "Maidan",
                "GolovnaSt", 5.0);
        Client client1 = new Client("Sergiy", "380502347652", "Sadgora",
                "KobulyanskaSt", 10.0);
        Client client2 = new Client("Andriy", "380506387615", "Depot",
                "Stasuka", 6.0);
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        return clients;
    }


    public static ArrayList<Client> sortClientByName(ArrayList<Client> clientArrayList) {
        return (ArrayList<Client>) clientArrayList.stream().sorted(Comparator.comparing(Client::getName))
                .collect(Collectors.toList());
    }
}