package part_1.com.endava.implementation;

import part_1.com.endava.enums.Status;
import part_1.com.endava.base.Product;
import part_1.com.endava.base.ProductionProduct;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class Toys extends Product implements ProductionProduct{

    public Toys() {
    }

    public Toys(double price,
                String countryToDeliver,
                int count,
                double weight,
                double deliveryPrice,
                Status statusOfDelivery) {
        super(price, countryToDeliver, count, weight, deliveryPrice, statusOfDelivery);
    }

    @Override
    public void printInfo() {
        super.toString();
    }
}
