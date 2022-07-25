package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberText1 = reader.readLine();
        String numberText2 = reader.readLine();
        String numberText3 = reader.readLine();
        int number1 = Integer.parseInt(numberText1);
        int number2 = Integer.parseInt(numberText2);
        int number3 = Integer.parseInt(numberText3); //напишите тут ваш код
        if ((number1 + number2) <= number3)
            System.out.println("Треугольник не существует.");
        else if ((number1 + number3) <= number2)
            System.out.println("Треугольник не существует.");
        else if ((number3 + number2) <= number1)
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
    }
}