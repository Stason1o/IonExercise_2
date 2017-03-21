package part_1.com.endava.main;

import part_1.com.endava.base.Product;
import part_1.com.endava.factory.OrdersFactory;
import part_1.com.endava.util.BlackList;
import part_1.com.endava.util.CountrySupport;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        BlackList blackList = new BlackList();
        CountrySupport countrySupport = new CountrySupport();

        OrdersFactory ordersFactory = new OrdersFactory();

        Product food = ordersFactory.createOrder("food", "Moldova", "Pete", blackList, countrySupport);
        Product furniture = ordersFactory.createOrder("furniture", "USA", "Valera", blackList, countrySupport);
        Product toys = ordersFactory.createOrder("toy", "UK", "Anton", blackList, countrySupport);

        System.out.println(food);
        System.out.println(furniture);
        System.out.println(toys);
    }
}

