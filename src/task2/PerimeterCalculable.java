package task2;

public interface PerimeterCalculable extends Sided {
    default double calculatePerimeter() {
        double perimeter = 0;
        for (double side : getSides()) {
            perimeter += side;
        }
        return perimeter;
    }
}
