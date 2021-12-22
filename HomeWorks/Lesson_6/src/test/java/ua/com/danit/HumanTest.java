package ua.com.danit;

import static org.junit.Assert.*;

public class HumanTest {

    @org.junit.Test
    public void testToString() {
        Human test = new Man("Name", "Surname", 0000);
        assertEquals("Name: Name, surname: Surname, year: 0", test.toString());
    }
}