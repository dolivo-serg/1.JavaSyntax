package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        boolean l = false;
        boolean r = false;
        for (int i = 0; i < strings.size(); i++) {

            for(int j = 0; j < strings.get(i).length(); j++) {
                if (strings.get(i).charAt(j) == 'л') {
                    l = true;
                }
                else if (strings.get(i).charAt(j) == 'р') {
                    r = true;
                }
            }
            if (l && !r) {
                strings.add(i, strings.get(i));
                i++;
            }
            else if (r && !l) {
                strings.remove(strings.get(i));
                i--;
            }
            l = false;
            r = false;
        }
        return strings;
    }
}