package com.javarush.task.task08.task0813;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> l = new HashSet<String>();
        for (int i = 1; i <= 20; i++) {
            l.add("Л" + (char)(i+100));
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
