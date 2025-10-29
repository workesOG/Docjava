package objectoriented.inheritance;

// Opgave 1 - Sammen med Circle.java og Rectangle.java
public class Point {
    int[] coordinates = new int[2];

    public Point(int x, int y) {
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public Point(Point p) {
        coordinates[0] = p.coordinates[0];
        coordinates[1] = p.coordinates[1];
    }

    public void move(int x, int y) {
        coordinates[0] += x;
        coordinates[1] += y;
    }

    public String toString() {
        return "Point(" + coordinates[0] + ", " + coordinates[1] + ")";
    }
}

/* Testkode for opgave 1
Point p = new Point(0, 0);

System.out.println(p.toString());

p.move(1, 1);
Circle c = new Circle(p, 3);
System.out.println(c.toString());
        
p.move(4, -3);
Rectangle r = new Rectangle(p, 4, 5);
System.out.println(r.toString());

Output:
Point(0, 0)
Circle(Point(1, 1), radius=3, area=28.274333882308138, circumference=18.84955592153876)
Rectangle(Point(5, -2), height=4, width=5, area=20.0, circumference=18.0)
 */
