import java.time.LocalDate;

public class School extends EDUCATIONCENTER {

    public School(String name, String locatedCountry, LocalDate locadateFoundAtionYear) {
        super(name, locatedCountry, locadateFoundAtionYear);
    }

    @Override
    public String getEducationType() {
        return null;
    }

    @Override
    public String toString() {
        return "School{}";
    }
}
