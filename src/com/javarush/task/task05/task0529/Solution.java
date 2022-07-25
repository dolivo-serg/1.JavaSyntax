package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String text = reader.readLine();
            if (text.equals("сумма"))
                break;
            int number = Integer.parseInt(text);
            sum += number;

        }
        System.out.println(sum);


    }
}
