package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int age = 1;
    private int weight = 3;
    private String address = null;
    private String color = "black";

    public void initialize(String name){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = age;
    }
}