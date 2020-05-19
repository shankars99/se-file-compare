import backgrounds.Background;

import java.io.*;
import java.util.*;

public class CompareBackground {

    public static void readFiles(final Background obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        final HashMap<String, String> mapOfStyles = obj.getMap(str);
        final String testKey = "Blue";

        System.out.println(obj.getFileName());
        System.out.println("" + testKey + " = " + mapOfStyles.get(testKey) + "\n");
    }

    public static void main(final String[] args) throws IOException {
        final Background obj = new Background();

        obj.setPath("Gedit");
        readFiles(obj);

        obj.setPath("Notepad++");
        readFiles(obj);
    }
}