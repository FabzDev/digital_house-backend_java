public class Main {

    public static void main(String[] args) {
        Owner fabio = new Owner("Fabio", new Vehicle("123", "Plate", 4));

        // Sustitución: Vehicle por VehicleCar. No es posible hacer esto al contrario, VehicleCar por Vehicle.
        fabio.setVehicle(new VehicleCar("234", "Plate", "Ford Explorer"));
    }
}