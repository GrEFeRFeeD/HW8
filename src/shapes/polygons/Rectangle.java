package shapes.polygons;

public class Rectangle extends Polygon{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super("rectangle", 4);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
