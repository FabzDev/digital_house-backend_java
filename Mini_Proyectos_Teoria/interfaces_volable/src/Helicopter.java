public class Helicopter extends Vehicle implements Flyable{

    public Helicopter(Integer numberOfWheels, String color) {
        super(numberOfWheels, color);
    }
    @Override
    public void fly() {
        if(getItsOn())
            System.out.println(" Volando bajito (8) ");
        else
            System.out.println("Enciende el helicoptero para poder volar");
    }
}
