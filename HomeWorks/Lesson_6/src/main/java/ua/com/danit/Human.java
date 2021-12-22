package ua.com.danit;

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
    int year;
    int iq;
    Pet myPet;
    static Human mother;
    static Human father;
    String[][] schedule = new String[][]{
            {DayOfWeek.MONDAY.name(), ""},
            {DayOfWeek.TUESDAY.name(), ""},
            {DayOfWeek.WEDNESDAY.name(), ""},
            {DayOfWeek.THURSDAY.name(), ""},
            {DayOfWeek.FRIDAY.name(), ""},
            {DayOfWeek.SATURDAY.name(), ""},
            {DayOfWeek.SUNDAY.name(), ""}
    };
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

    public static void havePet(String s, int i, int i2) {
        System.out.println("У меня есть " + s + ",");
        System.out.println("ему " + i + "год(а),");
        if (i2 > 50) {
            System.out.println("он очень хитрый");
        } else if (i2 < 50) {
            System.out.println("он почти не хитрый");
        }
    }

    @Override
    public String toString() {
        String infoHuman = "Name: " + name + ", surname: " + surname + ", year: " + year;
        System.out.println(infoHuman);
        return infoHuman;
    }
}

class Man extends Human {
    Man() {
        super();
        name = "";
        surname = "";
        year = -1;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
        schedule = null;
    }

    public Man(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Man(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
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
        year = -1;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
        schedule = null;
    }

    public Woman(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
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
        year = -1;
        iq = -1;
        myPet = null;
        mother = null;
        father = null;
        family = null;
        schedule = null;
    }

    public Children(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Children(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.myPet = pet;
        this.mother = mother;
        this.father = father;
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
    public void greetPet() {
        System.out.printf("Привет - %s, это я твоя хозяйка - %s", myPet.namePet(), name);
    }
    public void describePet() {
        havePet(myPet.SpeciesPet(), myPet.AgePet(), myPet.trickLevelPet());
    }
}