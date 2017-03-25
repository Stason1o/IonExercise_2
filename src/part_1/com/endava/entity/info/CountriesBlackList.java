package part_1.com.endava.entity.info;

import part_1.com.endava.entity.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class CountriesBlackList {
    static private List<Country> supportedCountries;

    static {
        supportedCountries = new ArrayList<>();
        supportedCountries.add(new Country("Moldova", 20.5));
        supportedCountries.add(new Country("Romania", 10.4));
        supportedCountries.add(new Country("Italy", 40.3));
        supportedCountries.add(new Country("Belgrade", 10.4));
        supportedCountries.add(new Country("Russia", 50.3));
        supportedCountries.add(new Country("Ukraine", 11.2));
        supportedCountries.add(new Country("USA", 34.6));
    }

    public CountriesBlackList() {
    }

    public static List<Country> getSupportedCountries() {
        return supportedCountries;
    }

    public static void setSupportedCountries(List<Country> list) {
        supportedCountries.addAll(list);
    }

}
