package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        cats.remove(it.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set <Cat> cats = new HashSet<Cat>();
        for (int i=0; i<3; i++){
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> it = cats.iterator();
        while (it.hasNext())
        {

            System.out.println(it.next());
        }

    }

        public static class Cat{
    }
}
