import java.util.Objects;

public class TOYOTA extends Lehkovi {

    private String comfort;
    private int number;
    private int tarif;

    public TOYOTA(String model) {
        super(model);
        this.comfort = comfort;
        this.number = number;
        this.tarif = tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOYOTA toyota = (TOYOTA) o;
        return number == toyota.number && tarif == toyota.tarif && Objects.equals(comfort, toyota.comfort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comfort, number, tarif);
    }

    @Override
    public String toString() {
        return "TOYOTA{" +
                "comfort='" + comfort + '\'' +
                ", number=" + number +
                ", tarif=" + tarif +
                '}';
    }
}
