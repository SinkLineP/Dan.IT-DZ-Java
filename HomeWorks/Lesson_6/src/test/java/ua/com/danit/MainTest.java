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
            assertEquals("Name: Name, surname: Surname, year: 0", test.toString());
            return;
        }
    }
}