package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("doo");
        list1.add("ron");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("dun");
        list2.add("don");
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("dodoro");
        list3.add("dororon");
        ArrayList<ArrayList<String>> listLists = new ArrayList<ArrayList<String>>();
        listLists.add(list1);
        listLists.add(list2);
        listLists.add(list3);
        ArrayList<String>[] arrayLists = new ArrayList[3];
        return listLists.toArray(arrayLists);
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}