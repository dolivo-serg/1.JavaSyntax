package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

import javax.swing.*;

public class Cat {

    String name;
    int age = 1;
    int weight = 2;
    String address;
    String color = "white";

    public Cat(String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;

    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public Cat(int weight, String color,String address){
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
