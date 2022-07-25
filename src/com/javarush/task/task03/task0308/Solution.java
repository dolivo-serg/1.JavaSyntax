package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static int factorial(int x) {
       int result = 1;
         for (int i = 1; i <= x; i++)
            {
                result = result * i;
            }
            return  result;
       }
}
