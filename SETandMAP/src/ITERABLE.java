import java.util.Iterator;
import java.util.LinkedList;

public class ITERABLE {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("rabbit");

        Iterator<String> IT = animals.iterator();

        while (IT.hasNext()){
            String value = IT.next();
            System.out.println(value);

            if(value.equals("cat")){
                IT.remove();
            }
        }
        System.out.println("\n\n////   modern iteration  ////\n\n");

        for (String animal: animals){
            System.out.println(animal);
        }
    }
}
