package newPackage;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
public class yusufyusuf {
    public static void func(int[][] Student, char[] key, int[] CountForEveryStudent) {
        Random rand = new Random();
        for (int std = 0; std < 8; std++) {
            int count = 0;
            System.out.printf("\nStudent[%d]", std);
            for (int i = 0; i < 10; i++) {
                int r = 65 + rand.nextInt(5);
                Student[std][i] = (char) r;
                System.out.print("    " + (char) Student[std][i]);
                if (Student[std][i] == key[i]) {
                    count++;
                }
            }
            System.out.println();
            CountForEveryStudent[std] = count;
            System.out.println();
            // System.out.println("TRUE=" + count);
        }

        for (int last = 0; last < 8; last++) {
            System.out.println("Student " + last + " Dogru sayisi : " + CountForEveryStudent[last]);
        }
    }
    public static void main(String[] args) {
        System.out.println("why why why bee");
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] Student = new int[8][10];
        int[] CountForEveryStudent = new int[8];
        System.out.println("*****  KEY   *****");
        for (int i = 0; i < 10; i++) {
            System.out.print("  " + i);
        }
        System.out.println();
        for (int k = 0; k < 10; k++) {
            System.out.print("  " + key[k]);
        }
        System.out.println();
        //System.out.println();
        System.out.printf("\t\t  ");
        for (int i = 0; i < 10; i++) {
            System.out.print("    " + i);
        }
        System.out.println();
        func(Student, key, CountForEveryStudent);
    }
    }









