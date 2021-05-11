import java.io.Serializable;

public class Person implements Serializable {

    private int number;
    private String name;

    public Person(int number, String name){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" + "number=" + number + ", name='" + name + '\'' + '}';
    }
}
