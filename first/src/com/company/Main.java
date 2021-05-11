package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        int[] arr = {1,2,3,0,0};
        Set<Integer>

        arrL.add(1);
        arrL.add(4);
        arrL.add(2);
        System.out.println(arrL);
        int si = arr.length;
        float pos=0;
        if (arr[0] > 0)
            pos += 1;
        System.out.println(String.format("%6f", pos/si));

         */
        /*
        int p = 5, n = 6;
        int right = 0;
        int left = 0;
        int j;
        for ( int i = 1; i < p; i += 2)
        {
            right ++;
        }
        if ( n % 2 ==  0)   j = n;
        else    j = n - 1;
        for (;j > p; j -= 2)
        {
            left ++;
        }
        if ( right > left) System.out.println(left);
        else System.out.println(right);
    }

         */
        /*
        int n = 7, p = 6;
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        System.out.println(Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack));

         */
        /*

        int [] keyboards = {1200, 300, 500,156030 ,99998 ,58097, 459353 ,866372, 333784 ,601251 ,142899, 708233,
                651036, 20590, 56425, 970129 ,722162 ,832631, 938765, 212387, 779 ,1,8186};
        int [] drives = {183477 ,732159 ,779867 ,598794 ,596985, 156054 ,445934,
                6 ,992436, 183446 ,617621, 304311 ,611791, 524875 ,7068, 432043, 23068 ,291295,
                524893 ,611991 ,399952, 139526, 46677, 292211, 973975, 366445 ,232824 ,456173,
                90627 ,785353 ,618526 ,199719, 382549, 514351, 983453 ,592549 ,466869, 46461,
                860135, 607682 ,680461, 170563 ,450601, 65067, 13268 ,949100 ,942415 ,965850,
                563416, 808580 ,385504, 304683 ,15970 ,9,7695 ,230946 ,684388 ,241080 ,440252,
                683418, 122066, 610135, 495289, 833383, 34397 ,173404, 909526, 391149 ,258839, 182278,
                662672 ,755532,449856 ,939711 ,395240 ,895029 ,926868, 598035, 727436, 922082 ,326615,
                88513, 570573 ,196028 ,520952 ,45238 ,961389 ,325404 ,844725 ,388765 ,747489, 271411, 539814,
                828925 ,586884 ,356834, 965473, 280998, 607171, 542819, 276062, 140956 ,296341 ,802378, 165305,
                74568 ,15640, 987110, 423497 ,772419, 394971, 198761,
                293555 ,5524 ,14083, 815646 ,198888, 707017 ,711503, 729172};
        int b =374625;
        int temp = -1;
        for (int i=0; i<keyboards.length; i++)
        {
            for (int j=0; j<drives.length; j++)
            {
                if (keyboards[i] + drives[j] < b &&
                    keyboards[i] + drives[j] > temp)
                {
                    temp = keyboards[i] + drives[j];
                }
            }
        }
        System.out.println(temp);

         */
        /*
        int[][] s = {{4,8,2},{4,5,7},{6,1,6}};
        List<int[][]> options =new ArrayList<int[][]>();
        int[][] tmp = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        options.add(tmp);
        tmp = new int[][]{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        options.add(tmp);
        tmp = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        options.add(tmp);
        tmp = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        options.add(tmp);
        tmp = new int[][]{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        options.add(tmp);
        tmp = new int[][]{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        options.add(tmp);
        tmp = new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        options.add(tmp);
        tmp = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        options.add(tmp);

        int sum = 0;
        int min = 100;

        for (int[][] option: options)
        {
            for (int i=0; i<3; i++)
            {
                for (int j=0; j<3; j++)
                {
                    sum += Math.abs(option[i][j] - s[i][j]);

                }
            }
            sum = Math.abs(sum);
            if (sum < min)      min = sum;
            sum = 0;
        }
        System.out.println(min);
*/
        // R A N K I N G
        /*
        Map<Integer, Integer> arr = new HashMap<Integer, Integer>(); //{ 100, 90, 90, 70, 50}
        arr.put(0, 100); arr.put(1, 90); arr.put(2,90); arr.put(3,70); arr.put(4,50);
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        s.put(0,25); s.put(1,50); s.put(2,90); s.put(3, 120);


        int list = 1;
        List<Integer> solution = new ArrayList<Integer>();
        Map<Integer, Integer> league = new HashMap<Integer, Integer>();
        league.put(0,list);

        int lastOne = 0, first = 10000, index = 0;

        for (int i=0; i<arr.size()-1; i++)
        {
            if (arr.get(i) > arr.get(i+1))
            {
                league.put( i+1, list+=1);
            }
            else
            {
                league.put(i+1, list);
            }
        }
        System.out.println(league.toString());
        int newI = arr.size()-1;
        //      1   2   2   3   4
        for (int j=0; j<s.size(); j++)
        {
            int i = newI;
            for (; i>=0; i--)
            {
                if (arr.get(i) >= s.get(j))
                {
                    lastOne = arr.get(i);
                    index = league.get(i);
                    newI = i;
                    break;
                }
                else if (   i != 0 &&
                        (( Math.abs(arr.get(i) - s.get(j)) ) < ( Math.abs(arr.get(i-1) - s.get(j)))) ){
                    lastOne = arr.get(i);
                    index = league.get(i);
                    newI = i;
                    break;
                }
                if ( i == 0 )
                {
                    lastOne = arr.get(i);
                    index = league.get(i);
                    break;
                }

            }
                if (lastOne > s.get(j))
                {
                    solution.add(j, index + 1);
                }
            else solution.add(j, index);

        }

        System.out.println( solution.toString());

         */

        /*
        List<Integer> list = new ArrayList<Integer>();
        List<Character> letters = new ArrayList<Character>();
        list.add(5); list.add(3); list.add(2); list.add(1);

        String word = "abc";
        int[] arr = new int[word.length()];

        for (char c='a'; c <= 'z'; c++)
        {
            letters.add(c);
        }
        for (int i =0; i< word.length(); i++)
        {
            char ch = word.charAt(i);
            arr[i] = list.get(letters.indexOf(ch));
        }
        int big = arr[0];
        for (int i = 1; i<arr.length; i++)
        {
            if (big < arr[i])   big = arr[i];
        }

        System.out.println(big * word.length());

         */
        // finding beautiful days :)
