package task2;

public interface Characterizable extends PerimeterCalculable, AreaCalculable, Colorable, Named {
    default String getCharacteristics() throws NotImplementedException {
        return getName() + " [" +
                "Периметр: " + calculatePerimeter() +
                ", Площадь: " + calculateArea() +
                ", Цвет заливки: " + getFillColor() +
                ", Цвет границ: " + getBorderColor() + "]";
    }
}
