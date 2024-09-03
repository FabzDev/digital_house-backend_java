public class VehiclePremium extends Vehicle implements Comparable<Vehicle>{
    private Double premiumTarif;

    public VehiclePremium(String plate, String color, Double premiumTariff) {
        super(plate, color);
        this.premiumTarif = premiumTariff;
    }

    @Override
    public Double calculateRate(Double distance) {
        return super.calculateRate(distance) * (premiumTarif);
    }

    @Override
    public int compareTo(Vehicle o) {
        return 0;
    }
}
