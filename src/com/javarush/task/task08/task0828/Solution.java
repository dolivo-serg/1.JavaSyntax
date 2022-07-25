package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> months = new ArrayList<>();
        months.add("January is the 1 month");
        months.add("February is the 2 month");
        months.add("March is the 3 month");
        months.add("April is the 4 month");
        months.add("May is the 5 month");
        months.add("June is the 6 month");
        months.add("July is the 7 month");
        months.add("August is the 8 month");
        months.add("September is the 9 month");
        months.add("October is the 10 month");
        months.add("November is the 11 month");
        months.add("December is the 12 month");
        String month = reader.readLine();
        for (String iterator : months){
            if (iterator.contains(month))
                System.out.println(iterator);
        }

    }
}
