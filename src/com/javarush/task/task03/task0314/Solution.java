package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        multiplicationTab();
        }

    public static void multiplicationTab() {
        for (int x = 1; x < 11; x++){

        for ( int i = 1; i < 11; i++ )
            System.out.print((i * x) + " ");
            System.out.println("");
        }

    }
}

