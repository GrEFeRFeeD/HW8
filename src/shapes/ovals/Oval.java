package shapes.ovals;

import shapes.Shape;

public abstract class Oval extends Shape {

    public static final double PI = 3.14159265359;

    public Oval(String shapeName) {
        super(shapeName);
    }

    public abstract double getCircumference();
}
