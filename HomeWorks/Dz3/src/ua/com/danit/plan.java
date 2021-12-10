package ua.com.danit;

import java.util.Objects;
import java.util.Scanner;

public class plan {
  private static Object String;
  private static Object Integer;

  public static void main(String[] args) {
    String inputDay;
    Scanner ScanerDay = new Scanner(System.in);

    String[][] scedule = new String[7][2];

    scedule[0][0] = "Monday";
    scedule[1][0] = "Tuesday";
    scedule[2][0] = "Wednesday";
    scedule[3][0] = "Thursday";
    scedule[4][0] = "Friday";
    scedule[5][0] = "Saturday";
    scedule[6][0] = "Sunday";
    scedule[0][1] = "Do home work";
    scedule[1][1] = "Go to courses; watch a film";
    scedule[2][1] = "Sleep";
    scedule[3][1] = "Training";
    scedule[4][1] = "walk";
    scedule[5][1] = "shopping";
    scedule[6][1] = "Fishing";

    while (true) {
      System.out.print("Please, input the day of the week: ");
      while (ScanerDay.hasNextInt()) {
        System.out.println("Sorry, I don't understand you, please try again. one proverka");
        System.out.print("Please, input the day of the week: ");
        ScanerDay.next();
      }
      inputDay = ScanerDay.next();


      if ((inputDay).getClass().getSimpleName() != Integer) {
        switch (inputDay.toLowerCase().trim()) {
          case "monday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[0][1] + "");
            break;
          case "tuesday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[1][1] + "");
            break;
          case "wednesday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[2][1] + "");
            break;
          case "thursday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[3][1] + "");
            break;
          case "friday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[4][1] + "");
            break;
          case "saturday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[5][1] + "");
            break;
          case "sunday":
            System.out.println("Your tasks for " + inputDay + ": " + scedule[6][1] + "");
            break;
          default:
            return;
        }
      } else if ((inputDay).getClass().getSimpleName() != String) {
        System.out.println("Sorry, I don't understand you, please try again.");
      }
    }
  }
}
