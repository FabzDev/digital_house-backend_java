public class Main {
    public static void main(String[] args) {
        GeometricFigureFactory geoFactory = GeometricFigureFactory.getInstance();
        GeometricFigure circle1 = geoFactory.createFigure("Circle", 2.0);
        GeometricFigure square1 = geoFactory.createFigure("Square", 3.0);
        GeometricFigure triangle1 = geoFactory.createFigure("Triangle", 1.0, 2.0);
        GeometricFigure rectangle1 = geoFactory.createFigure("Rectangle", 2.0, 2.0);

        GeometricFigureComposite geometricComposite1 = new GeometricFigureComposite();
        geometricComposite1.addFigure(geoFactory.createFigure("Rectangle", 3.0, 1.0));
        geometricComposite1.addFigure(geoFactory.createFigure("Circle", 3.0));
        geometricComposite1.addFigure(circle1);
        geometricComposite1.addFigure(square1);
        geometricComposite1.addFigure(triangle1);
        geometricComposite1.addFigure(rectangle1);

        System.out.println(circle1.calculateArea());
        System.out.println(square1.calculateArea());
        System.out.println(triangle1.calculateArea());
        System.out.println(rectangle1.calculateArea());
        System.out.println(geometricComposite1.calculateArea());


    }
}
