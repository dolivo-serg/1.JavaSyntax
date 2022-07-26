package com.javarush.task.task10.task1012;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        StringBuilder data = new StringBuilder();
        for (String s : list)
            data.append(s);

        int[] counters = new int[alphabet.size()];

        for (Character it : data.toString().toCharArray()){
            for(int i = 0; i < alphabet.size(); i++) {
                if (it.equals(alphabet.get(i)))
                    counters[i]++;
            }
        }

        for (int i = 0; i < alphabet.size(); i++)
        System.out.println(alphabet.get(i) + " " + counters[i]);
    }
}



