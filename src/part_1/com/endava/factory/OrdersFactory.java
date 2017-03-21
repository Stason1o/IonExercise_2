package part_1.com.endava.factory;

import part_1.com.endava.entity.Country;
import part_1.com.endava.entity.User;
import part_1.com.endava.implementation.Furniture;
import part_1.com.endava.util.BlackList;
import part_1.com.endava.base.Product;
import part_1.com.endava.enums.Status;
import part_1.com.endava.implementation.Food;
import part_1.com.endava.implementation.Toys;
import part_1.com.endava.util.CountrySupport;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class OrdersFactory {

    public Product createOrder(String product, String country, String user, BlackList blackList, CountrySupport countrySupport){

        for (User userIterator: blackList.getBannedUsers()) {
            if (!userIterator.getName().equalsIgnoreCase(user)) {
                for (Country countryIterator : countrySupport.getSupportedCountries()) {
                    if (countryIterator.getName().equalsIgnoreCase(country)) {
                        if (product.equalsIgnoreCase("food")) {
                            return new Food(40, country, 10, 23.2, 43.2, Status.NEW);
                        } else if (product.equalsIgnoreCase("furniture")) {
                            return new Furniture(50, country, 15, 30.2, 76.2, Status.NEW);
                        } else if (product.equalsIgnoreCase("toys")) {
                            return new Toys(32.1, country, 21, 43.2, 54, Status.NEW);
                        } else {
                            System.out.println("Cannot create a delivery");
                            return null;
                        }
                    }
                }
                System.out.println("Country is not supported");
                return null;
            }

            System.out.println("User is in black list");
            return null;
        }
        return null;
    }
}
