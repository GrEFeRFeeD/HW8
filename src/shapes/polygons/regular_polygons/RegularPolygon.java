package shapes.polygons.regular_polygons;

import shapes.polygons.Polygon;

public abstract class RegularPolygon extends Polygon {

    private double sideLength;

    public RegularPolygon(String shapeName, int vertexCount, double sideLength) {
        super(shapeName, vertexCount);
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}
