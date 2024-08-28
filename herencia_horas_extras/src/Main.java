public class Main {

    public static void main(String[] args){
        Worker yulieth = new Worker("Yulieth", 2000.0);
        WorkerExtraHour fabio = new WorkerExtraHour("Fabio", 3000.0, 160, 5.5);

        System.out.println("El salario de " + yulieth.getName() + " es " + yulieth.calculateSalary());
        System.out.println("El salario de " + fabio.getName() + " es " + fabio.calculateSalary());
    }
}
