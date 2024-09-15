public class Bike implements Movable {
    private String brand;
    private Integer weight;
    private String Color;

    public Bike(String brand, Integer weight, String color) {
        this.brand = brand;
        this.weight = weight;
        Color = color;
    }

    @Override
    public void move() {
        System.out.println("Bike moving");
    }
}
