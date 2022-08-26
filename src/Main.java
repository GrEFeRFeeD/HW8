import shapes.*;
import shapes.ovals.Circle;
import shapes.ovals.Ellipse;
import shapes.polygons.Rectangle;
import shapes.polygons.Triangle;
import shapes.polygons.regular_polygons.EquilateralTriangle;
import shapes.polygons.regular_polygons.Square;
import shapes.shape_printers.ShapePrinter;
import shapes.shape_printers.ShapePrinterImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(12, 16));
        shapes.add(new Triangle(5, 7, 9));
        shapes.add(new Square(1));
        shapes.add(new EquilateralTriangle(2));
        shapes.add(new Ellipse(12, 15));
        shapes.add(new Circle(20));

        ShapePrinter shapePrinter = new ShapePrinterImpl();

        for (Shape shape : shapes) {
            shapePrinter.printShape(shape);
        }
    }
}
