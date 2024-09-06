import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creation
        List<Integer> numbersList = new ArrayList<>();
        Set<Integer> numbersSet = new HashSet<>();


        //add
        numbersList.add(3);
        numbersList.add(9);
        numbersList.add(5);
        numbersList.add(3);

        numbersSet.add(3);
        numbersSet.add(9);
        numbersSet.add(5);
        numbersSet.add(3);

        System.out.println(numbersList);
        System.out.println(numbersSet);

        //size
        System.out.println(numbersList.size());
        System.out.println(numbersSet.size());

        //get
        System.out.println(numbersList.get(1));

        //iterator
        System.out.println("For each List");
        for (Integer number: numbersList){
            System.out.println(number);
        }

        System.out.println("For each Set");
        for (Integer number : numbersSet) {
            System.out.println(number);
        }


    }
}
