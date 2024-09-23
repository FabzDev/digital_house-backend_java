public class MovementStrategyBike implements MovementStrategy{

    public MovementStrategyBike() {
    }

    @Override
    public Double calculateTime(Double distance) {
        Double velocity = 15.0;
        return distance/velocity;
    }
}
