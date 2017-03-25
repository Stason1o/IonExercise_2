package part_1.com.endava.main;

import part_1.com.endava.entity.base.Product;
import part_1.com.endava.entity.enums.ProductType;
import part_1.com.endava.factory.OrdersFactory;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        OrdersFactory ordersFactory = new OrdersFactory();

        Product food = ordersFactory.createOrder(ProductType.FOOD, "Moldova", "Pete");
        Product furniture = ordersFactory.createOrder(ProductType.FURNITURE, "USA", "Valera");
        Product toys = ordersFactory.createOrder(ProductType.TOYS, "UK", "Anton");

        System.out.println(food);
        System.out.println(furniture);
        System.out.println(toys);
    }
}

