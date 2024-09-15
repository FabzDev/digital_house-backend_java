public class Truck implements Movable{
    private String brand;
    private Integer year;
    private Integer tonCapacity;

    public Truck(String brand, Integer year, Integer tonCapacity) {
        this.brand = brand;
        this.year = year;
        this.tonCapacity = tonCapacity;
    }

    @Override
    public void move() {
        System.out.println("Moviendo Truck con carga");
    }
}
