public class Main {
    public static void main(String[] args) {

        CompleteFigure completeFigure = new CompleteFigure();
        GeometricFigureFactory geoFactory = GeometricFigureFactory.getInstance();

        completeFigure.addFigure(GeometricFigureFactory.CIRCLE_CODE);
        completeFigure.addFigure(GeometricFigureFactory.SQUARE_CODE);
        completeFigure.addFigure(GeometricFigureFactory.RECTANGLE_CODE);

        GeometricFigureComposite geometricFigureComposite = new GeometricFigureComposite();
        geometricFigureComposite.addFigure(GeometricFigureFactory.SQUARE_CODE);
        geometricFigureComposite.addFigure(GeometricFigureFactory.TRIANGLE_CODE);
        geometricFigureComposite.addFigure("figureNotValid");
        completeFigure.addFigure("2ndFigureNotValid");
    }
}
