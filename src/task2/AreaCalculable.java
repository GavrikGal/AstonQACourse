package task2;

public interface AreaCalculable extends Sided {

    // Для прямоугольника реализация по умолчанию, остальные должны переопределить метод
    default double calculateArea() throws NotImplementedException {
        double[] sides = getSides();
        if (sides.length == 2) {
            return sides[0] * sides[1];
        }

        throw new NotImplementedException("Not Implemented");
    }
}
