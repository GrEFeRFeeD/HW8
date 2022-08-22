import shapes.*;
import shapes.shape_printers.ShapePrinter;
import shapes.shape_printers.ShapePrinterImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Oval());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        ShapePrinter shapePrinter = new ShapePrinterImpl();

        for (Shape shape : shapes) {
            shapePrinter.printShape(shape);
        }
    }
}
