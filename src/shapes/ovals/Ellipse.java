package shapes.ovals;

public class Ellipse extends Oval {

    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super("ellipse");
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getCircumference() {
        return PI * (a + b);
    }
}
