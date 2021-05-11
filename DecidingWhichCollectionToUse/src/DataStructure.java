import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DataStructure {

    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboot"
    };
/*
it is about available ness which is available for driving vehicles.
 */
    public static String[][] drivers = {
            {"freud","seu","peter"},
            {"sue", "rechard","bob","nich"},
            {"pete","north","waww"}
    };

    public static void main(String[] args) {

        // creating variable name is personel
        // if u are working on java 7 or higher u dont have to put
        // "String, Set<String>" into hashMap
        // nesting Map and Set in the same <>
        Map<String, Set<String>> personel = new HashMap<>();

        // iterate vehicle
        for (int i=0; i<vehicles.length; i++){
            String vehicle = vehicles[i];
            String[] driverList = drivers[i];

            // remove duplicates for us linkedHashset
            Set<String> driverset = new LinkedHashSet<String>();

            for (String driver: driverList){
                driverset.add(driver);
            }
            personel.put(vehicle, driverset);
        }

        // bracket just to scope driverlist variable
        {
        // lets say emergince needs helicopter
        Set<String> driverlist = personel.get("helicopter");

        for (String driver: driverlist){
            System.out.println(driver);
        }
        }

        // iterate through whole thing
        for (String vehicle: personel.keySet()){
            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driverlist = personel.get(vehicle);

            for (String driver: driverlist){
                System.out.print(driver);
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
