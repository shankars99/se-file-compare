package languages;

import mapper.Mapper;
import java.util.*;
import java.io.*;

public class Language extends Mapper {
    /*
     * Get the all the keys associated with given Value V from map
     */
    String str = "";
    String fname = "";

    public void setPath(final String s) {
        str = "";
        fname = s;

        str = "languages/languagelist" + s;
    }

    public String getFileName()
    {
        return fname;
    }

    @Override
    public String readWords() throws IOException {
        String line = "";
        str = str + ".txt";
        final Scanner scanner = new Scanner(new File(str));
        while (scanner.hasNext()) {
            line = line + scanner.next();
        }
        return line;
    }

    @Override
    public String[][] splitter(final String s) {

        final String temp[] = s.split(",");
        final String str[][] = new String[temp.length][2];

        for (int i = 0; i < str.length; i++) {
            str[i] = temp[i].split(":");
            str[i][0] = "." + str[i][0];
        }

        return str;
    }
}
