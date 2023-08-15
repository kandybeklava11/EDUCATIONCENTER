import java.time.LocalDate;

public abstract class EDUCATIONCENTER {
    private String name;
    private String LocatedCountry;
    private LocalDate LocadateFoundAtionYear;

    public EDUCATIONCENTER(String name, String locatedCountry, LocalDate locadateFoundAtionYear) {
        this.name = name;
        LocatedCountry = locatedCountry;
        LocadateFoundAtionYear = locadateFoundAtionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return LocatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        LocatedCountry = locatedCountry;
    }

    public LocalDate getLocadateFoundAtionYear() {
        return LocadateFoundAtionYear;
    }

    public void setLocadateFoundAtionYear(LocalDate locadateFoundAtionYear) {
        LocadateFoundAtionYear = locadateFoundAtionYear;
    }
     public abstract String getEducationType();

    @Override
    public String toString() {
        return "EDUCATIONCENTER{" +
                "name='" + name + '\'' +
                ", LocatedCountry='" + LocatedCountry + '\'' +
                ", LocadateFoundAtionYear=" + LocadateFoundAtionYear +
                '}';
    }
}
