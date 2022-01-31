package ua.com.danit;

import java.util.*;

public class ConsoleApp {
  public static Human father;
  public static Human mother;
  public static Human children;
  public static Family family;
  static List<Family> arrFamily = new ArrayList<Family>();

  public static Human childrenTemplate;

  public static void fatherObj(Scanner sc) {
    System.out.print("Enter father: (example: name, surname, dayOfBirthday, monthOfBirthday, yearOfBirthday, IQ). \n");
    System.out.print("Name => ");
    String name = sc.next();
    System.out.print("Surname => ");
    String surname = sc.next();
    System.out.print("DayOfBirthday => ");
    Integer dayOfBirthday = sc.nextInt();
    System.out.print("MonthOfBirthday => ");
    Integer monthOfBirthday = sc.nextInt();
    System.out.print("YearOfBirthday => ");
    Integer yearOfBirthday = sc.nextInt();
    System.out.print("IQ => ");
    Integer IQ = sc.nextInt();

    father = new Man(
      name, surname,
      dayOfBirthday,
      monthOfBirthday,
      yearOfBirthday,
      IQ
    );
  }
  public static void motherObj(Scanner sc) {
    System.out.print("Enter mother: (example: name, surname, dayOfBirthday, monthOfBirthday, yearOfBirthday, IQ). \n");
    System.out.print("Name => ");
    String name = sc.next();
    System.out.print("Surname => ");
    String surname = sc.next();
    System.out.print("DayOfBirthday => ");
    Integer dayOfBirthday = sc.nextInt();
    System.out.print("MonthOfBirthday => ");
    Integer monthOfBirthday = sc.nextInt();
    System.out.print("YearOfBirthday => ");
    Integer yearOfBirthday = sc.nextInt();
    System.out.print("IQ => ");
    Integer IQ = sc.nextInt();

    mother = new Woman(
      name,
      surname,
      dayOfBirthday,
      monthOfBirthday,
      yearOfBirthday,
      IQ
    );
  }
  public static void ChildrenObj(Scanner sc) {
    System.out.print("Enter Children: (example: name, surname, dayOfBirthday, monthOfBirthday, yearOfBirthday, IQ, gender, task, dayOfWeek(example: friday, saturday...)). \n");
    System.out.print("Name => ");
    String name = sc.next();
    System.out.print("Surname => ");
    String surname = sc.next();
    System.out.print("DayOfBirthday => ");
    Integer dayOfBirthday = sc.nextInt();
    System.out.print("MonthOfBirthday => ");
    Integer monthOfBirthday = sc.nextInt();
    System.out.print("YearOfBirthday => ");
    Integer yearOfBirthday = sc.nextInt();
    System.out.print("IQ => ");
    Integer IQ = sc.nextInt();
    System.out.print("Gender => ");
    String Gender = sc.next();
    System.out.print("Task => ");
    String Task = sc.next();
    System.out.print("DayOfWeek => ");
    String dayOfWeek = sc.next();

    children = new Children(
      name,
      surname,
      dayOfBirthday,
      monthOfBirthday,
      yearOfBirthday,
      IQ,
      mother,
      father,
      Gender,
      Task,
      dayOfWeek
    );

    family.addChild(children);
  }

  public static void startApp() {
    Scanner scan = new Scanner(System.in);
    String cmdNumber;

    do {
      HelpText.text();
      System.out.print("=> ");
      cmdNumber = scan.next();
      switch (cmdNumber) {
        case "1":
          System.out.println("Происходит наполнение данными");

          for (int i = 0; i < RandomInteger.getRandomNumberForFamily(); i++) {
            father = new Man("Father #" + i, "Surname", 12, 12, 1980, 100);
            mother = new Woman("Mother #" + i, "Surname", 21, 11, 1982, 100);
            childrenTemplate = new Children("Children #" + i, "Surname",13, 10, 2013, 100, mother, father, "boy", "null", "null");
            family = new Family(mother, father);

            for (int j = 0; j < RandomInteger.getRandomNumberForChildren(); j++) {
              family.addChild(childrenTemplate);
            }

            arrFamily.add(family);
          }

          System.out.println("Наполнение данными завершено");
          break;
        case "2":
          if (arrFamily.isEmpty()) {
            System.out.println("данных нет, введите команду под номером '1'");
          } else {
            System.out.println();
            System.out.println("=============");
            for (int i = 0; i < arrFamily.size(); i++) {
              Family fakeFamily = arrFamily.get(i);
              System.out.println("Index family: " + i);
              fakeFamily.prettyFormat();
            }
          }
          break;
      }

//      fatherObj(scan);
//      motherObj(scan);
//      family = new Family(mother, father);
//      ChildrenObj(scan);
//      arrFamily.add(family);
//      family.prettyFormat();
    } while (!Objects.equals(cmdNumber, "exit"));
    System.out.println("Программа успешно завершена)");
  }
}
