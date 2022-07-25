package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String yearsText = reader.readLine();
        String name = reader.readLine();
        int years = Integer.parseInt(yearsText);//напишите тут ваш код
        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
