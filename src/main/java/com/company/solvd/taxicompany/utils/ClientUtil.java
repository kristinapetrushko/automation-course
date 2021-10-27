package com.company.solvd.taxicompany.utils;
import com.company.solvd.taxicompany.person.client.Client;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ClientUtil {

    public static ArrayList<Client> createClientsList() {
        ArrayList<Client> clients = new ArrayList<>();
        Client client = new Client("Ira", "380952343785", "Maidan",
                "GolovnaSt", 5.0);
        Client client1 = new Client("Sergiy", "380502347652", "Sadgora",
                "KobulyanskaSt", 10.0);
        clients.add(client);
        clients.add(client1);
        return clients;

    }

}