package common;

import java.util.*;
public class HashParser{
    public static void main(final String[] args) {

        final Splitter obj = new Splitter();

        // Create a Map of words and their frequency count
        final String str[][] = obj.splitter(obj.getString());
        final HashMap<String, String> mapOfWords = obj.getMap(str);
        final String testKey = "C";

        // Get the list of keys whose value matches with given value.
        final List<String> listOfKeys = obj.getKeys(mapOfWords, testKey);

        System.out.println(listOfKeys);
        System.out.println("\n" + testKey + " = " + mapOfWords.get(".c"));
    }
}
abstract class Mapper{
    <K, V> List<K> getKeys(final Map<K, V> mapOfWords, final V value) {
        List<K> listOfKeys = null;

        // Check if Map contains the given value
        if (mapOfWords.containsValue(value)) {
            // Create an Empty List
            listOfKeys = new ArrayList<>();

            // Iterate over each entry of map using entrySet
            for (final Map.Entry<K, V> entry : mapOfWords.entrySet()) {
                // Check if value matches with given value
                if (entry.getValue().equals(value)) {
                    // Store the key from entry to the list
                    listOfKeys.add(entry.getKey());
                }
            }
        }
        // Return the list of keys whose value matches with given value.
        return listOfKeys;
    }

    public abstract String getString();
    public abstract String[][] splitter(final String t);
}

class Splitter extends Mapper {
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

    final HashMap<String, String> getMap(String str[][])
    {
        final HashMap<String, String> tempMap = new HashMap<String, String>();
        {
            for (int i = 0; i < str.length; ++i) {
                tempMap.put(str[i][0], str[i][1]);
            }
        }

        return tempMap;
    }
}
