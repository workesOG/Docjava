package basic_programming.objectoriented.inheritance;

// Opgave 1 - Sammen med Point.java og Circle.java
public class Rectangle extends Point {
    int height;
    int width;

    public Rectangle(Point p, int height, int width) {
        super(p);
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    public double circumference() {
        return 2 * (height + width);
    }

    public String toString() {
        return "Rectangle(" + super.toString() + ", height=" + height + ", width=" + width + ", area=" + area() + ", circumference=" + circumference() + ")";
    }
}
