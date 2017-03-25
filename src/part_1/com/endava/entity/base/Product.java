package part_1.com.endava.entity.base;

import part_1.com.endava.entity.enums.Status;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public abstract class Product {
    protected double price;
    protected String countryToDeliver;
    protected int count;
    protected double weight;
    protected double deliveryPrice;
    protected Status statusOfDelivery;

    public Product() {
    }

    public Product(double price,
                   String countryToDeliver,
                   int count,
                   double weight,
                   double deliveryPrice,
                   Status statusOfDelivery) {
        this.price = price;
        this.countryToDeliver = countryToDeliver;
        this.count = count;
        this.weight = weight;
        this.weight = weight;
        this.deliveryPrice = deliveryPrice;
        this.statusOfDelivery = statusOfDelivery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountryToDeliver() {
        return countryToDeliver;
    }

    public void setCountryToDeliver(String countryToDeliver) {
        this.countryToDeliver = countryToDeliver;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Status getStatusOfDelivery() {
        return statusOfDelivery;
    }

    public void setStatusOfDelivery(Status statusOfDelivery) {
        this.statusOfDelivery = statusOfDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (count != product.count) return false;
        if (Double.compare(product.weight, weight) != 0) return false;
        if (Double.compare(product.deliveryPrice, deliveryPrice) != 0) return false;
        if (!countryToDeliver.equals(product.countryToDeliver)) return false;
        return statusOfDelivery == product.statusOfDelivery;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + countryToDeliver.hashCode();
        result = 31 * result + count;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(deliveryPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + statusOfDelivery.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", countryToDeliver='" + countryToDeliver + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                ", deliveryPrice=" + deliveryPrice +
                ", statusOfDelivery=" + statusOfDelivery +
                '}';
    }
}
