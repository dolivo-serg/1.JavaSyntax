package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int left;
    int top;
    int width;
    int height;

    public Rectangle (int left){
     this.left = left;
     this.top = 0;
     this.width= 0;
     this. height = 0;
    }

    public Rectangle (int left, int top){
        this.left = left;
        this.top = top;
        this.width= 0;
        this. height = 0;
    }

    public Rectangle (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width= width;
        this. height = 0;
    }

    public Rectangle (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width= width;
        this. height = height;
    }




    public static void main(String[] args) {

    }
}
