package com.company.solvd.taxicompany.person.employee;
import com.company.solvd.taxicompany.interfaces.IDispatcher;
import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.person.client.Client;
import com.company.solvd.taxicompany.transport.Transport;
import org.apache.log4j.Logger;


public class Dispatcher extends Employee implements IDispatcher {
    public static final Logger LOGGER = Logger.getLogger(Dispatcher.class);

    private Transport transport;
    private Client client;

    public Dispatcher(String name, double salary, Transport transport, Client client)
            throws SalaryZeroException {
        super(name, salary);
        this.transport = transport;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public double getCalculatedPrice() {
        double ratePerKm = transport.getRATE_PER_KM();
        double result = (client.getDistanceInKm() * ratePerKm);
        return result;
    }

    @Override
    public void makeClientOrder() {
        LOGGER.info("Where to submit the car?");
    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "name=" + getName() + '\'' +
                "client=" + client +
                "transport=" + transport +
                ", result price=" + getCalculatedPrice() +
                '}';
    }
}

