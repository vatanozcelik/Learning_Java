import java.io.*;
import java.sql.SQLOutput;
import java.util.Objects;

class Equal {
    private int id;
    private String name;

    public Equal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Equal{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equal)) return false;
        Equal equal = (Equal) o;
        return id == equal.id && Objects.equals(name, equal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class App {
    public static void main(String[] args) {
        // FILE READER !!!
        /*
        File file = new File("test.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            // read line by line
            br = new BufferedReader(fr);

            String line;

            while( (line = br.readLine() ) != null)
                System.out.println(line);

        } catch (FileNotFoundException e) {
            System.out.println("file not found. "+ file.toString());
        } catch (IOException e) {
            System.out.println("unable to read file. "+ file.toString());
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("unable to close the file! "+ file.toString());
            } catch (NullPointerException ex) {
                System.out.println("file was probably never opened!");
            }
        }



 */

        // FILE WRITER !!!
        /*
        File file = new File("writer.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            // read line by line
            bw.write("this is line one");
            bw.newLine();
            bw.write("this is line second");
            bw.newLine();
            bw.write("this is line third");
        }  catch (IOException e) {
            System.out.println("unable to read file. "+ file.toString());
        }

     */

        // THE EQUAL METHOD
        /*
        Equal equal1 = new Equal(5, "bob");
        Equal equal2 = new Equal(5, "bob");

        System.out.println(equal1.equals(equal2));

        Double num1 = 3.4;
        Double num2 = 3.4;

        System.out.println(num1.equals(num2));

        Integer n1 = 3;
        Integer n2 = 3;

        System.out.println(n1.equals(n2));

        String s1 = "Halo";
        String s2 = "Halooooosad".substring(0, 4);
        String s3 = "Halo";
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(new Object());

         */
    }
}
