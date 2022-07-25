package com.javarush.task.task04.task0426;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String text = reader.readLine();
       int a = Integer.parseInt(text);

       if (a > 0 && a % 2 == 0)
           System.out.println("положительное четное число");
       else if (a < 0 && a % 2 != 0)
           System.out.println("отрицательное нечетное число");
       else if (a > 0 && a % 2 != 0)
           System.out.println("положительное нечетное число");
       else if (a < 0 && a % 2 == 0)
           System.out.println("отрицательное четное число");
       else if (a == 0)
           System.out.println("ноль");

    }
}
