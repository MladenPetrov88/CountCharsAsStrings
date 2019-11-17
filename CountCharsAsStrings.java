import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsAsStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split(" ");


        Map<Character, Integer> wordCount = new LinkedHashMap<>();

        for (int i = 0; i < word.length; i++) {
            String b = word[i];
            for (int j = 0; j < b.length(); j++) {
                char a = b.charAt(j);
                if (!wordCount.containsKey(a)) {
                    wordCount.put(a, 1);
                } else {
                    wordCount.put(a, wordCount.get(a) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
