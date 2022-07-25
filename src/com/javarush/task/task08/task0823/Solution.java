package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        System.out.println(toUpperCaseAllFirstChars(string));
    }

    public static String toUpperCaseAllFirstChars(String string) {
        string = string.trim();
        List<String> list = new ArrayList<String>();

        list.addAll(Arrays.asList(string.split(" +")));

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).substring(0, 1).toUpperCase() + list.get(i).substring(1));
        }
        string = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            string += " " + list.get(i);
        }
        return string;
    }
}
