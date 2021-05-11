import java.util.*;

public class App {
    public static void main(String[] args) {
/*
    Consider:
    what u need to collection to do
    are u using the fastest collection for your purposes
    think about insertion/deletion, retrieval and traversal
 */

        ///////////////  SETS  /////////////////

        // only store unique values
        // great for removing duplicates
        // not indexed, unlike lists
        // very fast check if a particular object exists
        // if you want to use own objects, you must implement hashcode() and equal().

        // order is unimportant and OK if it changes?
        // hashset is not ordered.
        Set<String> set1 = new HashSet<String>();

        // sorted in natural order? use treeset
        Set<String> set2 = new TreeSet<String>();

        // element remain in order they were added
        Set<String> set3 = new LinkedHashSet<String>();

        /*
        ///////////////  MAPS  /////////////////

         key value pairs
         like lookup tables
         retrieving a value by key is fast
         iterating over map values is very slow
         maps not really optimised for iteration
         if you want to use your own objects as keys, you MUST implement hashCode() and equals()
        */
        //keys not in any particular order, and order liable to change
        Map<String, String> map1 = new HashMap<String, String>();

        // keys sorted in natural order
        Map<String, String> map2 = new TreeMap<String, String>();
        // keys remain in order added
        Map<String, String> map3 = new LinkedHashMap<String, String>();

        /*
        ///////////////  LISTS  ////////////////

        store lists of objects
        duplicates are allowed
        objects remain in order
        elements are indexed via an integer
        cf. shopping list
        checking for particular item in list is slow
        looking an item up by index is fast
        iteration through list is relatively fast
        note: you can sort list if u want to

        // if u only add or remove items at the end of list,

         */

    }
}
