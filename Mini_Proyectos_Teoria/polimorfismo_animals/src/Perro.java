public class Perro extends Animal {


    @Override
    public void makeSound() {
        System.out.println("WOOF! WOOF!");
    }

    public void fetchBall(){
        makeSound();
        System.out.println("Atrapando la pelota");
    }

}
