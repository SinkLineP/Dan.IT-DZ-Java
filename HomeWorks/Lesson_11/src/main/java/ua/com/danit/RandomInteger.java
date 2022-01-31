package ua.com.danit;

class RandomInteger {
  public static int getRandomNumber() {
    int min = 1;
    int max = 10;

    return (int) ((Math.random() * (max - min)) + min);
  }
}