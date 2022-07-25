package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {


        System.out.println(convertEurToUsd(15, 0.9));
        System.out.println(convertEurToUsd(35,0.9));
//напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double usd = eur * exchangeRate;
        return usd;
        //напишите тут ваш код

    }
}
