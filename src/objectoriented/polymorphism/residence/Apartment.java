package objectoriented.polymorphism.residence;

// Opgave 2 - Sammen med Residence.java, Apartment.java og Villa.java
public class Apartment extends Residence {
    double rent;

    public Apartment(float indoorArea, double rent) {
        super(indoorArea, indoorArea, true);
        this.rent = rent;
    }

    public Apartment(Apartment a) {
        super(a);
        this.rent = a.rent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("   - Rent: " + formatMoneyNum(rent) + " / month\n");
        sb.append("   - Yearly cost: " + formatMoneyNum(yearlyCost()) + "\n");
        return sb.toString();
    }

    public double yearlyCost() {
        return rent * 12;
    }
}
