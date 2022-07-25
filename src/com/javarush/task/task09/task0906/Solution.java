package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {

        System.out.print(Thread.currentThread().getStackTrace()[0].getClassName() + ": "
            + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + text);

    }
}
