import languages.Language;

import java.io.*;
import java.util.*;

public class CompareLang {

    public static void readFiles(final Language obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        obj.setStr(str);
    }

    public static HashMap<String, String> compareMap(final Language obj1, final Language obj2) {
        return (obj1.compareMap(obj1.getMap(obj1.getStr()), obj2.getMap(obj2.getStr())));
    }

    public static void display(HashMap<String, String> resMap){
        Language temp = new Language();

        System.out.println("Common : " + temp.getKeys(resMap, "common"));
        System.out.println("Gedit : " + temp.getKeys(resMap, "gedit"));
        System.out.println("Notepad++ : " + temp.getKeys(resMap, "npp"));
    }
    public static void main(final String[] args) throws IOException {
        final Language obj[] = new Language[2];
        obj[0] = new Language();
        obj[1] = new Language();

        obj[0].setPath("Gedit");
        readFiles(obj[0]);

        obj[1].setPath("Notepad++");
        readFiles(obj[1]);

        display(compareMap(obj[0], obj[1]));
    }
}