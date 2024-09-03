public class VehicleStandard  extends Vehicle implements Comparable<Vehicle>{

    public VehicleStandard(String plate, String color) {
        super(plate, color);
    }

    @Override
    public int compareTo(Vehicle o) {
        return 0;
    }
}
