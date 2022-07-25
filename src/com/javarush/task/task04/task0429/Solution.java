package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    static int countSuccess = 0;
    static int countFail = 0;

    private static void test (int i){
        if (i > 0)
            countSuccess += 1;
        else if (i < 0)
            countFail += 1;
        }

    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();
            int a = Integer.parseInt(text);
            test(a);
            String text2 = reader.readLine();
            int b = Integer.parseInt(text2);
            test(b);
            String text3 = reader.readLine();
            int c = Integer.parseInt(text3);
            test(c);

            System.out.println("количество отрицательных чисел: " + countFail);
            System.out.println("количество положительных чисел: " + countSuccess);//напишите тут ваш код

    }
}
