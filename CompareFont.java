import fonts.Font;

import java.io.*;
import java.util.*;

public class CompareFont {

    public static void readFiles(final Font obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        obj.setStr(str);
    }

    public static HashMap<String, String> commonMap(final Font obj[]) {
        return (obj[0].getCommonMap(obj[0].getMap(obj[0].getStr()), obj[1].getMap(obj[1].getStr()),
                obj[2].getMap(obj[2].getStr()),obj[3].getMap(obj[3].getStr())));
    }

    public static void display(HashMap<String, String> common, final Font obj[],final String names[]) {

        Font temp = new Font();
        System.out.println("Common : " + temp.getKeys(common, "common"));

        for(int i = 0;i<obj.length;++i)
        {
            System.out.println(names[i] + " : " + temp.getKeys(temp.compareMap(common, obj[i].getMap(obj[i].getStr()),names[i]), names[i]));
        }
    }

    public static void main(final String[] args) throws IOException {
        final Font obj[] = new Font[4];
        final String names[] = {"Gedit","Notepad++","Sublime","Notepad"};
        for(int i = 0; i<4;++i)
        {
            obj[i] = new Font();
            obj[i].setPath(names[i]);
            readFiles(obj[i]);
        }

        display(commonMap(obj),obj,names);
    }
}