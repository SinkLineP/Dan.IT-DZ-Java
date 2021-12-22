package ua.com.danit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<Family> arrFamily = new ArrayList<Family>();

    public static void whileGC(int iteration) {
        int i;
        for (i = 0; i < iteration; i++) {
            Human test = new Human("Name", "Surname", 0000);
            return;
        }
    }

    public static void main(String[] args) throws Throwable {
        String[] arrayHabits;
        arrayHabits = new String[]{"sleep", "eat", "drink"};
        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        if (Arrays.toString(arrayHabits).equals("[]")) {
            System.out.println("Empty!");
            arrayHabits = new String[]{"no habits!"};
        }

        Human father = new Human("Yuri", "Poznokos", 1980);
        Human mother = new Human("Marina", "Popova", 1982);
        Pet pet = new Pet("Cat", "Skot", 4, 76, arrayHabits);
        Human children = new Human("Misha", "Popov", 2013, 100, pet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});
        Family family = new Family(mother, father);


        family.addChild(children);
        arrFamily.add(family);

        if (usedBytes < 400000000) {
            whileGC(10000);
        } else {
            whileGC(10000000);
        }
    }
}
