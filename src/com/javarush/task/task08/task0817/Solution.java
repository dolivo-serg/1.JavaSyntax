package com.javarush.task.task08.task0817;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Batchaev", "Artem");
        map.put("Bavukina", "Eleonora");
        map.put("Baluk", "Eleonora");
        map.put("Borkovskaja", "Alina");
        map.put("Gitinova", "Patimat");
        map.put("druraboeva", "Zuhra");
        map.put("Dzuraboeva", "Fatima");
        map.put("Misostov", "Timofey");
        map.put("Shiryaev", "Alexey");
        map.put("Shilo", "Artem");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        ArrayList<String> listForRemove = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1 + i; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    check = true;
                    break;
                }
            }
            if (check) {
                listForRemove.add(list.get(i));
            }
            check = false;
        }
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            for (String iterator : listForRemove) {
                if (pair.getValue().equals(iterator)) {
                    removeItemFromMapByValue(map, pair.getValue());
                }
            }
        }                            

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {




    }
}
