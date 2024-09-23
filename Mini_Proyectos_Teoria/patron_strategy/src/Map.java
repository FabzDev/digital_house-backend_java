public class Map {
    private Location initialLocation;
    private MovementStrategy movementStrategy;

    public Map(Location initialLocation, MovementStrategy movementStrategy) {
        this.initialLocation = initialLocation;
        this.movementStrategy = movementStrategy;
    }

    public Double calculateTime(Location newLocation) {
        Double distance = newLocation.calculateDistance(this.initialLocation);
        return movementStrategy.calculateTime(distance);
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }
}
