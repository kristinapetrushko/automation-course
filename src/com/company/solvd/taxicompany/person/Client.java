public class Client extends Person {

    private int numberContact;

    public Client(String name, int numberContact) {
        super(name);
        this.numberContact = numberContact;
    }

    public int getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(int numberContact) {
        this.numberContact = numberContact;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numberContact=" + numberContact +
                '}';
    }
}
