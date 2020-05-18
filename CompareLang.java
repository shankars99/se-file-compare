import languages.Language;

import java.util.*;

public class CompareLang {
    public static void main(final String[] args) {
         final Language obj = new Language();

         // Create a Map of words and their frequency count
         final String str[][] = obj.splitter(obj.getString());
         final HashMap<String, String> mapOfExtension = obj.getMap(str);
         final String testKey = "JavaScript";

         // Get the list of keys whose value matches with given value.
         final List<String> listOfKeys = obj.getKeys(mapOfExtension, testKey);

        System.out.println(listOfKeys);
        System.out.println("\n" + testKey + " = " + mapOfExtension.get(".js"));
    }

}