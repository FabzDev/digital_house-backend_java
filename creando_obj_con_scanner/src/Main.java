import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter Name");
        String myName = myScan.next();
        System.out.println("Enter Color");
        String myColor = myScan.next();

        var myScanInstance = new InstanceWithScanner(myName, myColor);

        System.out.println("Success!!");
    }
}