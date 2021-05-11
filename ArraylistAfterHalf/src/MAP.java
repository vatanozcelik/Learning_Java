import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class MAP {
    public static void main(String[] args) {
        // numerical order, hashmap does not guaranted for sorting
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        // print as u write
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // natural order,
        Map<Integer, String> treemap = new TreeMap<Integer, String>();

        testmap(linkedHashMap);

    }
    public static void testmap(Map<Integer, String> map){
        map.put(4,"dog");
        map.put(3,"cat");
        map.put(34,"giraffe");
        map.put(1,"snake");
        map.put(33,"bear");

        for (Integer key: map.keySet()) {
            String value =map.get(key);

            System.out.println(key+ ": "+value);
        }
    }
}


