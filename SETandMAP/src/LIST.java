import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Personn {
    private int id;
    private String name;

    public Personn(int id, String name) {
        this.id =id ;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personn{" + " id=" + id + ", name=" + name + " }";
    }
}
class lenght implements Comparator<String> {
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2)
            return 1;
        else if (len1 < len2)
            return -1;
        return 0;
    }
}
class alphabetical implements Comparator<String> {
    public int compare(String s1, String s2){
        // if u want reverse alphabetical order
        // return -s1.compareTo(s2);
        return s1.compareTo(s2);
    }
}

public class LIST {
    public static void main(String[] args) {

///////////////////  sorting string  ///////////////////////////////

        List<String> list = new ArrayList<String>();

        list.add("cat");
        list.add("donkey");
        list.add("dog");
        list.add("monkey");
        list.add("giraffe");
        list.add("mouse");


        //Collections.sort(list, new lenght());
        Collections.sort(list, new alphabetical());
        // we can use comparator here without any creating class..

        for (String animals: list) {
            System.out.println(animals);
        }
        System.out.println("\n");
/////////////////////// sorting numbers (using without class) ////////////////////
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(23);
        numbers.add(43);
        numbers.add(21);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (Integer number: numbers) {
            System.out.println(number);
        }
        System.out.println("\n\n");


//////////////////// sorting arbirary objects  ///////////////////////

        List<Personn> people = new ArrayList<Personn>();

        people.add(new Personn(2013, "vahap"));
        people.add(new Personn(2012, "olduartik"));
        people.add(new Personn(2121, "burnley"));
        people.add(new Personn(2021, "olmaliydi"));

///////////////////////////  sorting by name  //////////////////////////

        Collections.sort(people, new Comparator<Personn>() {
            @Override
            public int compare(Personn p1, Personn p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("sorting by name");
        for (Personn person: people){
            System.out.println(person);
        }
//////////////////////  sorting by ID  ////////////////////////////

        Collections.sort(people, new Comparator<Personn>() {
            @Override
            public int compare(Personn p1, Personn p2) {
                if (p1.getId() > p2.getId())
                    return 1;
                else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("\n\nsorting by ID");
        for (Personn person: people) {
            System.out.println(person);
        }
    }
}
