package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

        String str1 = "I love Java";

     //обе переменные-ссылки указывают на одну строку.
        System.out.println(str1);

        str1 = str1.replace("Java", "Python");//попробуем изменить состояние str1, заменив слово "Java" на “Python”
        System.out.println(str1);
    }

    public static class Human {
       private String name;
       private String lastName;
       private boolean sex;
       private int age;
       private int weight;
       private int height;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(boolean sex, int age, int weight, int height) {
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, boolean sex, int age, int height) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String lastName, boolean sex, int age) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String lastName, boolean sex, int age, int weight) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String lastName, boolean sex, int age, int weight, int height) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}



