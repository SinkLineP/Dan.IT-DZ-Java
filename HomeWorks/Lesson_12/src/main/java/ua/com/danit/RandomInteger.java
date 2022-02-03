package ua.com.danit;

class RandomInteger {
  public int getRandomNumberForChildren() {
    return (int) ((Math.random() * (10 - 1)) + 1);
  }

  public int getRandomNumberForFamily() {
    return (int) ((Math.random() * (25 - 1)) + 1);
  }
}