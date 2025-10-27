package basic_programming.objectoriented.inheritance;

// Opgave 1 - Sammen med Point.java og Rectangle.java
public class Circle extends Point {
    int radius;

    public Circle(Point p, int radius) {
        super(p);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return "Circle(" + super.toString() + ", radius=" + radius + ", area=" + area() + ", circumference=" + circumference() + ")";
    }
}
