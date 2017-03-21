package part_1.com.endava.util;

import part_1.com.endava.entity.Country;

import java.util.Arrays;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class CountrySupport {
    Country[] supportedCountries;
    Country[] unsupportedCountries;

    public CountrySupport() {
        this.supportedCountries = new Country[]{
                new Country("Moldova", 20.5),
                new Country("Romania", 10.4),
                new Country("Italy", 40.3),
                new Country("Belgrade", 10.4)
        };

        this.unsupportedCountries = new Country[]{
                new Country("Russia", 50.3),
                new Country("Ukraine", 11.2),
                new Country("USA", 34.6)
        };
    }

    public CountrySupport(Country[] supportedCountries, Country[] unsupportedCountries) {
        this.supportedCountries = supportedCountries;
        this.unsupportedCountries = unsupportedCountries;
    }

    public Country[] getUnsupportedCountries() {
        return unsupportedCountries;
    }

    public void setUnsupportedCountries(Country[] unsupportedCountries) {
        this.unsupportedCountries = unsupportedCountries;
    }

    public Country[] getSupportedCountries() {
        return supportedCountries;
    }

    public void setSupportedCountries(Country[] supportedCountries) {
        this.supportedCountries = supportedCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountrySupport that = (CountrySupport) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(supportedCountries, that.supportedCountries)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(unsupportedCountries, that.unsupportedCountries);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(supportedCountries);
        result = 31 * result + Arrays.hashCode(unsupportedCountries);
        return result;
    }

    @Override
    public String toString() {
        return "CountrySupport{" +
                "supportedCountries=" + Arrays.toString(supportedCountries) +
                ", unsupportedCountries=" + Arrays.toString(unsupportedCountries) +
                '}';
    }
}
