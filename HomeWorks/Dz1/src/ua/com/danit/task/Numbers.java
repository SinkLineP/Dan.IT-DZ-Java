package ua.com.danit.task;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
  private static Object Integer;
  private static Object String;

  public static void main(String []args) {
    System.out.println("");
    System.out.println("Let the game begin!");

    Random rnd = new Random();
    int randomNumber = rnd.nextInt(100);

    Scanner inputName = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = inputName.nextLine();

    int userNumber = 0;
    Scanner inputNumber = new Scanner(System.in);

    System.out.println();

    while (userNumber != randomNumber) {
      System.out.print("Enter you number: ");
      while (!inputNumber.hasNextInt()) {
        System.out.println("Error! It`s not a number, please enter again.");
        System.out.print("Enter you number: ");
        inputNumber.next();
      }
      userNumber = inputNumber.nextInt();

      if ((inputNumber).getClass().getSimpleName() != Integer) {
        if (userNumber < randomNumber) {
          System.out.println("Your number is too small. Please, try again.");
          System.out.println("");
        } else if (userNumber > randomNumber) {
          System.out.println("Your number is too big. Please, try again.");
          System.out.println("");
        } else {
          System.out.println("");
          System.out.printf("Congratulations, %s! \n", name);
        }
      } else if ((inputNumber).getClass().getSimpleName() == String){
        System.out.println("Error! It`s not a number, please enter again.");
      }
    }
  }
}
