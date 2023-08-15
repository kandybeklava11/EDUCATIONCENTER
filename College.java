import java.time.LocalDate;

public class College extends EDUCATIONCENTER{
    public College(String name, String locatedCountry, LocalDate locadateFoundAtionYear) {
        super(name, locatedCountry, locadateFoundAtionYear);
    }

    @Override
    public String getEducationType() {
        return null;
    }

    @Override
    public String toString() {
        return "College{}";
    }
}
