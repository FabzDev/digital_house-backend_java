import java.util.Objects;

public class GeometricFigureFactory {
    private static GeometricFigureFactory instance;

    private GeometricFigureFactory(){};

    public static GeometricFigureFactory getInstance(){
        if (instance == null){
            instance = new GeometricFigureFactory();
        }
        return instance;
    }

    public GeometricFigure createFigure(String figure, Double base, Double height){
        switch (figure){
            case "Rectangle":
                return new Rectangle(base, height);
            case "Triangle":
                return new Triangle(base, height);
        }
        return null;
    }

    public GeometricFigure createFigure(String figure, Double measure){
        if (Objects.equals(figure, "Circle"))
                return new Circle(measure);
        if (Objects.equals(figure, "Square"))
            return new Rectangle(measure, measure);
        return null;
    }

}
