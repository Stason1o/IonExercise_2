package part_1.com.endava.entity.base.implementation;

import part_1.com.endava.entity.base.Product;
import part_1.com.endava.entity.base.ProductionProduct;
import part_1.com.endava.entity.enums.Status;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class FurnitureImpl extends Product implements ProductionProduct{
    public FurnitureImpl() {
    }

    public FurnitureImpl(double price,
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
