import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "Hanna1994";
        printUniqueChars(str);
    }

    public static void printUniqueChars(String str) {
        Set<Character> uniqueCharsLinked = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uniqueCharsLinked.add(str.charAt(i));
        }
        for (char ch : uniqueCharsLinked) {
            System.out.print(ch);
        }
        System.out.println();

        // The order of characters is preserved by using LinkedHashSet
        Set<Character> uniqueCharsHash = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uniqueCharsHash.add(str.charAt(i));
        }
        for (char ch : uniqueCharsHash) {
            System.out.println(ch);
        }
    }
}
