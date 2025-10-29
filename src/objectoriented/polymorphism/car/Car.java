// En konsekvens ved at denne klasse er del af packagen "car" er, at den også er nødt til at ligge i en mappe med navnet "car".
package objectoriented.polymorphism.car;

public abstract class Car {
    float weight;

    public Car(float weight) {
        this.weight = weight;
    }

    public Car(Car c) {
        this.weight = c.weight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + addSpacesToCamelCase(this.getClass().getSimpleName()) + "\n");
        sb.append("   - Weight: " + String.format("%.0f", weight) + "kg\n");
        return sb.toString();
    }

    // At denne funktion er i en package og er protected, betyder at den kun kan bruges i denne package og i subklasser.
    protected String addSpacesToCamelCase(String input) {
        return input.replaceAll("([a-z])([A-Z])", "$1 $2");
    }

    public abstract double yearlyCost();
}
