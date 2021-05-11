import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LIST {
    public static void main(String[] args) {
        /*
        * arraylist manage array internally
        * [0][1][2][3][4][5] ...
        * USE IT FOR ADDING AT THE END AND AT THE MIDDLE OF THE ELEMENTS
         */
        List<Integer> arraylist = new ArrayList<Integer>();
        /*
        * linkedlist consists of elements where each element
        * has a reference to the previous and next element
        * [0]>[1]>[2]> ...
        * [22]<[21]< ...
        * USE IT FOR ADDING AT THE END OF THE ELEMENTS
         */
        List<Integer> linkedlist =new LinkedList<Integer>();

        doTiming("arraylist", arraylist);
        doTiming("linkedlist", linkedlist);

    }
    private static void doTiming(String type, List<Integer> list) {

        for (int i=0;i<1E5;i++) {
            list.add(i);
        }
        System.out.println(list.size());
        long start = System.currentTimeMillis();
        /*
        //add item at the end of the list
        for (int i=0;i<1E5;i++) {
            list.add(i);
        }
         */
        // beginning of the elements
        for (int i=0;i<1E5;i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();

        System.out.println("time taken: "+ (end - start) + " ms for "+ type);

    }
}
