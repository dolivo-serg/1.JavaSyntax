package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        long number = getNumber();
            while (true) {
                if (number % 2 == 0)
                    even++;
                else
                    odd++;
                number /= 10;

                if (number < 1) break;
            }
            System.out.println("Even: " + even + " Odd: " + odd);
        }
        public static long getNumber() throws IOException {
            long number ;
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                number = Long.parseLong(reader.readLine());
                if (number > 0) break;

            }
            return number;
        }
}

//for (int i = 0; i < s.length(); i++) {
//        if (number % 2 == 0) {
//        even++;
//       }
//       else
//       odd++;
//       number /= 10;
//}