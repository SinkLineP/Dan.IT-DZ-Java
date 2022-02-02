package ua.com.danit;

class RandomInteger {
  public static int getRandomNumberForChildren() {
    return (int) ((Math.random() * (10 - 1)) + 1);
  }

  public static int getRandomNumberForFamily() {
    return (int) ((Math.random() * (25 - 1)) + 1);
  }
}