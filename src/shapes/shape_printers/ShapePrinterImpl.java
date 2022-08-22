package shapes.shape_printers;

import shapes.Shape;

public class ShapePrinterImpl implements ShapePrinter{

    @Override
    public void printShape(Shape shape) {
        System.out.println("Targeted shape name is " + shape.getShapeName());
    }
}
