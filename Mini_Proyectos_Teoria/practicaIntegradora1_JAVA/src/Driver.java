public class Driver {
    private String name;
    private Vehicle vh;

    public Driver(String name, Vehicle vh) {
        this.name = name;
        this.vh = vh;
    }

    public void howMuchForTrip(Double distance){
        System.out.println("This trip will cost you $" + vh.calculateRate(distance));
    }

    public void setVh(Vehicle vh) {
        this.vh = vh;
    }
}
