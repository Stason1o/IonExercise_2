package part_1.com.endava.entity;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class Country {
    private String name;
    private double taxFee;

    public Country(String name, double taxFee) {
        this.name = name;
        this.taxFee = taxFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(double taxFee) {
        this.taxFee = taxFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (Double.compare(country.taxFee, taxFee) != 0) return false;
        return name.equals(country.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(taxFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", taxFee=" + taxFee +
                '}';
    }
}
