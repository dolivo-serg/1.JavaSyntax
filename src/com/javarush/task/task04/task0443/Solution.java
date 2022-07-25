package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine();
        int y = Integer.parseInt(year);
        String month = reader.readLine();
        int m = Integer.parseInt(month);
        String date = reader.readLine();
        int d = Integer.parseInt(date);

        System.out.println("Меня зовут " + name + "." +
                "\nЯ родился " + d + "." + m + "." + y);
    }
}
