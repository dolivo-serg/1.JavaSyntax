package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] words = {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < words.length; i++){
        list.add(words[i]);
        list.add("именно");
    }
    for (int i = 0; i < list.size(); i++)
        System.out.println(list.get(i));
    }
}
