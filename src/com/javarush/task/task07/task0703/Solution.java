package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        String[] list = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }

        for (int i = 0; i < list.length; i++) {
            array[i] = list[i].length();
    }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
