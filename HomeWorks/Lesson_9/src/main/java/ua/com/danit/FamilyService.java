package ua.com.danit;

import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao FamilyDB;

    FamilyService() {
        this.FamilyDB = new CollectionFamilyDao();
    }

    List<Family> getAllFamilies() {
        return FamilyDB.getAllFamilies();
    }

    void displayAllFamilies() {
        System.out.println("----Displaying families----");
        FamilyDB.getAllFamilies().forEach(System.out::println);
        System.out.println("---------------------------");
    }

    List<Family> getFamiliesBiggerThan(int amount) {
        List<Family> newFamilies;
        newFamilies = getAllFamilies().stream()
                .filter(family -> family.countFamily() > amount)
                .collect(Collectors.toList());

        System.out.printf("%d families where found \n", newFamilies.size());
        return newFamilies;
    }

    List<Family> getFamiliesLessThan(int amount) {
        List<Family> newFamilies;
        newFamilies = getAllFamilies().stream()
                .filter(family -> family.countFamily() < amount)
                .collect(Collectors.toList());

        System.out.printf("%d families where found \n", newFamilies.size());
        return newFamilies;
    }

    int countFamiliesWithMemberNumber(int amount) {
        List<Family> newFamilies;
        newFamilies = getAllFamilies().stream()
                .filter(family -> family.countFamily() == amount)
                .collect(Collectors.toList());

        System.out.println("======Families=Found========");
        return newFamilies.size();

    }

    Family createNewFamily(Human mother, Human father) {
        Family family = new Family(mother, father);
        FamilyDB.saveFamily(family);
        return family;
    }

    void deleteFamilyByIndex(int index) {
        FamilyDB.deleteFamily(index);
    }

    Family bornChild(Family family, String manName, String girlName) {
        int randomValue = new Random().nextInt(2);
        String surname = family.father.surname;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Man boy;
        Woman girl;

        switch (randomValue) {
            case 0:
                girl = new Woman(girlName, surname, year);
                family.addChild(girl);
                break;
            case 1:
                boy = new Man(manName, surname, year);
                family.addChild(boy);
                break;

        }
        FamilyDB.saveFamily(family);
        return family;
    }


    Family adoptChild(Family family, Human child) {
        family.addChild(child);
        FamilyDB.saveFamily(family);
        System.out.println("========Adopt=========");
        System.out.println("- One child adopt to Family.");
        return family;
    }


    void deleteAllChildrenOlderThen(int age) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        getAllFamilies().forEach(item -> {
            item.childrens.removeIf(child -> currentYear - child.birthDate > age);
            FamilyDB.saveFamily(item);
        });
    }

    void deleteAllFamilies(){
        FamilyDB.deleteAllFamilies();
    }


    int count() {
        return getAllFamilies().size();
    }


    Family getFamilyById(int index) {
        return getAllFamilies().get(index);
    }

    Set<Pet> getPets(int index) {
        return (Set<Pet>) getFamilyById(index).childrens.get(index).myPet;
    }
}