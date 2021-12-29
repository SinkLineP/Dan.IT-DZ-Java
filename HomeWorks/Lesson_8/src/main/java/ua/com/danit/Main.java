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

    public static void addPetToFamily(Pet pet) {
        Human father = new Man("Yuri", "Poznokos", 1980);
        Human mother = new Woman("Marina", "Popova", 1982);
        Human children = new Children("Misha", "Popov", 2013, 100, pet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});
        Family family = new Family(mother, father);

        family.addChild(children);
        arrFamily.add(family);

        System.out.println(mother);
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
        String inputPet = "Dog";
        System.out.println();
        String newSpecies = inputPet.toUpperCase(Locale.ROOT);

        switch (newSpecies) {
            case "DOMESTICCAT":
                DomesticCat domesticCat = new DomesticCat(newSpecies, "Dominic", 4, 76, arrayHabits);
                addPetToFamily(domesticCat);
                domesticCat.display();
                break;
            case "FISH":
                Fish fish = new Fish("FISH", "Goldi", 4, 76, arrayHabits);
                addPetToFamily(fish);
                fish.display();
                break;
            case "DOG":
                Dog dog = new Dog("DOG", "Jeck", 4, 76, arrayHabits);
                addPetToFamily(dog);
                dog.display();
                break;
            case "ROBOCAT":
                RoboCat roboCat = new RoboCat("ROBOCAT", "Robic", 4, 76, arrayHabits);
                addPetToFamily(roboCat);
                roboCat.display();
                break;
            default:
                DefaultPet defaultPet = new DefaultPet("UNKNOWN", "UNKNOWN", 0, 0, species);
                addPetToFamily(defaultPet);
                defaultPet.display();
                break;
        }

        //GC
        if (usedBytes < 400000000) {
            whileGC(10000);
        } else {
            whileGC(10000000);
        }

        //test family controller
        Human mother1 = new Woman("Woman1", "Surname1", 1970);
        Human father1 = new Man("Father1", "Surname1", 1970);

        Human adoptedSon1 = new Man("Adopted_1", "Surname1", 1970);

        FamilyController familyController = new FamilyController();
        Family family1 = familyController.createNewFamily(mother1, father1);


        familyController.bornChild(family1, "TestManName-Ivan", "TestWomanName-Inna");
        familyController.bornChild(family1, "TestManName-Igor", "TestWomanName-Ira");
        familyController.getFamiliesBiggerThan(3);
        familyController.getFamiliesLessThan(3);
        familyController.countFamiliesWithMemberNumber(4);

        familyController.adoptChild(family1,adoptedSon1);

        familyController.deleteAllChildrenOlderThen(10);

        System.out.println(familyController.count());
        System.out.println(familyController.getFamilyById(2));
        System.out.println(familyController.getPets(0));

        familyController.getFamiliesBiggerThan(-1);
        familyController.deleteFamilyByIndex(1);
        familyController.displayAllFamilies();
    }
}
