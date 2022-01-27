package ua.com.danit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Family {
    Human mother;
    Human father;
    List<Human> childrens = new ArrayList<Human>();

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Human children) {
        if (this.mother != null && this.father != null) {
            childrens.add(children);
        }
    }

    public void deleteChild(int index) {
        if (childrens != null) {
            childrens.remove(index);
            System.out.println("Deleted! " + childrens);
        }
    }

    public int countFamily() {
        int count = 0;
        if (this.mother != null && this.father != null && childrens != null) {
            count = childrens.size() + 2;
        }
        System.out.println("Cout Family: " + count);
        return count;
    }

    public void setFamily(Human mother, Human father, Human[] childrens) {

    }

    public void prettyFormat() {
        System.out.println("family: \n" +
        "   mother: " + this.mother.prettyFormat() + ", \n" +
        "   father: " + this.father.prettyFormat() + ", \n" +
        "   childrens: \n"
        );
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Family object is deleted: %s \n", this.toString());
    }
}