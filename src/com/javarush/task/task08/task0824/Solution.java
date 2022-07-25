package com.javarush.task.task08.task0824;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human children1 = new Human("Анатолий", true, 12);
        Human children2 = new Human("Лилия", false, 8);
        Human children3 = new Human("Руслан", true, 2);

        Human father = new Human("Генадий", true, 42);
        father.children = Arrays.asList(children1, children2, children3);
        Human mother = new Human("Кира", false, 38);
        mother.children = Arrays.asList(children1, children2, children3);

        Human grandmother2 = new Human("Светлана", false, 80);
        grandmother2.children = Collections.singletonList(mother);
        Human grandfather2 = new Human("Генадий", true, 90);
        grandfather2.children = Collections.singletonList(mother);
        Human grandmother1 = new Human("Алла", false, 100);
        grandmother1.children = Collections.singletonList(father);
        Human grandfather1 = new Human("Олег", true, 73);
        grandfather1.children = Collections.singletonList(father);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(grandfather2);
        System.out.println(grandfather1);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
