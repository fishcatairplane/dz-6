import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"мама", "папа", "їж їжак желе"};
        char[] result = solver(words);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No match found.");
        }
    }

    public static char[] solver(String[] wordsSome) {

        List<String> helpList = new ArrayList<>();

        for (String word : wordsSome) {
            char[] chars = word.toCharArray();
            Map<Character, Integer> helpMap = new HashMap<>();

            for (Character character : chars) {
                helpMap.put(character, helpMap.getOrDefault(character, 0) + 1);
            }

            boolean isRightWord = true;

            for (Integer count : helpMap.values()) {
                if (count % 2 != 0) {
                    isRightWord = false;
                    break;
                }
            }

            if (isRightWord) {
                helpList.add(word);
            }
        }

        Set<Character> mySet = new HashSet<>();

        if (helpList.size() >= 2) {
            for (Character character : helpList.get(0).toCharArray()) {
                boolean inAllWords = true;
                for (int i = 1; i < helpList.size(); i++) {
                    if (helpList.get(i).indexOf(character) == -1) {
                        inAllWords = false;
                        break;
                    }
                }
                if (inAllWords) {
                    mySet.add(character);
                }
            }
        }

        if (mySet.isEmpty()) {
            return null;
        }

        char[] result = new char[mySet.size()];
        int i = 0;

        for (Character character : mySet) {
            result[i++] = character;
        }

        return result;
    }
}