/*
        int start = 20;
        int end = 23;
        int divisible = 6;
        int reverse = 0;
        int count = 0;

        for (int i=start; i<=end; i++)
        {
            int number = i;
            while (number != 0)   {      reverse = reverse * 10 + number % 10;  number = number / 10; }
            if ( (Math.abs(i - reverse)) % divisible == 0)     count = count + 1;
            reverse =0;
        }
        System.out.println(count);

 */
/*
        int prisoner=4;
        int candy=6;
        int distribution=2;
        int count=distribution-1;

        for (int i=0; i<candy; i++)
        {
            if (count == prisoner)  count = 1;
            else    count +=1;
        }
        System.out.println(count);
        System.out.println(654809340 % 204894365 +472730207 );
        System.out.println( (352926151 % 380324688) + 94730870 -1);
        int number = (352926151 % 380324688) + 94730870 -1;
        System.out.println(654809340 % (204894365 + 472730208) -1  ) ;


 */
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> q = new ArrayList<Integer>();
        a.add(7); a.add(6); a.add(12); a.add(5);
        q.add(1); q.add(2);
        List<Integer> answer = new ArrayList<Integer>();

        int k = 22;
        k = k % a.size();
        System.out.println(k);
        Collections.rotate(a, k);

        for (int i=0; i<q.size(); i++) {
            answer.add(i , a.get(q.get(i)));
        }
        System.out.println(answer.toString());
        System.out.println(a.indexOf(a.indexOf(0) +1) +1);






    }
}

