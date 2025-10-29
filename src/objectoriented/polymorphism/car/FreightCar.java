// En konsekvens ved at denne klasse er del af packagen "car" er, at den også er nødt til at ligge i en mappe med navnet "car".
package objectoriented.polymorphism.car;

// Opgave 3 - Sammen med Car.java og PersonalCar.java
public class FreightCar extends Car {
    float maxLoad;

    public FreightCar(float weight, float maxLoad) {
        super(weight);
        this.maxLoad = maxLoad;
    }

    public FreightCar(FreightCar fc) {
        super(fc.weight);
        this.maxLoad = fc.maxLoad;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("   - Max load: " + String.format("%.0f", maxLoad) + "kg\n");
        sb.append("   - Fees: " + String.format("%.0f", yearlyCost()) + "kr / year\n");
        return sb.toString();
    }

    public double yearlyCost() {
        double cost = 0.35 * weight;
        cost += 0.2 * maxLoad;
        return cost;
    }
}
