package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[]array = getInts();
        int maximum = array[0];
        int minimum = array[0];

        for ( int i = 1; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
            if (array[i] < minimum){
                minimum = array[i];
            }
        }


        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
       int [] list = new int [20];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <list.length; i++){
             list[i]=Integer.parseInt(reader.readLine());
        }
        return list;

    }
}
