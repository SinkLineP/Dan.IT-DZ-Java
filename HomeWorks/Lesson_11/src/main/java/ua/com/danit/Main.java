package ua.com.danit;

import java.util.*;


public class Main {
    static List<Family> arrFamily = new ArrayList<Family>();

    public static void whileGC(int iteration) {
        int i;
        for (i = 0; i < iteration; i++) {
            Man test = new Man("Name", "Surname", 0000);
            return;
        }

    }

    public static void main(String[] args) {
        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        // array habits pet
        HashSet<String> arrayHabits = new HashSet<String>();
        arrayHabits.add("sleep");
        arrayHabits.add("eat");
        arrayHabits.add("drink");

        //filter species
        String[] species = {"UNKNOWN"};
        String inputPet = "domesticcat";
        String newSpecies = inputPet.toUpperCase(Locale.ROOT);

        switch (newSpecies) {
            case "DOMESTICCAT":
                DomesticCat domesticCat = new DomesticCat(newSpecies, "Dominic", 4, 76, arrayHabits);
                domesticCat.addPet(domesticCat);
                break;
            case "FISH":
                Fish fish = new Fish("FISH", "Goldi", 4, 76, arrayHabits);
                fish.addPet(fish);
                break;
            case "DOG":
                Dog dog = new Dog("DOG", "Jeck", 4, 76, arrayHabits);
                dog.addPet(dog);
                break;
            case "ROBOCAT":
                RoboCat roboCat = new RoboCat("ROBOCAT", "Robic", 4, 76, arrayHabits);
                roboCat.addPet(roboCat);
                break;
            default:
                DefaultPet defaultPet = new DefaultPet("UNKNOWN", "UNKNOWN", 0, 0, species);
                defaultPet.addPet(defaultPet);
                break;
        }



        //GC
        if (usedBytes < 400000000) {
            whileGC(10000);
        } else {
            whileGC(10000000);
        }

        ConsoleApp.startApp();
        
//        Human father = new Man("Yuri", "Poznokos", 12, 12, 1980, 100);
//        Human mother = new Woman("Marina", "Popova", 21, 11, 1982, 100);
//        Human childrenBoyFirst = new Children("Misha", "Popov",13, 10, 2013, 100, mother, father, "boy", "null", "null");
//        Human childrenBoySecond = new Children("Artem", "Popov",13, 9, 2003, 55, mother, father, "boy", "null", "null");
//        Human childrenGirlFirst = new Children("Karina", "Popova",5, 3, 2004, 80, mother, father, "girl", "music", "Friday");
//        Family family = new Family(mother, father);
//
//        family.addChild(childrenBoyFirst);
//        family.addChild(childrenGirlFirst);
//        family.addChild(childrenBoySecond);
//        arrFamily.add(family);

//        family.prettyFormat();
    }
}
