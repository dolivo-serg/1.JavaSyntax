package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
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
        String tText4 = reader.readLine();
        int d = Integer.parseInt(tText4);

        if ( a >= b && a >= c && a >= d)
            System.out.println(a);
        else if ( b >= a && b >= c && b >= d)
            System.out.println(b);
        else if ( c >= a && c >= b && c >= d)
            System.out.println(c);
        else
            System.out.println(d);
    }
}
