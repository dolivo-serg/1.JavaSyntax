package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/
public class Solution {
    static int countSuccess = 0;

    private static void test (int i){
        if (i > 0) {
            countSuccess += 1;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int a = Integer.parseInt(text);
        test(a);
        String text2 = reader.readLine();
        int b = Integer.parseInt(text2);
        test(b);
        String text3 = reader.readLine();
        int c = Integer.parseInt(text3);
        test(c);

        System.out.println(countSuccess);





        /*if (a > 0 && b > 0 && c > 0)
            System.out.println("3");
            else if (a > 0 && b > 0 && c < 0)
                System.out.println("2");
                else if (a > 0 && b < 0 && c > 0)
                    System.out.println("2");
                    else if (a < 0 && b > 0 && c > 0)
                        System.out.println("2");
                        else if (a > 0 && b < 0 && c < 0)
                            System.out.println("1");
                            else if (a < 0 && b < 0 && c > 0)
                                System.out.println("1");
                                else if (a < 0 && b > 0 && c < 0)
                                    System.out.println("1");
                                        else
                                    System.out.println("0");


        //напишите тут ваш код*/


    }
}
