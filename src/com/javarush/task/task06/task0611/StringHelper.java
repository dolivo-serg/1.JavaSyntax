package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String text) {
        String result = text;
        for (int i = 1; i < 5; i++){
            result = result + text;
        }
            return result;
    }

    public static String multiply(String text, int count) {
        String result = text;
        for (int i = 1; i < count; i++){
            result = result + text;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
