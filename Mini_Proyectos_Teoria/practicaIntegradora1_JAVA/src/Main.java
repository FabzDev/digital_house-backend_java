public class Main {
    public static void main(String[] args) {
        Vehicle vStandard = new VehicleStandard("123", "Rojo");
        Vehicle vDeluxe = new VehiclePremium("123", "Rojo", 3.0);

        Driver driver = new Driver("Fabio", vStandard);
        driver.howMuchForTrip(10.0);
        driver.howMuchForTrip(66.0);

        driver.setVh(vDeluxe);
        driver.howMuchForTrip(30.0);


    }
}
