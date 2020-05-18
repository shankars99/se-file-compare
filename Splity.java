package common;

import java.util.*;
import common.Mapper;

public class Splity extends Mapper {
    /*
     * Get the all the keys associated with given Value V from map
     */
    @Override
    public String getString() {
        final String t = "java : Java, c : C, cpp : C++, lex : C, js : JavaScript, jsm : JavaScript";
        return t;
    }

    @Override
    public String[][] splitter(final String t) {

        final String temp[] = t.split(", ");
        final String str[][] = new String[temp.length][2];
        for (int i = 0; i < temp.length; i++) {
            str[i] = temp[i].split(" : ");
            str[i][0] = "." + str[i][0];
        }

        return str;
    }

    public final HashMap<String, String> getMap(String str[][]) {
        final HashMap<String, String> tempMap = new HashMap<String, String>();
        {
            for (int i = 0; i < str.length; ++i) {
                tempMap.put(str[i][0], str[i][1]);
            }
        }

        return tempMap;
    }
}
