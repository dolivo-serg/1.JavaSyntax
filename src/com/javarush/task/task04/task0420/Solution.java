package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tText1 = reader.readLine();
        int a = Integer.parseInt(tText1);
        String tText2 = reader.readLine();
        int b = Integer.parseInt(tText2);
        String tText3 = reader.readLine();
        int c = Integer.parseInt(tText3);

        if (a >= b && b >= c)
            System.out.println(a + " " + b + " " + c);
        else if (b >= a && a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (c >= a && a >= b)
            System.out.println(c + " " + a + " " + b);
        else if (c >= b && b >= a)
            System.out.println(c + " " + b + " " + a);
        else if (b >= c)
            System.out.println(b + " " + c + " " + a);
        else
            System.out.println(a + " " + c + " " + b);

    }
}
