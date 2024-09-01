public class VehicleCar extends Vehicle{
    private String brand;

    public VehicleCar(String licensePlate, String color, String brand) {
        super(licensePlate, color, 4);
        this.brand = brand;
    }
}
