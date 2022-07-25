package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Гриша", true, 78);
        Human grandfather2 = new Human("Yuriy", true, 84);
        Human grandmother1 = new Human("Ludmila", false, 75);
        Human grandmother2 = new Human("Julia", false, 85);
        Human father = new Human("Alex", true, 60, grandfather2, grandmother2);
        Human mother = new Human("Vicky", false, 52, grandfather1, grandmother1);
        Human child1 = new Human("Dolly", false, 30, father, mother);
        Human child2 = new Human("Dmitry", true, 26, father, mother);
        Human child3 = new Human("Nick", true, 10, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);








    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

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

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}