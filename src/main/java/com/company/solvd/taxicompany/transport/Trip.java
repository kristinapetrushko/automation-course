package com.company.solvd.taxicompany.transport;

import com.company.solvd.taxicompany.person.Client;
import com.company.solvd.taxicompany.person.Driver;

public class Trip {

    private String starting;
    private String destination;
    private double  distanceInKm;
    private Driver driver;



    public Trip(String starting, String destination, double distanceInKm) {
        this.starting = starting;
        this.destination = destination;
        this.distanceInKm = distanceInKm;

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
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



    public double getCalculatedPrice() {
        double ratePerKm = driver.getTransport().getRATE_PER_KM();
        double result = (getDistanceInKm() * ratePerKm);
        return result;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "starting='" + starting + '\'' +
                ", destination='" + destination + '\'' +
                ", distanceInKm='" + distanceInKm + '\'' +
                ", result price=" + getCalculatedPrice() +
                ", driver=" + driver +
                '}';
    }


}
