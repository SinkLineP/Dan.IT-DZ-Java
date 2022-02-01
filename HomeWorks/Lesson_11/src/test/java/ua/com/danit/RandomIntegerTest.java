package ua.com.danit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomIntegerTest {

  @Test
  public void getRandomNumberForChildren() {
    int rnd = (int) ((Math.random() * (10 - 1)) + 1);

    assertEquals(rnd, rnd);

    System.out.println("Created random number for children");
  }

  @Test
  public void getRandomNumberForFamily() {
    int rnd = (int) ((Math.random() * (25 - 1)) + 1);

    assertEquals(rnd, rnd);

    System.out.println("Created random number for family");
  }
}