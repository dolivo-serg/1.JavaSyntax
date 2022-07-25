package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int a = Integer.parseInt(text);


            if (digit(a)!=null) {
                System.out.println(parity(a) + digit(a) + "число");
            }

    }

    private static String digit(int a) {
        if (a < 10 && a > 0)
            return "однозначное ";
        else if (a < 100 && a > 9)
            return "двузначное ";
        else if (a < 1000 && a > 99)
            return "трехзначное ";

        else return null;
    }

    private static String parity(int a) {
        if (a % 2 == 0)
            return "четное ";
        else
            return "нечетное ";
    }


}
