package backgrounds;

import mapper.Mapper;
import java.util.*;
import java.io.*;

public class Background extends Mapper {
    /*
     * Get the all the keys associated with given Value V from map
     */
    String str = "";
    String fname = "";

    public void setPath(final String s) {
        str = "";
        fname = s;

        str = "backgrounds/backgroundlist" + s;
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
            str[i][0] = temp[i];
            str[i][1] = "true";

        //    System.out.println(str[i][0]+" "+ str[i][1]);
        }

        return str;
    }
}
