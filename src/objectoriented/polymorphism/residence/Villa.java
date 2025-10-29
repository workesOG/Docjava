package objectoriented.polymorphism.residence;

// Opgave 2 - Sammen med Residence.java og Apartment.java
public class Villa extends Residence {
    double price;

    public Villa(float totalArea, float indoorArea, boolean isInCityZone, double price) {
        super(totalArea, indoorArea, isInCityZone);
        this.price = price;
    }

    public Villa(Villa v) {
        super(v);
        this.price = v.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("   - Buying price: " + formatMoneyNum(price) + "\n");
        sb.append("   - Yearly cost: " + formatMoneyNum(yearlyCost()) + "\n");
        return sb.toString();
    }

    public double yearlyCost() {
        return price * (isInCityZone ? 0.1 : 0.12);
    }
}
