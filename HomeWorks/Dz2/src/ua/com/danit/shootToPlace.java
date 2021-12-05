package ua.com.danit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class shootToPlace {
  private static Object String;
  private static Object Integer;

  public static void outMatrix(String[] matrix) {
    System.out.println(Arrays.toString(matrix));
  }

  public static void main(String[] args) {
    System.out.println("All set. Get ready to rumble!");

    String[][] matrix;
    matrix = new String[][]{
      {"0", "1", "2", "3", "4", "5"},
      {"1", "-", "-", "-", "-", "-"},
      {"2", "-", "-", "-", "-", "-"},
      {"3", "-", "-", "-", "-", "-"},
      {"4", "-", "-", "-", "-", "-"},
      {"5", "-", "-", "-", "-", "-"},
    };

    int shootLine = 0;
    int shootColumn = 0;
    Scanner inputNumber = new Scanner(System.in);

    Random rndLine = new Random();
    Random rndColumn = new Random();
    int randomLine = rndLine.nextInt(5);
    int randomColumn = rndColumn.nextInt(5);

    matrix[randomLine][randomColumn] = "-";

    while (true) {
//    Input line
      System.out.print("Enter line for shoot (1 to 5): ");
      while (!inputNumber.hasNextInt()) {
        System.out.println("Error! It`s not a number, please enter again.");
        System.out.print("Enter line for shoot (1 to 5): ");
        inputNumber.next();
      }
      shootLine = inputNumber.nextInt();
//    Input column
      System.out.print("Enter column for shoot (1 to 5): ");
      while (!inputNumber.hasNextInt()) {
        System.out.println("Error! It`s not a number, please enter again.");
        System.out.print("Enter column for shoot (1 to 5): ");
        inputNumber.next();
      }
      shootColumn = inputNumber.nextInt();


      if ((inputNumber).getClass().getSimpleName() != Integer) {
        if (shootLine > 5 || shootLine <= 0) {
          System.out.println("Error! Missing string, enter again.");
        } else if (shootColumn > 5 || shootLine <= 0) {
          System.out.println("Error! Missing string, enter again.");
        } else {

          matrix[shootLine][shootColumn] = "*";

          if (shootLine == randomLine && shootColumn == randomColumn) {
            matrix[shootLine][shootColumn] = "X";
            int i;
            for (i = 0; i < 6; i ++) {
              outMatrix(matrix[i]);
            }
            break;
          }

          int i;
          for (i = 0; i < 6; i ++) {
            outMatrix(matrix[i]);
          }
        }
      } else if ((inputNumber).getClass().getSimpleName() == String) {
        System.out.println("Error! It`s not a number, please enter again.");
      }
    }
    System.out.println("You have won!");
  }
}
