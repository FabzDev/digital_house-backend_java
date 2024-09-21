import java.util.ArrayList;
import java.util.List;

public class CompleteFigure {
    private List<GeometricFigure> geometricObjectList;

    public CompleteFigure() {
        this.geometricObjectList = new ArrayList<>();
    }

    public void addFigure(String figure){
        try {
            geometricObjectList.add(GeometricFigureFactory.getInstance().createFigure(figure));
        } catch (GeometricFigureFactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public Double calculateTotalArea(){
        Double totalArea = 0.0;
        for (GeometricFigure geoFig:geometricObjectList){
            totalArea += geoFig.calculateArea();
        }
        return totalArea;
    }
}
