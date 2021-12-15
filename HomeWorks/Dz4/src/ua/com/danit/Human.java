package ua.com.danit;

import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet myPet;
    static Human mother;
    static Human father;
    String[][] schedule;
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
        this.schedule = schedule;
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
        String infoHumman = "Human {" +
             "name='" + name + "', " +
             "surname='" + surname + "', " +
             "year=" + year + ", " +
             "mother=" + mother.name + " " + mother.surname + ", " +
             "father=" + father.name + " " + father.surname + ", " +
             "pet=" + myPet.toString() +
        "}";
        System.out.println(infoHumman);
        return infoHumman;
    }
}
