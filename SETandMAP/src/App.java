import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "this id is: "+ id +" and name is: "+name;
    }

    // BY THE EQUALS IT WILL NOT PRINT TWICE 'BESIME'
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class App {
    public static void main(String[] args) {
        Person p1 = new Person(1, "sabit");
        Person p2 = new Person(2, "besime");
        Person p3 = new Person(3, "gulseren");
        Person p4 = new Person(2, "besime");

        Set<Person> set = new LinkedHashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);

        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);

        for (Person key: map.keySet()) {
            System.out.println("key is: "+key+" and map.get(key) is: "+ map.get(key));
        }

    }
}
