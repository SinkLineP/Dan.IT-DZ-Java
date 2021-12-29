package ua.com.danit;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HumanTest {

    @org.junit.Test
    public void testToString() {
        Human test = new Man("Name", "Surname", 0000);
        assertEquals("Name: Name, surname: Surname, year: 0", test.toString());
    }

    @Test
    public void hashMapSchedule() {
        HashMap<String, String> scheduleMap = new HashMap<>();

        scheduleMap.put(Human.DayOfWeek.MONDAY.name(), "Go to school");
        scheduleMap.put(Human.DayOfWeek.TUESDAY.name(), "Go to shop");
        scheduleMap.put(Human.DayOfWeek.WEDNESDAY.name(), "Go to travel");
        scheduleMap.put(Human.DayOfWeek.THURSDAY.name(), "Home working");
        scheduleMap.put(Human.DayOfWeek.FRIDAY.name(), "Walk");
        scheduleMap.put(Human.DayOfWeek.SATURDAY.name(), "Sleep");
        scheduleMap.put(Human.DayOfWeek.SUNDAY.name(), "Sleep");

        assertEquals(scheduleMap.values(), scheduleMap.values());
    }

    @Test
    public void greetPet() {
        String namePet = "Jony";
        String name = "Mark";
        String output = "Привет - " + namePet + ", это я твой хозяин - " + name;

        assertEquals("Привет - Jony, это я твой хозяин - Mark", output);
    }
}