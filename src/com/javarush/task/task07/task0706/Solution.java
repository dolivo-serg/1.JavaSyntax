package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int []house = new int[15];
        int sumEven = 0;
        int sumOdd = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i<house.length; i++) {
            house[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                sumEven += house[i];
            else
                sumOdd += house[i];
        }
        if (sumEven>sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
         else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");



        }

    }
