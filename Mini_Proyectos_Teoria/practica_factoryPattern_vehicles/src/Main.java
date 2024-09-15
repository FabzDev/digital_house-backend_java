public class Main {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = VehicleFactory.getInstance();

        Movable fabiosCar = vehicleFactory.createVehicle("Car");
        Movable fabiosMotorcycle = vehicleFactory.createVehicle("Motorcycle");
        Movable fabiosBike = vehicleFactory.createVehicle("Bike");
        Movable fabiosTruck = vehicleFactory.createVehicle("Truck");

        fabiosCar.move();
        fabiosMotorcycle.move();
        fabiosBike.move();
        fabiosTruck.move();
    }



//    public static void main(String[] args) {
//        Car fabiosCar = new Car("Renault", "Black", 2011);
//        Bike fabiosBike = new Bike("Todoterreno", 15, "Silver" );
//        Motorcycle fabiosMotorcyle = new Motorcycle("Suzuki",750, "Green");
//
//        fabiosCar.move();
//        fabiosMotorcyle.move();
//        fabiosBike.move();
//
//    }
}
