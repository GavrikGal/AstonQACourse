package task2;

public abstract class Figure implements PerimeterCalculable, AreaCalculable,
        Colorable, Named, Characterizable {
    private final String name;
    protected double[] sides;
    protected String fillColor;
    protected String borderColor;

    public Figure(String name, String fillColor, String borderColor, double... sides) {
        this.name = name;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.sides = sides;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public double[] getSides() {
        return sides;
    }

    public String getName() {
        return name;
    }

}
