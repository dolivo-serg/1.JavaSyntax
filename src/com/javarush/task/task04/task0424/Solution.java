package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
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


        if (b==c)
            System.out.println("1");
        if (c==a)
            System.out.println("2");
        if (a==b)
            System.out.println("3");
    }
}
