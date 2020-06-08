import languages.Language;

import java.io.*;
import java.util.*;

public class CompareLang {

    public static void readFiles(final Language obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        obj.setStr(str);
    }

    public static HashMap<String, String> commonMap(final Language obj[]) {
        return (obj[0].getCommonMap(obj[0].getMap(obj[0].getStr()), obj[1].getMap(obj[1].getStr()),
                obj[2].getMap(obj[2].getStr()), obj[3].getMap(obj[3].getStr())));
    }

    public static void display(HashMap<String, String> common, final Language obj[], final String names[]) {

        Language temp = new Language();
        System.out.println("Common : " + temp.getKeys(common, "common"));

        for (int i = 0; i < obj.length; ++i) {
            System.out.println(names[i] + " : "
                    + temp.getKeys(temp.compareMap(common, obj[i].getMap(obj[i].getStr()), names[i]), names[i]));
        }
    }

    public static void main(final String[] args) throws IOException {
        final Language obj[] = new Language[4];
        final String names[] = { "Gedit", "Notepad++", "Sublime", "Notepad" };
        for (int i = 0; i < 4; ++i) {
            obj[i] = new Language();
            obj[i].setPath(names[i]);
            readFiles(obj[i]);
        }

        display(commonMap(obj), obj, names);
    }
}