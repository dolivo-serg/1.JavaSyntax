package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Annan", 1500);
        map.put("Cfessa", 460);
        map.put("Bsdfgy", 800);
        map.put("Ofmdsnf", 2000);
        map.put("Pkjfsj", 4000);
        map.put("Msdfu", 16000);
        map.put("Ysdnf", 250);
        map.put("IIifususfi", 150);
        map.put("Ldfnwfv", 700);
        map.put("Asdsgfsdiuw", 750);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> iterator : copy.entrySet()){
            if (iterator.getValue() < 500){
                map.remove(iterator.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}