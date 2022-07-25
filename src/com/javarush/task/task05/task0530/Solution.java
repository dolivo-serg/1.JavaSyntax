package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int a = Integer.parseInt(text);
        String text1 = reader.readLine();
        int b = Integer.parseInt(text1);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
