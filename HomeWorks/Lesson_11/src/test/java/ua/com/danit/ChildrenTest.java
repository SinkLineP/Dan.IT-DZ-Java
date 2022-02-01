package ua.com.danit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChildrenTest {

  @Test
  public void prettyFormat() {
    String dobChildren = 13 + "/" + 9 + "/" + 2003;
    String infoChildren = ("" + "boy" + ": {" +
      "name='" + "artem" + "', " +
      "surname='" + "popov" + "', " +
      "birthDate='" + dobChildren + "', "+
      "iq=" + 100 + ", " +
      "schedule=" + Children.hashMapScheduleChildren("null", "null") + "}");

    assertEquals(infoChildren, "boy: {name='artem', surname='popov', birthDate='13/9/2003', iq=100, schedule={}}");

    System.out.println("children formatted!");
  }
}