package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<Integer>();
        int tmpCount = 1;
        int count = 1;
        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
            if (i > 0 && array.get(i).equals(array.get(i - 1)))
                tmpCount++;
            else
                tmpCount = 1;
            if (tmpCount > count)
                count = tmpCount;
        }
        System.out.println(count);
    }
}
