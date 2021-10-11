package com.company.solvd.taxicompany.person;

import com.company.solvd.taxicompany.transport.Trip;

public class Client extends Person implements IClient{

    private final String name;
    private String numberContact;
    private Trip trip;

    public Client(String name, String numberContact) {
        super(name, numberContact);
        this.name = name;
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
