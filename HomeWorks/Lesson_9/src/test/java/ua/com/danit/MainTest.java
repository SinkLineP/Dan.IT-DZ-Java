package ua.com.danit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void whileGC() {
        int iteration = 10000;
        int i;
        for (i = 0; i < iteration; i++) {
            Human test = new Man("Name", "Surname", 0000);
            assertEquals("Name: Name, surname: Surname, birthDate: 0", test.toString());
            return;
        }
    }

    @Test
    public void addPetToFamily() {
        Human test = new Man("Name", "Surname", 0000);
        String pet = "species: Dog, name: Jony, age: 10, trickLevel: 58, habits: ['sleep', 'eat']";
        String human = test.toString() + ", " + pet;

        assertEquals("Name: Name, surname: Surname, birthDate: 0, schedule: {WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}, species: Dog, name: Jony, age: 10, trickLevel: 58, habits: ['sleep', 'eat']", human);
    }
}