package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
    Map<String, String> people = new HashMap<>();
        people.put("Пупкин", "Сергей");
        people.put("Пупкин", "Роман");
        people.put("Ступкин", "Сергей");
        people.put("Бабкин", "Сергей");
        people.put("Ломов", "Федор");
        people.put("Журтков", "Андрей");
        people.put("Стрепанов", "Сергей");
        people.put("Ролакин", "Сергей");
        people.put("Ропкуз", "Степан");
        people.put("Пупкин", "Емельян");
        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
