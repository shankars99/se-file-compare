import fonts.Font;

import java.io.*;
import java.util.*;

public class CompareFont {

    public static void readFiles(final Font obj) throws IOException {
        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.readWords());
        final HashMap<String, String> mapOfFonts = obj.getMap(str);
        final String testKey = "ArielBlack";

        System.out.println(obj.getFileName());
        System.out.println("" + testKey + " = " + mapOfFonts.get(testKey) + "\n");
    }

    public static void main(final String[] args) throws IOException {
        final Font obj = new Font();

        obj.setPath("Gedit");
        readFiles(obj);

        obj.setPath("Notepad++");
        readFiles(obj);
    }

}