import java.util.Objects;

public class DAEWOOLANOS extends Lehkovi {

    private String econom;
    private int number;
    private int tarif;

    public DAEWOOLANOS(String model) {
        super(model);
        this.econom = econom;
        this.number = number;
        this.tarif = tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DAEWOOLANOS that = (DAEWOOLANOS) o;
        return number == that.number && tarif == that.tarif && Objects.equals(econom, that.econom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(econom, number, tarif);
    }

    @Override
    public String toString() {
        return "DAEWOOLANOS{" +
                "econom='" + econom + '\'' +
                ", number=" + number +
                ", tarif=" + tarif +
                '}';
    }
}
