import java.util.Objects;

public class GeometricFigureFactory {
    private static GeometricFigureFactory instance;
    public static final String CIRCLE_CODE = "Circle";
    public static final String TRIANGLE_CODE = "Triangle";
    public static final String RECTANGLE_CODE = "Rectangle";
    public static final String SQUARE_CODE = "Square";

    private GeometricFigureFactory(){};

    public static GeometricFigureFactory getInstance(){
        if (instance == null){
            instance = new GeometricFigureFactory();
        }
        return instance;
    }

    public GeometricFigure createFigure(String figure) throws GeometricFigureFactoryException {
        switch (figure){
            case "Rectangle":
                return new Rectangle(10.0, 5.0);
            case "Triangle":
                return new Triangle(10.0, 5.0);
            case "Circle":
                return new Circle(10.0);
            case "Square":
                return new Rectangle(10.0, 5.0);
        }
        throw new GeometricFigureFactoryException(figure + " no es una figura valida");
    }
}
