public class MovementStrategyWalk implements MovementStrategy{

    public MovementStrategyWalk() {
    }

    @Override
    public Double calculateTime(Double distance) {
        Double velocity = 5.0;
        return distance/velocity;
    }
}
