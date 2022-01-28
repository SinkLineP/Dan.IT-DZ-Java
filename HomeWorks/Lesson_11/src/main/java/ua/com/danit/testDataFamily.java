package ua.com.danit;

import java.util.List;
import java.util.Scanner;

public class testDataFamily {
  public static Integer countFamily;
  public static void fakeData(Scanner sc, List array) {
    Human father = new Man("Yuri", "Poznokos", 12, 12, 1980, 100);
    Human mother = new Woman("Marina", "Popova", 21, 11, 1982, 100);
    Human childrenBoyFirst = new Children("Misha", "Popov",13, 10, 2013, 100, mother, father, "boy", "null", "null");
    Human childrenBoySecond = new Children("Artem", "Popov",13, 9, 2003, 55, mother, father, "boy", "null", "null");
    Human childrenGirlFirst = new Children("Karina", "Popova",5, 3, 2004, 80, mother, father, "girl", "music", "Friday");
    Family family = new Family(mother, father);

    family.addChild(childrenBoyFirst);
    family.addChild(childrenGirlFirst);
    family.addChild(childrenBoySecond);

    System.out.print("Введите количество семей: ");
    countFamily = sc.nextInt();
    for (int i = 0; i < countFamily; i++)
      array.add(family);
//    family.prettyFormat(array);
  }
}
