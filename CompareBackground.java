import backgrounds.Background;

import java.io.*;
import java.util.*;

public class CompareBackground {

    public static void readFiles(final Background obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        obj.setStr(str);
    }

    public static HashMap<String, String> commonMap(final Background obj[]) {
        return (obj[0].getCommonMap(obj[0].getMap(obj[0].getStr()), obj[1].getMap(obj[1].getStr()),
                obj[2].getMap(obj[2].getStr()), obj[3].getMap(obj[3].getStr())));
    }

    public static void display(HashMap<String, String> common, final Background obj[], final String names[]) {

        Background temp = new Background();
        System.out.println("Common : " + temp.getKeys(common, "common"));

        for (int i = 0; i < obj.length; ++i) {
            System.out.println(names[i] + " : "
                    + temp.getKeys(temp.compareMap(common, obj[i].getMap(obj[i].getStr()), names[i]), names[i]));
        }
    }

    public static void main(final String[] args) throws IOException {
        final Background obj[] = new Background[4];
        final String names[] = { "Gedit", "Notepad++", "Sublime", "Notepad" };
        for (int i = 0; i < 4; ++i) {
            obj[i] = new Background();
            obj[i].setPath(names[i]);
            readFiles(obj[i]);
        }

        display(commonMap(obj), obj, names);
    }
}