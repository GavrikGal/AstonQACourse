package task2;

public class Circle extends Figure {
    public Circle(double radius, String fillColor, String borderColor) {
        super("Круг", fillColor, borderColor, 2 * Math.PI * radius);
    }

    @Override
    public double calculatePerimeter() {
        return sides[0];
    }

    @Override
    public double calculateArea() {
        double radius = sides[0] / (2 * Math.PI);
        return Math.PI * radius * radius;
    }
}