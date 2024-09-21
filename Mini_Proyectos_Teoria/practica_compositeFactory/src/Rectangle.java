public class Rectangle implements GeometricFigure{
    public Double height;
    public Double length;

    public Rectangle(Double height, Double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public Double calculateArea() {
        return height*length;
    }

}
