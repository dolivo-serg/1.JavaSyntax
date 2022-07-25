package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<String, String>();
        people.put("Bulat", "Ira");
        people.put("Kovalchuck", "Inna");
        people.put("Borshova", "Igor");
        people.put("Golovina", "Tanja");
        people.put("Grevcev", "Roman");
        people.put("Kaljush", "Svetlana");
        people.put("Bosharkevich", "Denis");
        people.put("Nebogin", "Igor");
        people.put("Marchenko", "Igor");
        people.put("Melnikov", "Alexandr");
        return people;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        final int[] count = {0};
        map.forEach((s, s2) -> {if(s2.equals(name)) count[0]++;});
        return count[0];
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        final int[] count = {0};
        map.forEach((s, s2) -> {if(s.equals(lastName)) count[0]++;});
        return count[0];
    }

    public static void main(String[] args) {

    }
}
