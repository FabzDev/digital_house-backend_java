public class Triangle implements GeometricFigure{
    public Double height;
    public Double base;

    public Triangle(Double height, Double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public Double calculateArea() {
        return height * base / 2;
    }
}
