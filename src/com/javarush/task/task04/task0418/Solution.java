package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberText1 = reader.readLine();
        String numberText2 = reader.readLine();

        int a = Integer.parseInt(numberText1);
        int b = Integer.parseInt(numberText2);

        if (a<b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}