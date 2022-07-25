package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }
        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            if (isNumber(array[left])) {
                int value = Integer.parseInt(array[left]);
                // Перемещаемся по элементам, которые перед вытащенным элементом
                int i = left - 1;
                for (; i >= 0; i--) {
                    // Если вытащили значение меньшее — передвигаем больший элемент дальше
                    if (isNumber(array[i])&& value > Integer.parseInt(array[i]))
                        array[i + 1] = array[i];
                    else if (!isNumber(array[i]))
                        array[i + 1] = array[i];
                    else  break;// Если вытащенный элемент больше — останавливаемся
                }
                // В освободившееся место вставляем вытащенное значение
                array[i + 1] = Integer.toString(value);
            }
            else {
                String value = array[left];
                // Перемещаемся по элементам, которые перед вытащенным элементом
                int i = left - 1;
                for (; i >= 0; i--) {
                    // Если вытащили значение меньшее — передвигаем больший элемент дальше
                    if (!isNumber(array[i])&& isGreaterThan(array[i], value))
                        array[i + 1] = array[i];
                    else if (isNumber(array[i]))
                        array[i + 1] = array[i];
                    else  break;// Если вытащенный элемент больше — останавливаемся
                }
                // В освободившееся место вставляем вытащенное значение
                array[i + 1] = value;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
