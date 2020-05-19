import fonts.Font;

import java.io.*;
import java.util.*;

public class CompareFont {

    public static void readFiles(final Font obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        obj.setStr(str);
    }

    public static HashMap<String, String> compareMap(final Font obj1, final Font obj2) {
        return (obj1.compareMap(obj1.getMap(obj1.getStr()), obj2.getMap(obj2.getStr())));
    }

    public static void display(HashMap<String, String> resMap) {
        Font temp = new Font();

        System.out.println("Common : " + temp.getKeys(resMap, "common"));
        System.out.println("Gedit : " + temp.getKeys(resMap, "gedit"));
        System.out.println("Notepad++ : " + temp.getKeys(resMap, "npp"));
    }

    public static void main(final String[] args) throws IOException {
        final Font obj[] = new Font[2];
        obj[0] = new Font();
        obj[1] = new Font();

        obj[0].setPath("Gedit");
        readFiles(obj[0]);

        obj[1].setPath("Notepad++");
        readFiles(obj[1]);

        display(compareMap(obj[0], obj[1]));
    }
}