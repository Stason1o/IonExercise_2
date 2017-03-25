package part_1.com.endava.factory;

import part_1.com.endava.entity.Country;
import part_1.com.endava.entity.User;
import part_1.com.endava.entity.base.implementation.FurnitureImpl;
import part_1.com.endava.entity.info.UsersBlackList;
import part_1.com.endava.entity.base.Product;
import part_1.com.endava.entity.enums.ProductType;
import part_1.com.endava.entity.enums.Status;
import part_1.com.endava.entity.base.implementation.FoodImpl;
import part_1.com.endava.entity.base.implementation.ToysImpl;
import part_1.com.endava.entity.info.CountriesBlackList;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class OrdersFactory {

    public Product createOrder(ProductType product, String country, String user){

        for (User userIterator: UsersBlackList.getBannedUsers()) {
            if (!userIterator.getName().equalsIgnoreCase(user)) {
                for (Country countryIterator : CountriesBlackList.getSupportedCountries()) {
                    if (countryIterator.getName().equalsIgnoreCase(country)) {
                        if (product == ProductType.FOOD) {
                            System.out.println("Creating new " + ProductType.FOOD + " order..");
                            return new FoodImpl(40, country, 10, 23.2, 43.2, Status.NEW);
                        } else if (product == ProductType.FURNITURE) {
                            System.out.println("Creating new " + ProductType.FURNITURE + " order..");
                            return new FurnitureImpl(50, country, 15, 30.2, 76.2, Status.NEW);
                        } else if (product == ProductType.TOYS) {
                            System.out.println("Creating new " + ProductType.TOYS + " order..");
                            return new ToysImpl(32.1, country, 21, 43.2, 54, Status.NEW);
                        } else {
                            System.out.println("Creating new order...");
                            System.out.println("Cannot create a new order");
                            return null;
                        }
                    }
                }
                System.out.println("Country is not supported for creating new order");
                return null;
            }
            System.out.println("User is in black list and cannot create the new order");
            return null;
        }
        return null;
    }
}
