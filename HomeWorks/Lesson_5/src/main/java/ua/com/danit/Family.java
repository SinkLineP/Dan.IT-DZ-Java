package ua.com.danit;

import java.util.ArrayList;
import java.util.List;

public class Family {
    Human mother;
    Human father;
    List<Human> childrens = new ArrayList<Human>();

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human children) throws Throwable {
        if (this.mother != null && this.father != null) {
            childrens.add(children);
            System.out.println(childrens);
        }
    }

    public void deleteChild(int index) {
        if (childrens != null) {
            childrens.remove(index);
            System.out.println("Deleted! " + childrens);
        }
    }

    public void countFamily() {
        if (this.mother != null && this.father != null && childrens != null) {
            int count = childrens.size() + 2;
            System.out.println("Cout Family: " + count);
        }
    }

    public void setFamily(Human mother, Human father, Human[] childrens) {

    }

    @Override
    public String toString() {
        String infoFamily = "Family { " +
            "mother='" + this.mother.name + " " + this.mother.surname + "', " +
            "father='" + this.father.name + " " + this.father.surname + "', " +
            "childrens=[" + childrens +
        "]}";
        System.out.println(infoFamily);
        return infoFamily;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Family object is deleted: %s \n", this.toString());
    }
}
