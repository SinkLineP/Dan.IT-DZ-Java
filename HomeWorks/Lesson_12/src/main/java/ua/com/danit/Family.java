package ua.com.danit;

import java.io.Serializable;
import java.util.*;

class Family implements Serializable {
    Human mother;
    Human father;
    ArrayList<Human> children;
    HashSet<Pet> pet;

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(Family.this);
        this.father.setFamily(Family.this);
        pet = new HashSet<Pet>(0);
        children = new ArrayList<Human>(0);
    }

    String getInfo() {
        return String.format("Mother:%s,\nFather:%s,\nChildren:%s,\nPet:%s",
                Objects.toString(mother), Objects.toString(father), children, pet);
    }

    Human getMother() {
        return mother;
    }


    Human getFather() {
        return father;
    }


    ArrayList<Human> getChildren() {
        return children;
    }


    Set<Pet> getPet() {
        return pet;
    }

    void setPet(Pet pet) {
        this.pet.add(pet);
    }

    ArrayList<Human> addChild(Human child) {
        child.setFamily(Family.this);
        children.add(child);
        return children;
    }

    ArrayList<Human> deleteChild(int index) {
        try {
            children.remove(index);
            return children;
        } catch (Exception e) {
            System.out.println("Invalid argument: " + e.getMessage());
            return children;
        }
    }

    ArrayList<Human> deleteChild(Human child) {
        int index = 0;
        for (Human item : children) {
            if (item.equals(child)) {
                deleteChild(index);
            }
            index++;
        }

        return children;
    }

    int countFamily() {
        return 2 + children.size() + pet.size();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    void prettyFormat() {
        System.out.println("family: \n" +
          "   mother: " + this.mother.toString() + ", \n" +
          "   father: " + this.father.toString() + ", \n" +
          "   childrens: ");
        for (int i = 0; i < children.size(); i++)
            System.out.println("        " + children.get(i).toString());
        System.out.print("   pets: [");
        for (int l = 0; l < pet.size(); l++)
            pet.toString();
        System.out.println("]");
        System.out.println("================================================================================================\n");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Family object is deleted: %s \n", getInfo());
    }
}
