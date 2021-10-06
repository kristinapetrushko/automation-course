public class Lehkovi extends Transport {

    private String mark;
    private int year;
    private int passengers;


    public Lehkovi(String model) {
        super(model);
        this.mark = mark;
        this.year = year;
        this.passengers = passengers;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}





