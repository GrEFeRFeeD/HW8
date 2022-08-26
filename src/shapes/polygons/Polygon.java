package shapes.polygons;

import shapes.Shape;

public abstract class Polygon extends Shape {
    private final int VERTEX_COUNT;

    public Polygon(String shapeName, int vertexCount) {
        super(shapeName);
        this.VERTEX_COUNT = vertexCount;
    }

    public int getVERTEX_COUNT() {
        return VERTEX_COUNT;
    }
}
