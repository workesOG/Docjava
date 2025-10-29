// En konsekvens ved at denne klasse er del af packagen "car" er, at den også er nødt til at ligge i en mappe med navnet "car".
package objectoriented.polymorphism.car;

// Opgave 3 - Sammen med Car.java og FreightCar.java
public class PersonalCar extends Car {
    float maxPassengers;

    public PersonalCar(float weight, float maxPassengers) {
        super(weight);
        this.maxPassengers = maxPassengers;
    }

    public PersonalCar(PersonalCar pc) {
        super(pc.weight);
        this.maxPassengers = pc.maxPassengers;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("   - Max passengers: " + String.format("%.0f", maxPassengers) + "\n");
        sb.append("   - Fees: " + String.format("%.0f", yearlyCost()) + "kr / year\n");
        return sb.toString();
    }

    public double yearlyCost() {
        double cost = 0.5 * weight;
        cost += 800 * maxPassengers;
        return cost;
    }
}
