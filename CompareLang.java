import common.Splity;
import java.util.*;

public class CompareLang {
    public static void main(final String[] args) {
         Splity obj = new Splity();

         // Create a Map of words and their frequency count
         final String str[][] = obj.splitter(obj.getString());
         final HashMap<String, String> mapOfWords = obj.getMap(str);
         final String testKey = "JavaScript";

         // Get the list of keys whose value matches with given value.
         final List<String> listOfKeys = obj.getKeys(mapOfWords, testKey);

        System.out.println(listOfKeys);
        System.out.println("\n" + testKey + " = " + mapOfWords.get(".js"));
    }

}