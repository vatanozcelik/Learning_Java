import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("writing object..");

        Person[] people = {new Person(1, "sue"), new Person(2, "eric"), new Person(3, "neden")};

        Person person = new Person(7, "bob");
        person.setCount(77);

        ArrayList<Person> peoplelist = new ArrayList<Person>(Arrays.asList(people));

        try(FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os =new ObjectOutputStream(fs)) {


            os.writeObject(people);

            os.writeObject(peoplelist);

            //os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
