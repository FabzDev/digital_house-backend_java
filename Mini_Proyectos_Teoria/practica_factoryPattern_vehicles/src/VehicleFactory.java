public class VehicleFactory {
    private static VehicleFactory instance;

    private VehicleFactory(){};

    public static VehicleFactory getInstance(){
        if(instance == null)
            instance = new VehicleFactory();
        return instance;
    }

    public Movable createVehicle(String vehicleType){
        switch (vehicleType){
            case "Car":
                return new Car("Renault", "Black", 2011);
            case "Bike":
                return new Bike("Todoterreno", 15, "Silver" );
            case "Motorcycle":
                return new Motorcycle("Suzuki",750, "Green");
            case "Truck":
                return new Truck("Mercedez Benz", 2010, 40);
            default:
                System.out.println("Vehicle type invalid");
                return null;
        }
    }
}
