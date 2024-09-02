public abstract class Vehicle {
    private Integer numberOfWheels;
    private String color;
    private Boolean itsOn;

    public Vehicle(Integer numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.itsOn = false;
    }

    public void turnOn(){
        if (!itsOn) {
            this.itsOn = true;
            System.out.println("Vehiculo encendido");
        } else {
            System.out.println("El vehículo ya estaba prendido");
        }

    }

    public Boolean getItsOn() {
        return itsOn;
    }
}
