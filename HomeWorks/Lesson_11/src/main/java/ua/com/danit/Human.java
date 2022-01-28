package ua.com.danit;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.HashMap;

abstract class Human {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    String name;
    String surname;
    long birthDate = System.currentTimeMillis();
    int year;
    int iq;
    Pet myPet;
    static Human mother;
    static Human father;
    int day;
    int month;
    String gender;
    String schedule;
    String dayName;

    public HashMap<String, String> hashMapSchedule() {
        HashMap<String, String> scheduleMap = new HashMap<>();

        scheduleMap.put(DayOfWeek.MONDAY.name(), "Go to school");
        scheduleMap.put(DayOfWeek.TUESDAY.name(), "Go to shop");
        scheduleMap.put(DayOfWeek.WEDNESDAY.name(), "Go to travel");
        scheduleMap.put(DayOfWeek.THURSDAY.name(), "Home working");
        scheduleMap.put(DayOfWeek.FRIDAY.name(), "Walk");
        scheduleMap.put(DayOfWeek.SATURDAY.name(), "Sleep");
        scheduleMap.put(DayOfWeek.SUNDAY.name(), "Sleep");

        return scheduleMap;
    }


    Family family;

    public void createFamily(Human mother, Human father, Human[] childrens) {
        family.setFamily(mother, father, childrens);
    }

    public abstract Human showFather();
    public abstract Human showMother();
    public abstract void greetPet();
    public abstract void describePet();
    public abstract void makeUp();
    public abstract void repairCar();
    public abstract void describeAge();

    public static void havePet(String s, int i, int i2) {
        System.out.println("У меня есть " + s + ",");
        System.out.println("ему " + i + "год(а),");
        if (i2 > 50) {
            System.out.println("он очень хитрый");
        } else if (i2 < 50) {
            System.out.println("он почти не хитрый");
        }
    }



    public static void getAgeHuman(long birthDate, int year, int month, int day) {
        SimpleDateFormat YearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat MonthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat DayFormat = new SimpleDateFormat("dd");

        Date resultDateFormat = new Date(birthDate);

        String showYear = YearFormat.format(resultDateFormat);
        String showMonth = MonthFormat.format(resultDateFormat);
        String showDay = DayFormat.format(resultDateFormat);

        LocalDate oldDate = LocalDate.of(year, month, day);
        LocalDate newDate = LocalDate.of(Integer.parseInt(showYear), Integer.parseInt(showMonth), Integer.parseInt(showDay));

        Period period = Period.between(oldDate, newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
    }

    public String prettyFormat() {
        String dob = day + "/" + month + "/" + year;
        String humanInfo = "{" +
          "name='" + name + "', " +
          "surname='" + surname + "', " +
          "birthDate='" + dob + "', " +
          "iq=" + iq + ", " +
          "schedule=" + hashMapSchedule() +
        "}";
        return humanInfo;
    }


}

class Man extends Human {
    Man() {
        super();
        name = "";
        surname = "";
        year = 0;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
    }

    public Man(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Man(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Man(String name, String surname, int day, int month, int year, int iq) {
        super();
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.iq = iq;
    }

    public Human showFather() {
        return father;
    }
    public Human showMother() {
        return mother;
    }
    public void repairCar() {
        System.out.println("Пора чинить машину!");
    }

    public void describeAge() {
        getAgeHuman(birthDate, year, month, day);
    }

    public void greetPet() {
        System.out.printf("Привет - %s, это я твой хозяин - %s", myPet.namePet(), name);
    }
    public void describePet() {
        havePet(myPet.SpeciesPet(), myPet.AgePet(), myPet.trickLevelPet());
    }
    public void makeUp() {}
}
class Woman extends Human {


    Woman() {
        super();
        name = "";
        surname = "";
        year = 0;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
        day = 0;
        month = 0;
    }

    public Woman(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Woman(String name, String surname, int day, int month, int year, int iq) {
        super();
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.iq = iq;
    }

    public Human showFather() {
        return father;
    }
    public Human showMother() {
        return mother;
    }
    public void makeUp() {
        System.out.println("Нужно подкраситься");
    }
    public void repairCar() {}

    public void describeAge() {
        getAgeHuman(birthDate, year, month, day);
    }

    public void greetPet() {
        System.out.printf("Привет - %s, это я твоя хозяйка - %s", myPet.namePet(), name);
    }
    public void describePet() {
        havePet(myPet.SpeciesPet(), myPet.AgePet(), myPet.trickLevelPet());
    }
}



class Children extends Human {
    Children() {
        super();
        name = "";
        surname = "";
        birthDate = 0;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
        gender = "";
        schedule = null;
    }

    public Children(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.birthDate = year;
    }

    public Children(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        super();
        this.name = name;
        this.surname = surname;
        this.birthDate = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Children(String name, String surname, int day, int month, int year, int iq, Pet pet, Human mother, Human father, String gender, String[][] schedule) {
        super();
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
        this.gender = gender;
    }

    public Children(String name, String surname, int day, int month, int year, int iq, Human mother, Human father, String gender, String schedule, String dayName) {
        super();
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.gender = gender;
        this.schedule = schedule;
        this.dayName = dayName;
    }

    public Human showFather() {
        return father;
    }
    public Human showMother() {
        return mother;
    }
    public void makeUp() {

    }
    public void repairCar() {

    }

    public void describeAge() {
        getAgeHuman(birthDate, year, month, day);
    }

    public HashMap<String, String> hashMapScheduleChildren(String task, String dayWeek) {
        HashMap<String, String> scheduleMap = new HashMap<>();

        if (task == "null") {
            return scheduleMap;
        } else {
            scheduleMap.put(dayWeek, task);
        }

        return scheduleMap;
    }

    public String prettyFormat() {
        String dobChildren = day + "/" + month + "/" + year;
        String infoChildren = ("" + this.gender + ": {" +
          "name='" + this.name + "', " +
          "surname='" + this.surname + "', " +
          "birthDate='" + dobChildren + "', "+
          "iq=" + iq + ", " +
          "schedule=" + hashMapScheduleChildren(schedule, dayName) + "}");
        return infoChildren;
    }

    public void greetPet() {
        System.out.printf("Привет - %s, это я твоя хозяйка - %s", myPet.namePet(), name);
    }
    public void describePet() {
        havePet(myPet.SpeciesPet(), myPet.AgePet(), myPet.trickLevelPet());
    }
}