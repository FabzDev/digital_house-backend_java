import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map studentMap = new HashMap<Integer,Student>();

        studentMap.put(1, new Student(1,"Fabio", 4.8));
        studentMap.put(2, new Student(1,"Yulieth", 4.9));
        studentMap.put(3, new Student(1,"Alejandro", (5.0)));

        System.out.println(studentMap);
    }
}
