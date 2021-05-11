import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetTreeSetHashSet {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<String>();
        Set<String> linkedhashset = new LinkedHashSet<String>();

        if (hashset.isEmpty()){
            System.out.println("empty at first");
        }
        hashset.add("doggy");
        hashset.add("miyaw");
        hashset.add("bear");

        // adding duplicate item does nothing..
        hashset.add("miyaw");

        if (hashset.isEmpty()){
            System.out.println("empty at last");
        }

        System.out.println(hashset);

        ///////// iteration ///////////
        for (String element: hashset){
            System.out.println(element);
        }
        ///////// does set contain a given item? ////////
        if (hashset.contains("doggy")){
            System.out.println("contains doggy");
        }
        linkedhashset.add("wawww");
        linkedhashset.add("what a animal");
        linkedhashset.add("are u?");
        linkedhashset.add("doggy");

        //////// intersection ////////////

        Set<String> intersection = new HashSet<String>(hashset);

        System.out.println("( INTERSECTION > kesişim ) treeset includes hashset elements ...");
        // same items int the hashset and linkedhashset
        intersection.retainAll(linkedhashset);
        System.out.println(intersection);

        Set<String> difference = new HashSet<String>(linkedhashset);
        System.out.println("differences... ");
        difference.removeAll(hashset);
        System.out.println(difference);

    }
}
