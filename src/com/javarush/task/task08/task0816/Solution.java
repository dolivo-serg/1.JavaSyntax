package com.javarush.task.task08.task0816;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 12 2012"));
        map.put("Петров", dateFormat.parse("MAY 25 2012"));
        map.put("Слонов", dateFormat.parse("MAY 2 2012"));
        map.put("Тортов", dateFormat.parse("MAY 8 2012"));
        map.put("Громов", dateFormat.parse("MAY 9 2012"));
        map.put("Обломова", dateFormat.parse("AUGUST 10 2012"));
        map.put("Пролётин", dateFormat.parse("JULY  4 2012"));
        map.put("Смалец", dateFormat.parse("MAY 3 2012"));
        map.put("Кукухин", dateFormat.parse("MAY 19 2012"));
               return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Date> iterator : copyMap.entrySet()) {
            if (iterator.getValue().getMonth() > 4 && iterator.getValue().getMonth() < 8) {
                map.remove(iterator.getKey());
            }
        }

    }

    public static void main(String[] args) throws ParseException {

    }
}