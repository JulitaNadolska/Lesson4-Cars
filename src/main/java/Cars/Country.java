package Cars;

public class Country {
    public String countryName;
    public char countryCode;

    public Country(String countryName, char countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountryCode() {
        return countryCode;
    }
}