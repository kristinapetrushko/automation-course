package com.company.solvd.taxicompany.person.client;
import com.company.solvd.taxicompany.interfaces.IClient;
import com.company.solvd.taxicompany.person.Person;
import com.company.solvd.taxicompany.person.employee.Dispatcher;


public class Client extends Person implements IClient {

    private String numberContact;
    private Dispatcher dispatcher;
    private String starting;
    private String destination;
    private double distanceInKm;

    public Client(String name, String numberContact, String starting, String destination, double distanceInKm) {
        super(name);
        this.numberContact = numberContact;
        this.starting = starting;
        this.destination = destination;
        this.distanceInKm = distanceInKm;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public String getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(String numberContact) {
        this.numberContact = numberContact;
    }

    public String getStarting() {
        return starting;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void enterNumberContact() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "name=" + getName() + '\'' +
                "numberContact=" + numberContact + '\'' +
                ", starting='" + starting + '\'' +
                ", destination='" + destination + '\'' +
                ", distanceInKm=" + distanceInKm +
                '}';
    }

}