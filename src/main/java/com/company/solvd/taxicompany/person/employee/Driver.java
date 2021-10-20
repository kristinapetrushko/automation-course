package com.company.solvd.taxicompany.person.employee;

import com.company.solvd.taxicompany.interfaces.IDriver;
import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.transport.Transport;
import org.apache.commons.lang3.RandomUtils;

public class Driver extends Employee implements IDriver {

    private Transport transport;
    private boolean isAvailible;

    public Driver(String name, double salary, Transport transport) throws SalaryZeroException {
        super(name, salary);
        this.transport = transport;
        this.isAvailible = RandomUtils.nextBoolean();
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
        System.out.println("Let`s go?");

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