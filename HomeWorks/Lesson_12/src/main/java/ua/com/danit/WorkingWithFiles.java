package ua.com.danit;

import java.util.*;
import java.io.*;

public class WorkingWithFiles {
  final static private String familyPath = "src/main/java/ua/com/danit/familyWriter/arrFamily.txt";

  public static void writeToFile(List<Family> familyList)  {
    File file = new File(familyPath);

    try {
      if(!file.exists()){
        file.createNewFile();
      }
      FileOutputStream fileOut = new FileOutputStream(file.getAbsoluteFile());
      ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

      try {
        objectOut.writeObject(familyList);
      } catch (Exception ex) {
        ex.printStackTrace();
      } finally {

        objectOut.close();
      }
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static List<Family> readFamilyList()  {
    File file = new File(familyPath);

    FileInputStream fi = null;
    ObjectInputStream oi = null;
    try {
      fi = new FileInputStream(file.getAbsoluteFile());
      oi = new ObjectInputStream(fi);

      List<Family> familyList = (List<Family>) oi.readObject();
      return familyList;

    } catch(IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }finally {
      try {
        oi.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        fi.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
