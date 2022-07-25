package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String yearText = reader.readLine();
        int year = Integer.parseInt(yearText);

        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {


        int x;

        if (year % 400 == 0)
            x = 366;
            else if (year % 100 == 0 )
                x = 365;

            else if (year % 4 == 0)
                x = 366;
        else
            x = 365;


        System.out.println("количество дней в году: " + x);
    }
}