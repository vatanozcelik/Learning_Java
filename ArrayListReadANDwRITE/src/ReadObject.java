import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("reading object..");
        try(FileInputStream fl = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fl)) {

            Person[] people = (Person[])os.readObject();

            @SuppressWarnings("unchecked")
            ArrayList<Person> peoplelist = (ArrayList<Person>)os.readObject();

            for(Person person1: people){
                System.out.println(person1);
            }

            for (Person person2: people){
                System.out.println(person2);
            }

            //os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
