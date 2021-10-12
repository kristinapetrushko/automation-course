package com.company.solvd.taxicompany.person.client;

import com.company.solvd.taxicompany.person.utils.IClient;
import com.company.solvd.taxicompany.person.Person;
import com.company.solvd.taxicompany.transport.Trip;

public class Client extends Person implements IClient {

    private final String name;
    private String numberContact;
    private Trip trip;

    public Client(String name, String numberContact) throws IllegalArgumentException {
        super(name, numberContact);
        if(name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("The name should not be empty");
        }
        else {
            this.name = name;
        }
        this.numberContact = numberContact;
    }


    public String getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(String numberContact) {
        this.numberContact = numberContact;
    }

    @Override
    public String getName() {
        return name;
    }

    public Trip getTrip() {
        return trip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + getName() + '\'' +
                "numberContact=" + numberContact + '\'' +
                "trip=" + trip + '\'' +
                '}';
    }

    @Override
    public void numberContact() {

    }

    public void setTrip(Trip trip) {
        this.trip = trip;

    }


}