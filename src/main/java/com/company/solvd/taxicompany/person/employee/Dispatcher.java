package com.company.solvd.taxicompany.person.employee;

import com.company.solvd.taxicompany.interfaces.IDispatcher;
import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.transport.Transport;
import com.company.solvd.taxicompany.trip.Trip;

public class Dispatcher extends Employee implements IDispatcher {
    private Driver driver;
    private Client client;


    public Dispatcher(String name, double salary) throws SalaryZeroException {
        super(name, salary);

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getCalculatedPrice() {
        double ratePerKm = driver.getTransport().getRATE_PER_KM();
        double result = (client.getDistanceInKm() * ratePerKm);
        return result;
    }

    @Override
    public void makeClientOrder() {
        System.out.println("Where to submit the car?");
    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "name=" + getName() + '\'' +
                "client=" + client +
                "driver=" + driver +
                ", result price=" + getCalculatedPrice() +
                '}';
    }
}

