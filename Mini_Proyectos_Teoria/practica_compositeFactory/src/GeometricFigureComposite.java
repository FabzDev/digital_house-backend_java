import java.util.ArrayList;
import java.util.List;

public class GeometricFigureComposite implements GeometricFigure{
    private List<GeometricFigure> geometricFigureList;

    public GeometricFigureComposite() {
        this.geometricFigureList = new ArrayList<>();
    }

    @Override
    public Double calculateArea() {
        Double totalArea = 0.0;
        for (GeometricFigure geoFig:geometricFigureList){
            totalArea += geoFig.calculateArea();
        }
        return totalArea;
    }

    public void addFigure(GeometricFigure fig){
        this.geometricFigureList.add(fig);
    }
    
}
