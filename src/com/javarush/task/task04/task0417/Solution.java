package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String numberText1 = reader.readLine();
        String numberText2 = reader.readLine();
        String numberText3 = reader.readLine();
        int number1 = Integer.parseInt(numberText1);
        int number2 = Integer.parseInt(numberText2);
        int number3 = Integer.parseInt(numberText3);
        if ((number1 == number2) && (number2 == number3))
            System.out.println(number1 + " " + number2 + " " + number3);
        else if (number1 == number2)
            System.out.println(number1 + " " + number2 );
        else if (number1 == number3)
            System.out.println(number1 + " " + number3);
        else if (number2 == number3)
            System.out.println(number2 + " " + number3);
    }
}