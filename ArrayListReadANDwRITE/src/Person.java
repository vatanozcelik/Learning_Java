import java.io.Serializable;

public class Person implements Serializable {

    private int id;
    // transient make default to id smth like 0...
    //private transient int id;
    private String name;
    private int count=0;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\''+ "count is: " + count +'}';
    }
}
