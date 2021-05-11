import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // adding
        numbers.add(12);
        numbers.add(34);
        numbers.add(453);
        numbers.add(432);

        // retreiving
        System.out.println(numbers.get(0));

        // index for loop iteration
        System.out.println("iteration");
        for (int i=0;i < numbers.size();i++) {
            System.out.println(numbers.get(i));
        }

        //removing items
        // slow
        numbers.remove(0);
        // carefully
        numbers.remove(numbers.size() - 1);

        System.out.println("after removing");
        for (Integer value: numbers){
            System.out.println(value);
        }

    }
}
