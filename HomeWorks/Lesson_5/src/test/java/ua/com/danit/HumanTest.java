package ua.com.danit;

import static org.junit.Assert.*;

public class HumanTest {

    @org.junit.Test
    public void testToString() {
        String[] arrayHabits = new String[]{"sleep", "eat", "drink"};
        Human father = new Human("Yuri", "Poznokos", 1980);
        Human mother = new Human("Marina", "Popova", 1982);
        Pet pet = new Pet("Cat", "Skot", 4, 76, arrayHabits);
        Human human = new Human("Artem", "Popov", 2003, 55, pet, mother, father, new String[][]{{"day1", "day2"}, {"task1", "task2"}});

        assertEquals(
            "Human {" +
                "name='Artem', " +
                "surname='Popov', " +
                "year=2003, " +
                "mother=Marina Popova, " +
                "father=Yuri Poznokos, " +
                "pet=DOG{" +
                    "nickname='Skot', " +
                    "age='4', " +
                    "trickLevel='76', " +
                    "habits=[" +
                        "sleep, " +
                        "eat, " +
                        "drink" +
                    "]" +
                "}" +
            "}",
            human.toString()
        );
    }
}