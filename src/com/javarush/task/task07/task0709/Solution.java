package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++ ){
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        for(int i = 1; i < list.size();i++){
        if (list.get(i).length() < min)
            min = list.get(i).length();
        }

        for(int j = 0; j < list.size(); j++){
            if (list.get(j).length() == min)
                System.out.println(list.get(j));
        }
    }
}
