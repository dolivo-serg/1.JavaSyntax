package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int min = min(a, b, c, d, e);

        System.out.println("Minimum = " + min);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
        int minimum = a > b ? b : a;
            minimum = minimum > c ? c : minimum;
            minimum = minimum > d ? d : minimum;
            minimum = minimum > e ? e : minimum;

        return minimum;
    }
}
