import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Machine {
    @Override
    public String toString() {
        return "I am a machine";
    }
    public void start() {
        System.out.println("machine started!");
    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a Camera";
    }
}
interface Plant {
    public void grow();
}
public class App {
    public static void main(String[] args) {
        /*
        //////// old type /////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);
        System.out.println(fruit);
///////////// modern type /////////////
        ArrayList<String> string = new ArrayList<String>();

        string.add("Cat");
        string.add("dog");
        string.add("animal");

        String animals = string.get(1);
        System.out.println(animals);
///////// for more than one parameter //////////////
        HashMap<Integer, String> app = new HashMap<Integer, String>();

         */
        /*
        ArrayList<Machine> list = new ArrayList<Machine>();

        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());

        showlist(list2);

    }
    public static void showlist(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }

         */
        // Anonymous class
        /*
        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("Anonymous class\nplant growing...");
            }
        };
        Machine machine = new Machine() {
            @Override
            public void start(){
                System.out.println("plant growing... ");
            }
        };
        plant.grow();
        machine.start();
    }

         */
        // reading files using scanner
        /*
        String fileName = "C:\\Users\\Dell\\Desktop\\example.txt";
        File file = new File(fileName);
        Scanner in = new Scanner(file);

        int value= in.nextInt();
        System.out.println("read value: "+ value);

        int count = 2;
        while(in.hasNextLine()){
            String line = in.nextLine();

            System.out.println("count: "+ line);
            count++;
        }
        in.close();

         */
        // try and catch exceptions
        /*
        Test test = new Test();

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            test.input();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
    }}
