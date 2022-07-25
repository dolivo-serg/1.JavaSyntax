package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Shkvir";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Neris";
        Zerg zerg3= new Zerg();
        zerg3.name = "Kvark";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Saru";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Dukat";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Zeratul";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Artanis";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Margulis";

        Terran terran1 = new Terran();
        terran1.name = "Михаил";
        Terran terran2 = new Terran();
        terran2.name = "Гавриил";
        Terran terran3 = new Terran();
        terran3.name = "Эпистафий";
        Terran terran4 = new Terran();
        terran4.name = "Джеймс";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
