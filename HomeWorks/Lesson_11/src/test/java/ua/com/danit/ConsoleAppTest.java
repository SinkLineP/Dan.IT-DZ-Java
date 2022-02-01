package ua.com.danit;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConsoleAppTest {

  @Test
  public void fatherObj() {
    ConsoleApp.father = new Man(
      "TestName",
      "TestSurname",
      99,
      9,
      9999,
      10
    );

    assertEquals(ConsoleApp.father.prettyFormat(), "{name='TestName', surname='TestSurname', birthDate='99/9/9999', iq=10, schedule={WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}}");
  }

  @Test
  public void motherObj() {
    ConsoleApp.mother = new Woman(
      "TestName",
      "TestSurname",
      99,
      9,
      9999,
      10
    );

    assertEquals(ConsoleApp.mother.prettyFormat(), "{name='TestName', surname='TestSurname', birthDate='99/9/9999', iq=10, schedule={WEDNESDAY=Go to travel, MONDAY=Go to school, THURSDAY=Home working, SUNDAY=Sleep, TUESDAY=Go to shop, FRIDAY=Walk, SATURDAY=Sleep}}");
  }

  @Test
  public void sendError() {
    String message = "page not found!";
    String errorMsg = "Error: " + message;

    assertEquals(errorMsg, "Error: page not found!");
  }

  @Test
  public void sendEditFamily() {
    String addChild = "1. Родить ребёнка";
    String backToMenu = "2. Вернутся в главное меню";
    String select = "Выберите команду: ";
    String arrow = "=>";

    String output = addChild + "\n" + backToMenu + "\n" + select + "\n" + arrow;
    assertEquals(output, "1. Родить ребёнка\n" + "2. Вернутся в главное меню\n" + "Выберите команду: \n" + "=>");
  }
}