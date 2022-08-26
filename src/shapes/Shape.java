package shapes;

public abstract class Shape {

    private final String SHAPE_NAME;

    public Shape(String shapeName) {
        this.SHAPE_NAME = shapeName;
    }
    public String getShapeName() {
        return SHAPE_NAME;
    }
}
