package ua.com.danit;

import java.util.*;

public class ConsoleApp {
  public static Human father;
  public static Human mother;
  public static Human children;
  public static Family family;
  static List<Family> arrFamily = new ArrayList<Family>();

  public static Human childrenTemplate;
  public static Human childrenBoySecond;
  public static Human childrenGirlFirst;

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
    do {
      HelpText.text();
      System.out.print("=> ");
      switch (scan.next()) {
        case "1":
          System.out.println("Происходит наполнение данными");

          father = new Man("Yuri", "Poznokos", 12, 12, 1980, 100);
          mother = new Woman("Marina", "Popova", 21, 11, 1982, 100);
          childrenTemplate = new Children("Misha", "Popov",13, 10, 2013, 100, mother, father, "boy", "null", "null");
          family = new Family(mother, father);

          System.out.print("Введите количество семей: ");

          int countFamily = scan.nextInt();
          for (int i = 0; i < countFamily; i++)
            arrFamily.add(family);

          System.out.println("Наполнение данными завершено");
          break;
        case "2":
          if (arrFamily.isEmpty()) {
            System.out.println("данных нет, введите команду под номром '1'");
          } else {
            System.out.println();
            System.out.println("=============");
            family.prettyFormat(arrFamily);
          }

      }


      System.out.println("Введите 'start' для продолжения, или 'exit' для выхода");
      System.out.print("=> ");
//      fatherObj(scan);
//      motherObj(scan);
//      family = new Family(mother, father);
//      ChildrenObj(scan);
//      arrFamily.add(family);
//      family.prettyFormat();
    } while (!Objects.equals(scan.next(), "exit"));
  }
}
