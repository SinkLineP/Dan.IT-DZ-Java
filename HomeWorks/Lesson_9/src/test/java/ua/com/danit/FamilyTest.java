package ua.com.danit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FamilyTest {
    List<Human> childrens = new ArrayList<Human>();

    Human children_one = new Children("Misha", "Popov", 2013);
    Human children_two = new Children("Misha", "Popov", 2013);
    Human children_three = new Children("Misha", "Popov", 2013);

    @Test
    public void addChild() {
        childrens.add(children_one);
        assertEquals(1, childrens.size());
        childrens.add(children_one);
        assertEquals(2, childrens.size());
    }

    @Test
    public void deleteChild() {
        childrens.add(children_one);
        childrens.add(children_two);
        childrens.add(children_three);

        assertEquals(3, childrens.size());
        childrens.remove(0);
        assertEquals(2, childrens.size());
    }

    @Test
    public void deleteChildIndex() {
        childrens.add(children_one);
        childrens.add(children_two);
        childrens.add(children_three);

        int indexDell = 100;

        assertEquals(3, childrens.size());
        if (indexDell <= childrens.size()) {
            childrens.remove(indexDell);
        } else {
            System.out.println("Error your number big!");
            indexDell = 0;
            childrens.remove(indexDell);
        }
        assertEquals(2, childrens.size());
    }


    @Test
    public void countFamily() {
        childrens.add(children_one);
        childrens.add(children_two);
        childrens.add(children_three);

        assertEquals(3, childrens.size());
        assertEquals(5, childrens.size() + 2);
    }
}