public class Main {

    public static void main(String[] args){
        Animal animal = new Perro();
    //  Perro perroAnimal = new Animal(); Not possible ❌
    //    animal.makeSound(); // ejecutara el bloque de código en la clase Perro

        Perro animalPerro = (Perro) animal; //CASTEO
        animalPerro.fetchBall();

    }

}
