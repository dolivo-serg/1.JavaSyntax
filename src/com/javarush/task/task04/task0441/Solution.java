package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int a = Integer.parseInt(text);
        String text1 = reader.readLine();
        int b = Integer.parseInt(text1);
        String text2 = reader.readLine();
        int c = Integer. parseInt(text2);

        if (a <= b && b <= c)
        System.out.println(b);
        else if (a >= b && b >= c)
            System.out.println(b);
        else if (a <= b && a >= c)
            System.out.println(a);
        else if (a >= b && a <= c)
            System.out.println(a);
        else if (a <=c )
            System.out.println(c);
        else
            System.out.println(c);




    }
}
