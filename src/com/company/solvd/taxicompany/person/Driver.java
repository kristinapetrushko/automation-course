package com.company.solvd.taxicompany.person;

import com.company.solvd.taxicompany.transport.Transport;

public class Driver extends Employee implements IDriver {

    private Transport transport;

    public Driver(String name, String position, double salary, Transport transport) {
        super(name, position, salary);
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void talkToTheClient() {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                '}';
    }
}
