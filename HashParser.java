package common;

import java.util.*;

abstract class Mapper{
    public <K, V> List<K> getKeys(final Map<K, V> mapOfWords, final V value) {
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

