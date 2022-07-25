package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tText1 = reader.readLine();
        int a = Integer.parseInt(tText1);
        String tText2 = reader.readLine();
        int b = Integer.parseInt(tText2);

        if (a > 0 && b > 0)
        System.out.println("1");
        if (a < 0 && b > 0)
            System.out.println("2");
        if (a < 0 && b < 0)
            System.out.println("3");
        if (a > 0 && b < 0)
            System.out.println("4");
//на

    }
}
