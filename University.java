import java.time.LocalDate;

public class University extends EDUCATIONCENTER{
    public University(String name, String locatedCountry, LocalDate locadateFoundAtionYear) {
        super(name, locatedCountry, locadateFoundAtionYear);
    }

    @Override
    public String getEducationType() {
        return "University";
    }
}
