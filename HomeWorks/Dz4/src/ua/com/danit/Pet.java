package ua.com.danit;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    Pet() {
        species = "";
        nickname = "";
        age = -1;
        trickLevel = -1;
        habits = new String[0];
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    public String namePet() {
        return nickname;
    }

    public String SpeciesPet() {
        return species;
    }

    public int AgePet() {
        return age;
    }

    public int trickLevelPet() {
        return trickLevel;
    }

    @Override
    public String toString() {
        String info = species + "{" +
            "nickname='" + nickname + "', " +
            "age='" + age + "', " +
            "trickLevel='" + trickLevel + "', " +
            "habits=" + Arrays.toString(habits) +
        "}";
        System.out.println(info);
        return info;
    }
}










