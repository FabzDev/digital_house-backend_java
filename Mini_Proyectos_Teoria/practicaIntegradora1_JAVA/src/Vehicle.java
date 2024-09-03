public abstract class Vehicle {
    private String plate;
    private String color;
    private Double pricePerKm = 100.0;

    public Vehicle(String plate, String color) {
        this.plate = plate;
        this.color = color;
    }

    public Double calculateRate(Double distance) {
        return this.pricePerKm * distance;
    }
}
