public class Main {
    public static void main(String[] args) {
        Map miMapa = new Map(new Location(30.0,27.2), new MovementStrategyWalk());
        Location finalLocation = new Location(20.1, 10.0);

        System.out.println(miMapa.calculateTime(finalLocation));

        miMapa.setMovementStrategy(new MovementStrategyBike());
        System.out.println(miMapa.calculateTime(finalLocation));
    }
}
