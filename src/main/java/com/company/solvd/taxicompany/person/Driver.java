package com.company.solvd.taxicompany.person;

import com.company.solvd.taxicompany.transport.Transport;

import java.util.Random;

public class Driver extends Employee implements IDriver {

    private Transport transport;
    private boolean isAvailible;

    public Driver(String name, double salary, Transport transport) {
        super(name, salary);
        this.transport = transport;
        Random rd = new Random();
        this.isAvailible = rd.nextBoolean();
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public boolean isAvailible() {
        return isAvailible;
    }

    public void setAvailible(boolean availible) {
        isAvailible = availible;
    }

    @Override
    public void talkToTheClient() {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "name=" + getName() + '\'' +
                "transport=" + transport + '\'' +
                ", isAvailible=" + isAvailible + '\'' +
                '}';
    }
}
