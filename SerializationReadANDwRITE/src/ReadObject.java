import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("reading objects...");

        try (FileInputStream fl = new FileInputStream("people.bin")) {

            ObjectInputStream os = new ObjectInputStream(fl);

            Person person1 =(Person)os.readObject();
            Person person2 =(Person)os.readObject();

            os.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
