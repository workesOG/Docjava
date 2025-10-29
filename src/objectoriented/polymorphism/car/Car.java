// En konsekvens ved at denne klasse er del af packagen "car" er, at den også er nødt til at ligge i en mappe med navnet "car".
package objectoriented.polymorphism.car;

// Opgave 3 - Sammen med PersonalCar.java og FreightCar.java
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

/* Testkode for opgave 3
FreightCar fc1 = new FreightCar(2000, 400);
System.out.println(fc1.toString());

PersonalCar pc1 = new PersonalCar(1100, 5);
System.out.println(pc1.toString());

FreightCar fc2 = new FreightCar(fc1);
System.out.println(fc2.toString());

PersonalCar pc2 = new PersonalCar(pc1);
System.out.println(pc2.toString());

Output:
Type: Freight Car
   - Weight: 2000kg
   - Max load: 400kg
   - Fees: 780kr / year

Type: Personal Car
   - Weight: 1100kg
   - Max passengers: 5
   - Fees: 4550kr / year

Type: Freight Car
   - Weight: 2000kg
   - Max load: 400kg
   - Fees: 780kr / year

Type: Personal Car
   - Weight: 1100kg
   - Max passengers: 5
   - Fees: 4550kr / year

 */
