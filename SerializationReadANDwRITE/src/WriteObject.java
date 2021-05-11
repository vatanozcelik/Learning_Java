import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("writing objects..");

        Person mike = new Person(543, "mike");
        Person sum = new Person(12, "sum");

        System.out.println(mike);
        System.out.println(sum);

        try (FileOutputStream fs = new FileOutputStream("people.bin")){

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sum);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
