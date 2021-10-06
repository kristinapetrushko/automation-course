import java.util.Objects;

public class VOLVO extends Lehkovi {

    private String econom;
    private int number;
    private int tarif;

    public VOLVO(String model) {
        super(model);
        this.econom = econom;
        this.number = number;
        this.tarif = tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VOLVO volvo = (VOLVO) o;
        return number == volvo.number && tarif == volvo.tarif && Objects.equals(econom, volvo.econom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(econom, number, tarif);
    }

    @Override
    public String toString() {
        return "VOLVO{" +
                "econom='" + econom + '\'' +
                ", number=" + number +
                ", tarif=" + tarif +
                '}';
    }
}
