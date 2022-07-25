package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
       Man man = new Man("Tom", 23,"Baker Street");
       Man man1 = new Man("Jerry", 18, "Karnival Road");
       Woman woman = new Woman("Tamara", 30, "Switzeland");
       Woman woman1 = new Woman("Veronika", 30, "Dmitrievskaja Street");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}