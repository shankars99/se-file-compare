import languages.Language;

import java.io.*;
import java.util.*;

public class CompareLang {

    public static void readFiles(final Language obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        final HashMap<String, String> mapOfExtension = obj.getMap(str);
        final String testKey = "JavaScript";
        final String testExt = ".js";

        // Get the list of keys whose value matches with given value.
        final List<String> listOfKeys = obj.getKeys(mapOfExtension, testKey);

        System.out.println(obj.getFileName());
        System.out.println(listOfKeys);
        System.out.println("" + testKey + " = " + mapOfExtension.get(testExt) + "\n");
    }

    public static void main(final String[] args) throws IOException {
        final Language obj = new Language();

        obj.setPath("Gedit");
        readFiles(obj);

        obj.setPath("Notepad++");
        readFiles(obj);
    }

}