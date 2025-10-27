import basic_programming.objectoriented.inheritance.Circle;
import basic_programming.objectoriented.inheritance.Rectangle;
import basic_programming.objectoriented.inheritance.Point;

public class App {
    public static void main(String[] args) throws Exception {
        Point p = new Point(0, 0);

        System.out.println(p.toString());

        p.move(1, 1);
        Circle c = new Circle(p, 3);
        System.out.println(c.toString());
        
        p.move(4, -3);
        Rectangle r = new Rectangle(p, 4, 5);
        System.out.println(r.toString());
    }
}
