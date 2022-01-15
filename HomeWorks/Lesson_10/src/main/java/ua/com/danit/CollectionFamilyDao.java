package ua.com.danit;

import java.util.ArrayList;
import java.util.List;

public final class CollectionFamilyDao implements FamilyDao {

    static List<Family> arrFamily = new ArrayList<Family>();


    @Override
    public List<Family> getAllFamilies() {
        createFamily();
        return arrFamily;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return arrFamily.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        arrFamily.remove(index);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        int index = 0;
        for (Family item : arrFamily) {
            if (item.equals(family)) {
                deleteFamily(index);
                return true;
            }
            index++;
        }

        return false;
    }

    @Override
    public void deleteAllFamilies() {
        arrFamily.clear();
    }

    @Override
    public void saveFamily(Family family) {

    }

    public static void createFamily() {
        Human father = new Man("Yuri", "Poznokos", 1980);
        Human mother = new Woman("Marina", "Popova", 1982);
        Human children = new Children("Misha", "Popov", 2013);
        Family family = new Family(mother, father);

        family.addChild(children);
        arrFamily.add(family);




    }
}
