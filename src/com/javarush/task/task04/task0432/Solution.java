package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        String s1 = reader.readLine();
        int n = Integer.parseInt(s1);

        int i = 1;
        while (i <= n) {
            System.out.println(s);
            i++;
        }

    }

}