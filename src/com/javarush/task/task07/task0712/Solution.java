package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {

       ArrayList<String> list = new ArrayList<String>();
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       for ( int i = 0; i < 10; i++){
           list.add(reader.readLine());
       }
        int x = 0;//индекс максимального
        String xX = list.get(0);//значение из максимальной ячейки списка
        int y = 1;//индекс минимального
        String yY = list.get(0);//значение из минимальной ячейки списка

        int min = list.get(0).length();
        for(int i = 0; i < list.size();i++){
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                y = i;
                yY = list.get(i);
            }
        }
        int max = list.get(0).length();
        for(int j = 0; j < list.size();j++) {
            if (list.get(j).length() > max) {
                max = list.get(j).length();
                x = j;
                xX = list.get(j);
            }
        }

       if (x < y)
            System.out.println(xX);
       else
            System.out.println(yY);
    }
}
