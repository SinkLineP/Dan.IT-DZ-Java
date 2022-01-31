package ua.com.danit;

import java.util.Arrays;
import java.util.Scanner;

class RandomInteger {
  public static int getRandomNumber() {
    int min = 1;
    int max = 10;

    return (int) ((Math.random() * (max - min)) + min);
  }

  public static String[] Cars;
  public static String[] Wheels;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("enter count cars: ");
    int countCars = scan.nextInt();

    for (int c = 0; c < countCars; c++) {

      Cars = new String[] {"cars " + (c + 1)};
      System.out.println(Arrays.toString(Cars));
      int rndInteger = getRandomNumber();

      for (int w = 0; w < rndInteger; w++) {
        Wheels = new String[] {Arrays.toString(Cars) + ", wheel count: " + rndInteger};
        System.out.println(Arrays.toString(Wheels));
      }

    }
  }
}