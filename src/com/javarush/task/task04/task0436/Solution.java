package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int m = Integer.parseInt(text);
        String text1 = reader.readLine();
        int n = Integer.parseInt(text1);
        for (int i = 1; i <= m; i++) {

            for (int t = 1; t <= n; t++) {
                System.out.print("8");//напишите тут ваш код
            }
            System.out.println("");
        }
    }
}