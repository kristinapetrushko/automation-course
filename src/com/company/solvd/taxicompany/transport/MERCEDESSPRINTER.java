import java.util.Objects;

public class MERCEDESSPRINTER extends Hruzovi {

    private int number;
    private int tarif;

    public MERCEDESSPRINTER(String model) {
        super(model);
        this.number = number;
        this.tarif = tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MERCEDESSPRINTER that = (MERCEDESSPRINTER) o;
        return number == that.number && tarif == that.tarif;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, tarif);
    }

    @Override
    public String toString() {
        return "MERCEDESSPRINTER{" +
                "number=" + number +
                ", tarif=" + tarif +
                '}';
    }
}
