package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("first line");
        list.add("second line");
        list.add("third line");
        list.add("fourth line");
        list.add("fifth line");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
