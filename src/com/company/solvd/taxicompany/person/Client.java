package com.company.solvd.taxicompany.person;

public class Client extends Person implements IClient{

    private String numberContact;

    public Client(String name, String numberContact) {
        super(name, numberContact);
        this.numberContact = numberContact;
    }


    public String getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(String numberContact) {
        this.numberContact = numberContact;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numberContact=" + numberContact +
                '}';
    }

    @Override
    public void numberContact() {

    }
}
