import java.util.Objects;

public class BMW extends Lehkovi {
    private String comfort;
    private int number;
    private int tarif;

    public BMW(String model) {
        super(model);
        this.comfort = comfort;
        this.number = number;
        this.tarif = tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return number == bmw.number && tarif == bmw.tarif && Objects.equals(comfort, bmw.comfort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comfort, number, tarif);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "comfort='" + comfort + '\'' +
                ", number=" + number +
                ", tarif=" + tarif +
                '}';
    }
}

