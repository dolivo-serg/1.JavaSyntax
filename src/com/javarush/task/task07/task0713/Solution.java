package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> data = new ArrayList<Integer>();
        ArrayList<Integer> triple = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            data.add(Integer.parseInt(reader.readLine()));
        }
        for (int j = 0; j < data.size(); j++){
            if (data.get(j)%3 == 0)
                triple.add(data.get(j));
            if (data.get(j)%2 == 0)
                even.add(data.get(j));
            if((data.get(j)%2 != 0) && (data.get(j)%3 != 0))
                other.add(data.get(j));
        }
        printList(triple);
        printList(even);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
   for (int i = 0; i < list.size(); i++){
       System.out.println(list.get(i));
   }
    }
}
