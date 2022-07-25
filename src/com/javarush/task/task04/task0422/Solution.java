package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String ageText = reader.readLine();
        int age = Integer.parseInt(ageText);
    if (age < 18 )
        System.out.println("Подрасти еще");
    }
}
