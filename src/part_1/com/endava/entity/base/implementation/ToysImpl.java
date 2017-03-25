package part_1.com.endava.entity.base.implementation;

import part_1.com.endava.entity.enums.Status;
import part_1.com.endava.entity.base.Product;
import part_1.com.endava.entity.base.ProductionProduct;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class ToysImpl extends Product implements ProductionProduct{

    public ToysImpl() {
    }

    public ToysImpl(double price,
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
