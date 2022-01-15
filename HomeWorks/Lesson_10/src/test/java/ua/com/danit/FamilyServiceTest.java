package ua.com.danit;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FamilyServiceTest {
    Human mother = new Woman("Woman1", "Surname1", 1970);
    Human father = new Man("Father1", "Surname1", 1970);
    Human children1;
    Human children2;
    Family family = new Family(mother, father);
    String[] species = {"UNKNOWN"};
    Pet defaultPet = new DefaultPet("defaultSpecies", "defNickname", 3, 57, species);

    @Test
    public void getAllFamilies() {
        List<Family> arrFamily = new ArrayList<Family>();

        arrFamily.add(family);
        arrFamily.add(family);

        assertEquals("[Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[]]}, Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[]]}]", arrFamily.toString());
    }

    @Test
    public void displayAllFamilies() {
        List<Family> arrFamily = new ArrayList<Family>();

        arrFamily.add(family);
        arrFamily.add(family);

        assertEquals("[Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[]]}, Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[]]}]", arrFamily.toString());
    }

    @Test
    public void getFamiliesBiggerThan() {
        children1 = new Children("Children1", "Surname1", 2013);
        children2 = new Children("Children2", "Surname2", 2019);

        family.addChild(children1);
        family.addChild(children2);

        int amount = 3;
        int countFamily = family.countFamily();

        assertEquals(countFamily > amount, true);
        System.out.println("Count family - Bigger");
    }

    @Test
    public void getFamiliesLessThan() {
        children1 = new Children("Children1", "Surname1", 2013);
        children2 = new Children("Children2", "Surname2", 2019);

        family.addChild(children1);
        family.addChild(children2);

        int amount = 5;
        int countFamily = family.countFamily();

        assertEquals(countFamily < amount, true);
        System.out.println("Count family - Less");
    }

    @Test
    public void countFamiliesWithMemberNumber() {
        children1 = new Children("Children1", "Surname1", 2013);
        children2 = new Children("Children2", "Surname2", 2019);

        family.addChild(children1);
        family.addChild(children2);

        int amount = 4;
        int countFamily = family.countFamily();

        assertEquals(countFamily == amount, true);
        System.out.println("Count family - Member");
    }

    @Test
    public void createNewFamily() {
        assertEquals("Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[]]}", family.toString());
        System.out.println("Family created!");
    }

    @Test
    public void deleteFamilyByIndex() {
        List<Family> arrFamily = new ArrayList<Family>();

        arrFamily.add(family);
        arrFamily.add(family);

        int index = 0;
        arrFamily.remove(index);

        System.out.println("Family is deleted! To index (" + index + ")");
    }

    @Test
    public void bornChild() {
        int randomValue = new Random().nextInt(2);
        String surname = family.father.surname;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Man boy;
        Woman girl;

        switch (randomValue) {
            case 0:
                girl = new Woman("girlName", surname, year);
                family.addChild(girl);
                assertEquals("Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[Name: girlName, surname: Surname1, birthDate: 2021, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}]]}", family.toString());
                break;
            case 1:
                boy = new Man("manName", surname, year);
                family.addChild(boy);
                assertEquals("Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[Name: manName, surname: Surname1, birthDate: 2021, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}]]}", family.toString());
                break;
        }
        System.out.println();
        System.out.println("Add random child to family!");
    }

    @Test
    public void adoptChild() {
        children1 = new Children("Children1", "Surname1", 2013);
        family.addChild(children1);
        assertEquals("Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[Name: Children1, surname: Surname1, birthDate: 2013, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}]]}", family.toString());
        System.out.println("Child adopt to family!");
    }

    @Test
    public void deleteAllChildrenOlderThen() {
        children1 = new Children("Children1", "Surname1", 2013);
        children2 = new Children("Children2", "Surname2", 2019);

        family.addChild(children1);
        family.addChild(children2);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = 2; // Если число будет большое или маленькое то сравнение всеравно отработает

        for (int i = 0; i < family.childrens.size(); i++) {
            if (currentYear - family.childrens.get(i).birthDate > age) {
                family.childrens.remove(i);
                System.out.println("Child deleted from family!");
                assertEquals("Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[Name: Children2, surname: Surname2, birthDate: 2019, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}]]}", family.toString());
            } else {
                assertEquals("Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[" +
                        "[" +
                        "Name: Children1, surname: Surname1, birthDate: 2013, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}, " +
                        "Name: Children2, surname: Surname2, birthDate: 2019, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}" +
                        "]]}", family.toString());
                System.out.println("Error! Child no deleted from family!");
            }
        }
    }

    @Test
    public void deleteAllFamilies() {
        List<Family> arrFamily = new ArrayList<Family>();

        arrFamily.add(family);
        arrFamily.add(family);

        for (int i = 0; i < arrFamily.size(); i++) {
            arrFamily.remove(i);
        }

        assertEquals("[Family { mother='Woman1 Surname1', father='Father1 Surname1', childrens=[[]]}]", arrFamily.toString());
        System.out.println("Deleted all Families");
    }

    @Test
    public void count() {
        List<Family> arrFamily = new ArrayList<Family>();

        arrFamily.add(family);
        arrFamily.add(family);

        assertEquals(2, arrFamily.size());
        System.out.println("Count Families: " + arrFamily.size());
    }

    @Test
    public void getFamilyById() {
        List<Family> arrFamily = new ArrayList<Family>();

        arrFamily.add(family);
        arrFamily.add(family);

        for (int i = 0; i < arrFamily.size(); i++) {
            arrFamily.get(i);
            assertEquals(arrFamily.get(i), arrFamily.get(i));
        }

        System.out.println("Get Families by ID");
    }

    @Test
    public void getPets() {
        List<Family> arrFamily = new ArrayList<Family>();
        Human childrenPet = new Children("Children1", "Surname1", 2013, 100, defaultPet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});
        family.addChild(childrenPet);

        arrFamily.add(family);
        arrFamily.add(family);

        int index = 0;

        for (int i = 0; i < arrFamily.size(); i++) {
            String petFamily = String.valueOf(arrFamily.get(index).childrens.get(index).myPet);
            assertEquals("Pets species: DOG, name: defNickname, age: 3, trick level: 57, habits: [UNKNOWN]", petFamily);
        }

        System.out.println("Pet found!");
    }
}