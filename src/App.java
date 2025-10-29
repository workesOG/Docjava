import objectoriented.polymorphism.car.PersonalCar;
import objectoriented.polymorphism.car.FreightCar;

public class App {
    public static void main(String[] args) throws Exception {
        FreightCar fc1 = new FreightCar(2000, 400);
        System.out.println(fc1.toString());

        PersonalCar pc1 = new PersonalCar(1100, 5);
        System.out.println(pc1.toString());

        FreightCar fc2 = new FreightCar(fc1);
        System.out.println(fc2.toString());

        PersonalCar pc2 = new PersonalCar(pc1);
        System.out.println(pc2.toString());
    }
}
