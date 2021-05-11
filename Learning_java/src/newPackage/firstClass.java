package newPackage;
import java.io.*;
import java.util.*;
import java.util.Collections;

import static java.util.Collections.sort;

public class firstClass {
    public static void main(String[] args) {
        System.out.println("ohh be why not java?");
        //func1();
        String string = "when i supposed to bloomsom";
        //func2(string);
        Set<Integer> AsalSayilar = new HashSet<Integer>();
        AsalSayilar.add(2);
        int count = 0 ;
        for (int i=3;i<10000;i++) {
            for (int j=2;j<i;j++) {
                if (i % j == 0 )
                {
                    count += 1;
                    break;
                }
            }
            if (count == 0){
            AsalSayilar.add(i);}
            count = 0;
        }
        sort(AsalSayilar);
        System.out.println(Arrays.asList(AsalSayilar));
    }

    private static void sort(Set<Integer> asalSayilar) {
    }
}
