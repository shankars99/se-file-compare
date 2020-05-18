package mapper;

import java.io.IOException;
import java.util.*;

public abstract class Mapper{

    public abstract String readWords() throws IOException;
    public abstract String[][] splitter(final String t);

    public <K, V> List<K> getKeys(final Map<K, V> mapOfExtension, final V value) {
        List<K> listOfKeys = null;

        // Check if Map contains the given value
        if (mapOfExtension.containsValue(value)) {
            // Create an Empty List
            listOfKeys = new ArrayList<>();

            // Iterate over each entry of map using entrySet
            for (final Map.Entry<K, V> entry : mapOfExtension.entrySet()) {
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

