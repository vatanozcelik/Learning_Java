package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ratate {
    public static void main(String[] args) {

        /*
        List<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
        List<Integer> list = new ArrayList<Integer>();

        int d = 3;

        int rotate = d % arr.size();
        for (int say=0; say<rotate; say++) {
            list.set(say, arr.get(say));
        }
        for (int j = 0; j < arr.size() - list.size(); j++)
        {
            arr.set(j, arr.get(j+rotate));
        }
        for (int a=1; a<list.size(); a++)
            arr.set(arr.size() - 1, list.get(list.size()-a));

        System.out.println(arr.toString());


         */

        List<Integer> X = new ArrayList<Integer>();
        List<Integer> W = new ArrayList<Integer>();
        X.add(1); X.add(2); X.add(3);X.add(4);X.add(5); X.add(6);X.add(7);X.add(8); X.add(9); X.add(10);
        W.add(10); W.add(40); W.add(30); W.add(50); W.add(20);W.add(10); W.add(40); W.add(30); W.add(50); W.add(20);
        double total = 0;
        double total2 =0;
        for(int i=0; i<X.size(); i++)
        {
            total += X.get(i);
            total2 += ( W.get(i) * X.get(i) );
        }
        double number = (double) total2 / total;
        System.out.println(number);
        number = Math.round(number);
        System.out.println(number);

    }
}
