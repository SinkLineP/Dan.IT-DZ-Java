package ua.com.danit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<Family> arrFamily = new ArrayList<Family>();
    public static void main(String[] args) {
        String[] arrayHabits;

        arrayHabits = new String[]{"sleep", "eat", "drink"};

        if (Arrays.toString(arrayHabits).equals("[]")) {
            System.out.println("Empty!");
            arrayHabits = new String[]{"no habits!"};
        }


        Human father = new Human("Yuri", "Poznokos", 1980);
        Human mother = new Human("Marina", "Popova", 1982);
        Pet pet = new Pet("Cat", "Skot", 4, 76, arrayHabits);
        Human children = new Human("Misha", "Popov", 2013, 100, pet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});
        Family family = new Family(mother, father);

        children.describePet();
        children.greetPet();
        children.toString();
        System.out.println("==================");
        pet.eat();
        pet.foul();
        pet.toString();
        System.out.println("==================");
        family.addChild(children);
        family.addChild(new Human("Artem", "Popov", 2003, 15, pet, mother, father, new String[][]{{"day3", "day4"}, {"task3", "task4"}}));
        family.countFamily();
        family.deleteChild(0);
        family.countFamily();
        family.toString();
        arrFamily.add(family);
        System.out.println(arrFamily);
    }
}
