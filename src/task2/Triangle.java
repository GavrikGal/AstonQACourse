package task2;

public class Triangle extends Figure {
    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        super("Треугольник", fillColor, borderColor, a, b, c);
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }
}
