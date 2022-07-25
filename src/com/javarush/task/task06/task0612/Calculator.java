package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / (double) b;
    }

    public static double percent(int a, int b) {
        return ((double) a * (double) b / 100);
    }

    public static void main(String[] args) {
        System.out.println(plus(2, 9));
        System.out.println(minus(9, 5));
        System.out.println(multiply(2, 8));
        System.out.println(division(3,6));
        System.out.println(percent(100, 55));
    }
}