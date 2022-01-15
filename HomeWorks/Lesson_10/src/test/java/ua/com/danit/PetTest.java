package ua.com.danit;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PetTest {
    @Test
    public void testToString() {
        String[] arrayHabits = new String[]{"sleep", "eat", "drink"};
        Pet defaultPet = new DefaultPet("DOG", "Loki", 3, 76, arrayHabits);

        assertEquals("Pets species: DOG, name: Loki, age: 3, trick level: 76, habits: [sleep, eat, drink]", defaultPet.toString());
    }
}