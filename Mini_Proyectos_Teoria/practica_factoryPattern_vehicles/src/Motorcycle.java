public class Motorcycle implements Movable{
    private String model;
    private Integer cubicCapacity;
    private String color;

    public Motorcycle(String model, Integer cubicCapacity, String color) {
        this.model = model;
        this.cubicCapacity = cubicCapacity;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Motorcycle moving");
    }
}
