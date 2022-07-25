package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int number;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();
            number = Integer.parseInt(text);
            sum = sum + number;

        } while (number != -1);
        System.out.println(sum);
    }
}
