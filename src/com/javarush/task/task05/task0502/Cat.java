package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int i = 0;
        if (this.age > anotherCat.age) {
            i++;
        } else if (this.age < anotherCat.age) {
            i--;
        }
        if (this.weight > anotherCat.weight) {
            i++;
        } else if (this.weight < anotherCat.weight) {
            i--;
        }
        if (this.strength > anotherCat.strength) {
            i++;
        } else if (this.strength < anotherCat.strength) {
            i--;
        }
        if (i <= 0)
            return false;
        else
            return true;
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 2;
        cat.strength = 2;
        cat.weight = 2;

        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.strength = 3;
        cat1.weight = 4;

        System.out.println(cat.fight(cat1));

    }
}
