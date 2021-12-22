package ua.com.danit;

import java.util.Arrays;

public class Human {
    public Human(String artem, String popov, int i, Pet pet, Human mother, Human father) {
    }

    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    String name;
    String surname;
    int year;
    int iq;
    Pet myPet;
    static Human mother;
    static Human father;
    String[][] schedule = new String[][]{
            {DayOfWeek.MONDAY.name(), ""},
            {DayOfWeek.TUESDAY.name(), ""},
            {DayOfWeek.WEDNESDAY.name(), ""},
            {DayOfWeek.THURSDAY.name(), ""},
            {DayOfWeek.FRIDAY.name(), ""},
            {DayOfWeek.SATURDAY.name(), ""},
            {DayOfWeek.SUNDAY.name(), ""}
    };
    Family family;

    Human() {
        name = "";
        surname = "";
        year = -1;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
        schedule = null;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
    }

    public void createFamily(Human mother, Human father, Human[] childrens) {
        family.setFamily(mother, father, childrens);

    }

    public static Human showFather() {
        return father;
    }

    public static Human showMother() {
        return mother;
    }

    public void greetPet() {
        System.out.println("Привет, " + myPet.namePet());
    }

    public void describePet() {
        System.out.println("У меня есть " + myPet.SpeciesPet() + ",");
        System.out.println("ему " + myPet.AgePet() + "год(а),");
        if (myPet.trickLevelPet() > 50) {
            System.out.println("он очень хитрый");
        } else if (myPet.trickLevelPet() < 50) {
            System.out.println("он почти не хитрый");
        }
    }

    @Override
    public String toString() {
//        String[] infoSchedule = new String[7];
//        for (int i = 0; i < 7; i ++) {
//            infoSchedule[i] = Arrays.toString(new String[]{schedule[i][0]});
//        }
        String infoHumman = "Human {" +
             "name='" + name + "', " +
             "surname='" + surname + "', " +
             "year=" + year + ", " +
             "mother=" + mother.name + " " + mother.surname + ", " +
             "father=" + father.name + " " + father.surname + ", " +
             "pet=" + myPet.toString() +
        "}";
//        System.out.println("Day of week: " + Arrays.toString(infoSchedule));
        System.out.println(infoHumman);
        return infoHumman;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Human object is deleted: %s \n", this.toString());
    }
}
