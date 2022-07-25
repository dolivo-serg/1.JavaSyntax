package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ab = new int[20];
        int[] a = new int[10];
        int[] b = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ab.length; i++) {
            ab[i] = Integer.parseInt(reader.readLine());
            if (i < 10)
                a[i] = ab[i];
            else
                b[i - 10] = ab[i];
    }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}