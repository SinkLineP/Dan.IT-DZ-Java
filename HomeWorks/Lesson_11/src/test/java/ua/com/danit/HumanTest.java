package ua.com.danit;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.HashMap;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void testToString() {
        Human test = new Man("Name", "Surname", 0000);
        assertEquals("Name: Name, surname: Surname, birthDate: 0", test.toString());
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

    @Test
    public void testDescribeAge() {
        testGetAgeHuman();
    }

    @Test
    public void testGetAgeHuman() {
        long testBirthDate = 1642153166597L;
        int testYear = 1969;
        int testMonth = 5;
        int testDay = 15;

        SimpleDateFormat YearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat MonthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat DayFormat = new SimpleDateFormat("dd");

        Date resultDateFormat = new Date(testBirthDate);

        String showYear = YearFormat.format(resultDateFormat);
        String showMonth = MonthFormat.format(resultDateFormat);
        String showDay = DayFormat.format(resultDateFormat);

        LocalDate oldDate = LocalDate.of(testYear, testMonth, testDay);
        LocalDate newDate = LocalDate.of(Integer.parseInt(showYear), Integer.parseInt(showMonth), Integer.parseInt(showDay));

        Period period = Period.between(oldDate, newDate);

        System.out.println("===Example===");

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.println(period.getDays() + " days");

        System.out.println("===Test===");

        assertEquals("52 years,7 months,30 days", period.getYears() + " years," + period.getMonths() + " months," + period.getDays() + " days");
        System.out.println("Done! ");
    }

    @Test
    public void prettyFormat() {
        String dob = 13 + "/" + 9 + "/" + 2003;
        String infoHumman =  ("{" +
          "name='" + "artem" + "', " +
          "surname='" + "popov" + "', " +
          "birthDate='" + dob + "', "+
          "iq=" + 100 + "}");

        System.out.println("Humman formated!");

        assertEquals(infoHumman, "{name='artem', surname='popov', birthDate='13/9/2003', iq=100}");
    }
}