package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int check = 0;
        double sum = 0.0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();
            int num = Integer.parseInt(text);
                if (num == -1)
                    break;
            sum = sum + num;
            check ++;
        }

        double x = sum / check;
        System.out.println(x);

    }
}

