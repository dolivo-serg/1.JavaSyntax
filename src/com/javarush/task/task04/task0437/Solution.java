package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        /*int t = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(t);
            t = (t*10)+(t%;
        }*/
        for (int i = 1; i <= 10; i++) {
            for (int t = 1; t <= i; t++){
                System.out.print("8");

            }
            System.out.println("");
        }
    }
}
