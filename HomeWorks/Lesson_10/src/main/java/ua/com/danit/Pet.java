package ua.com.danit;

import java.util.Arrays;
import java.util.HashSet;

abstract class Pet implements Foul {
    public static String[] DayOfWeek;

    String nickname;
    int age;
    int trickLevel;
    String[] habits;
    String species;

    public abstract void eat();
    public abstract String namePet();
    public abstract String SpeciesPet();
    public abstract int AgePet();
    public abstract int trickLevelPet();


}

class Fish extends Pet {
    Fish(String species, String nickname, int age, int trickLevel, HashSet<String> arrayHabits) {
        super();
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = arrayHabits.toArray(new String[0]);
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public String namePet() {
        return nickname;
    }
    public String SpeciesPet() {return species;}
    public int AgePet() {
        return age;
    }
    public int trickLevelPet() {
        return trickLevel;
    }
    public void display() {
        System.out.printf(
                "Pets species: %s, name: %s, age: %d, trick level: %d, habits: %s \n",
                species,
                nickname,
                age,
                trickLevel,
                Arrays.toString(habits)
        );
        System.out.printf("foul: %s \n", add(""));
        System.out.println();
    }

    @Override
    public String add(String foulText) {
        return null;
    }
}
class DefaultPet extends Pet {
    DefaultPet(String species, String nickname, int age, int trickLevel, String[] arrayHabits) {
        super();
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = arrayHabits;
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public String namePet() {
        return nickname;
    }
    public String SpeciesPet() {return species;}
    public int AgePet() {
        return age;
    }
    public int trickLevelPet() {
        return trickLevel;
    }
    public long[] display() {
        System.out.printf(
                "Pets species: %s, name: %s, age: %d, trick level: %d, habits: %s \n",
                species,
                nickname,
                age,
                trickLevel,
                Arrays.toString(habits)
        );
        System.out.printf("foul: %s \n", add(""));
        System.out.println();
        return new long[0];
    }

    @Override
    public String add(String foulText) {
        return null;
    }

    @Override
    public String toString() {
        String infoPet = "Pets species: DOG, " +
                "name: " + nickname + ", " +
                "age: " + age + ", " +
                "trick level: " + trickLevel + ", " +
                "habits: " + Arrays.toString(habits) + "";
        System.out.println(infoPet);
        return infoPet;
    }
}
class DomesticCat extends Pet {
    DomesticCat(String species, String nickname, int age, int trickLevel, HashSet<String> arrayHabits) {
        super();
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = arrayHabits.toArray(new String[0]);
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public String namePet() {
        return nickname;
    }
    public String SpeciesPet() {return species;}
    public int AgePet() {
        return age;
    }
    public int trickLevelPet() {
        return trickLevel;
    }
    public void display() {
        System.out.printf(
                "Pets species: %s, name: %s, age: %d, trick level: %d, habits: %s \n",
                species,
                nickname,
                age,
                trickLevel,
                Arrays.toString(habits)
        );
        System.out.printf("foul: %s \n", add("Нужно хорошо замести следы..."));
        System.out.println();
    }

    @Override
    public String add(String foulText) {
        return foulText;
    }
}
class Dog extends Pet {
    Dog(String species, String nickname, int age, int trickLevel, HashSet<String> arrayHabits) {
        super();
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = arrayHabits.toArray(new String[0]);
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public String namePet() {
        return nickname;
    }
    public String SpeciesPet() {return species;}
    public int AgePet() {
        return age;
    }
    public int trickLevelPet() {
        return trickLevel;
    }
    public void display() {
        System.out.printf(
                "Pets species: %s, name: %s, age: %d, trick level: %d, habits: %s \n",
                species,
                nickname,
                age,
                trickLevel,
                Arrays.toString(habits)
        );
        System.out.printf("foul: %s \n", add("Нужно хорошо замести следы..."));
        System.out.println();
    }

    @Override
    public String add(String foulText) {
        return foulText;
    }
}
class RoboCat extends Pet {
    RoboCat(String species, String nickname, int age, int trickLevel, HashSet<String> arrayHabits) {
        super();
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = arrayHabits.toArray(new String[0]);
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public String namePet() {
        return nickname;
    }
    public String SpeciesPet() {return species;}
    public int AgePet() {
        return age;
    }
    public int trickLevelPet() {
        return trickLevel;
    }
    public void display() {
        System.out.printf(
                "Pets species: %s, name: %s, age: %d, trick level: %d, habits: %s \n",
                species,
                nickname,
                age,
                trickLevel,
                Arrays.toString(habits)
        );
        System.out.printf("foul: %s \n", add(""));
        System.out.println();
    }

    @Override
    public String add(String foulText) {
        return null;
    }
}