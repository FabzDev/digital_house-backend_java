public class Car implements Movable{
    private String model;
    private String color;
    private Integer year;

    public Car(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public void move() {
        System.out.println("Car moving");
    }
}
