package ua.com.danit;

import java.util.*;

public class ConsoleApp {
  private Man father;
  private Man son;
  private Woman mother;
  private Family family;


  public void fatherObj(Scanner sc) {
    System.out.print("Enter father: (example: name, surname, year). \n");
    System.out.print("Name => ");
    String name = sc.next();
    System.out.print("Surname => ");
    String surname = sc.next();
    System.out.print("Year => ");
    int year = sc.nextInt();

    father = new Man(name, surname, year);
  }
  public void motherObj(Scanner sc) {
    System.out.print("Enter mother: (example: name, surname, year). \n");
    System.out.print("Name => ");
    String name = sc.next();
    System.out.print("Surname => ");
    String surname = sc.next();
    System.out.print("Year => ");
    int year = sc.nextInt();

    mother = new Woman(name, surname, year);
  }
  public void sonObj(Scanner sc) {
    System.out.print("Enter son: (example: name, surname, year, iq). \n");
    System.out.print("Name => ");
    String name = sc.next();
    System.out.print("Surname => ");
    String surname = sc.next();
    System.out.print("Year => ");
    int year = sc.nextInt();

    son = new Man(name, surname, year);

    System.out.print("IQ => ");
    int iq = sc.nextInt();
    son.setIq(iq);
  }
  public void sendError(String message) {
    System.out.println("Error: " + message);
  }
  public void sendEditFamily() {
    System.out.println("1. Родить ребёнка");
    System.out.println("2. Усыновить ребенка");
    System.out.println("3. Вернутся в главное меню");
    System.out.println("Выберите команду: ");
    System.out.print("=> ");
  }
  public void startApp() {
    Scanner scan = new Scanner(System.in);
    String cmdNumber;
    FamilyController familyController = new FamilyController();
    HelpText textCmd = new HelpText();
    RandomInteger rndInteger = new RandomInteger();

    do {
      textCmd.text();
      System.out.print("=> ");
      cmdNumber = scan.next();
      switch (cmdNumber) {
        case "1":
          System.out.println("Происходит наполнение данными");

          for (int i = 0; i < rndInteger.getRandomNumberForFamily(); i++) {
            father = new Man("Father #" + i, "Surname", 1980);
            mother = new Woman("Mother #" + i, "Surname", 1980);
            son = new Man("Son #" + i, "Surname", 2000);
            family = familyController.createNewFamily(mother, father);

            for (int j = 0; j < rndInteger.getRandomNumberForChildren(); j++) {
              familyController.adoptChild(family,son);
            }
          }

          System.out.println("Наполнение данными завершено");
          break;
        case "2":
          familyController.displayAllFamilies();
          break;
        case "3":
            System.out.print("Отобразить семьи где количество людей больше заданного, введите число: ");
            int countBigFamily = scan.nextInt();
            System.out.println();

            familyController.getFamiliesBiggerThan(countBigFamily);
          break;
        case "4":
            System.out.print("Отобразить семьи где количество людей меньше заданного, введите число: ");
            int countLessFamily = scan.nextInt();
            System.out.println();

            familyController.getFamiliesLessThan(countLessFamily);
          break;
        case "5":
            System.out.print("Отобразить семьи где количество людей равно заданного, введите число: ");
            int qeualsFamily = scan.nextInt();
            System.out.println();

            familyController.countFamiliesWithMemberNumber(qeualsFamily);
          break;
        case "6":
          System.out.println("Создание новой семьи\n");

          System.out.println("Создание объекта мама");
          motherObj(scan);

          System.out.println("\nСоздание объекта отец");
          fatherObj(scan);

          family = familyController.createNewFamily(mother, father);
          break;
        case "7":
          System.out.println("Удаление семьи по индексу (ID).");

          familyController.displayAllFamilies();

          System.out.print("Выберите доступный индекс: ");
          int indexFamily = scan.nextInt();

          familyController.deleteFamilyByIndex(indexFamily);

          System.out.println("Семья была успешно удалена!");
          break;
        case "8":
          System.out.println("Редактирование семьи по индексу (ID).");
          sendEditFamily();

          int selectNumber = scan.nextInt();

          switch (selectNumber) {
            case 1:
              familyController.displayAllFamilies();
              System.out.println("Выберите доступный индекс: ");
              int editIndexFamily = scan.nextInt();

              Family currentFamily = familyController.getFamilyById(editIndexFamily);
              System.out.println(currentFamily);
              System.out.println("--------------------");

              System.out.print("Введите имя мальчика: ");
              String nameGirl = scan.next();

              System.out.print("Введите имя девочки: ");
              String nameBoy = scan.next();

              familyController.bornChild(currentFamily, nameBoy, nameGirl);
              familyController.displayAllFamilies();
              break;
            case 2:
              familyController.displayAllFamilies();
              System.out.print("Выберите доступный индекс: ");
              int iFamily = scan.nextInt();

              Family adoptFamily = familyController.getFamilyById(iFamily);
              System.out.println(adoptFamily + "\n-------------");

              sonObj(scan);

              familyController.adoptChild(adoptFamily, son);
              familyController.displayAllFamilies();
              break;
            case 3:
              break;
          }
        break;
        case "9":
          System.out.print("Введите возраст, после которого удалятся все дети из семей: ");
          int ageChild = scan.nextInt();

          familyController.deleteAllChildrenOlderThen(ageChild);
        break;
        case "10":
          WorkingWithFiles wwfOne = new WorkingWithFiles();
          wwfOne.writeToFile(familyController.getAllFamilies());
          break;
        case "11":
          WorkingWithFiles wwfTwo = new WorkingWithFiles();
          wwfTwo.readFamilyList().stream()
            .forEach(f -> {
              familyController.saveFamily(f);
            });
          break;
      }
    }
    while (!Objects.equals(cmdNumber, "exit")) ;
    System.out.println("Программа успешно завершена)");
  }
}
