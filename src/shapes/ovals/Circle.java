package shapes.ovals;

public class Circle extends Oval {

    private double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getCircumference() {
        return PI * getDiameter();
    }
}
