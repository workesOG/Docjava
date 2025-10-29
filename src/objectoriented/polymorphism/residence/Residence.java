package objectoriented.polymorphism.residence;

import java.text.DecimalFormat;

// Opgave 2 - Sammen med Apartment.java og Villa.java
public abstract class Residence {
    float totalArea;
    float indoorArea;
    boolean isInCityZone;

    public Residence(float totalArea, float indoorArea, boolean isInCityZone) {
        this.totalArea = totalArea;
        this.indoorArea = indoorArea;
        this.isInCityZone = isInCityZone;
    }

    public Residence(Residence r) {
        this.totalArea = r.totalArea;
        this.indoorArea = r.indoorArea;
        this.isInCityZone = r.isInCityZone;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + this.getClass().getSimpleName() + "\n");

        boolean isAllAreaIndoor = totalArea == indoorArea;
        if (!isAllAreaIndoor) {
            sb.append("   - Total area: " + String.format("%.0f", totalArea) + "m^2\n");
        }
        sb.append("   - " + (isAllAreaIndoor ? "Area" : "Indoor area") + ": " + String.format("%.0f", indoorArea)
                + "m^2\n");
        sb.append("   - Location: " + (isInCityZone ? "In city zone" : "Outside city zone") + "\n");
        return sb.toString();
    }

    public String formatMoneyNum(double moneyNum) {
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(moneyNum) + "DKK";
    }

    public abstract double yearlyCost();
}

/* Testkode for opgave 2
Apartment a1 = new Apartment(70, 3000);
System.out.println(a1.toString());

Villa v1 = new Villa(800, 110, false, 650000);
System.out.println(v1.toString());

Villa v2 = new Villa(400, 140, true, 850000);
System.out.println(v2.toString());

Apartment a2 = new Apartment(a1);
System.out.println(a2.toString());

Villa v3 = new Villa(v2);
System.out.println(v3.toString());

Output:
Type: Apartment
   - Area: 70m^2
   - Location: In city zone
   - Rent: 3.000DKK / month
   - Yearly cost: 36.000DKK

Type: Villa
   - Total area: 800m^2
   - Indoor area: 110m^2
   - Location: Outside city zone
   - Buying price: 650.000DKK
   - Yearly cost: 78.000DKK

Type: Villa
   - Total area: 400m^2
   - Indoor area: 140m^2
   - Location: In city zone
   - Buying price: 850.000DKK
   - Yearly cost: 85.000DKK

Type: Apartment
   - Area: 70m^2
   - Location: In city zone
   - Rent: 3.000DKK / month
   - Yearly cost: 36.000DKK

Type: Villa
   - Total area: 400m^2
   - Indoor area: 140m^2
   - Location: In city zone
   - Buying price: 850.000DKK
   - Yearly cost: 85.000DKK
 */