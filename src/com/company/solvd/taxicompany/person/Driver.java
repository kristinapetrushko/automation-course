public class Driver extends Employee {

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
}
