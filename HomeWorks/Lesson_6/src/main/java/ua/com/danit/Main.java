package ua.com.danit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    static List<Family> arrFamily = new ArrayList<Family>();

    public static void whileGC(int iteration) {
        int i;
        for (i = 0; i < iteration; i++) {
            Man test = new Man("Name", "Surname", 0000);
            return;
        }

    }

    public static void createFamily(Pet pet) {
        Human father = new Man("Yuri", "Poznokos", 1980);
        Human mother = new Woman("Marina", "Popova", 1982);
        Human children = new Children("Misha", "Popov", 2013, 100, pet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});
        Family family = new Family(mother, father);

        family.addChild(children);
        arrFamily.add(family);
    }

    public static void main(String[] args) {
        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        // array habits pet
        String[] arrayHabits;
        arrayHabits = new String[]{"sleep", "eat", "drink"};
        if (Arrays.toString(arrayHabits).equals("[]")) {
            System.out.println("Empty!");
            arrayHabits = new String[]{"no habits!"};
        }

        //filter species
        String[] species = {"UNKNOWN"};
        String inputPet = "Dog";
        System.out.println();
        String newSpecies = inputPet.toUpperCase(Locale.ROOT);

        switch (newSpecies) {
            case "DOMESTICCAT":
                DomesticCat domesticCat = new DomesticCat(newSpecies, "Dominic", 4, 76, arrayHabits);
                createFamily(domesticCat);
                domesticCat.display();
                break;
            case "FISH":
                Fish fish = new Fish("FISH", "Goldi", 4, 76, arrayHabits);
                createFamily(fish);
                fish.display();
                break;
            case "DOG":
                Dog dog = new Dog("DOG", "Jeck", 4, 76, arrayHabits);
                createFamily(dog);
                dog.display();
                break;
            case "ROBOCAT":
                RoboCat roboCat = new RoboCat("ROBOCAT", "Robic", 4, 76, arrayHabits);
                createFamily(roboCat);
                roboCat.display();
                break;
            default:
                DefaultPet defaultPet = new DefaultPet("UNKNOWN", "UNKNOWN", 0, 0, species);
                createFamily(defaultPet);
                defaultPet.display();
                break;
        }

        //GC
        if (usedBytes < 400000000) {
            whileGC(10000);
        } else {
            whileGC(10000000);
        }
    }
}
