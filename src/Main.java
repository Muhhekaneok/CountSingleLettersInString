import java.util.HashMap;
import java.util.Map;
// print counted duplicate letters in 1 line
public class Main {
    public static void main(String[] args) {
        String str = "AABCDDEEEFHUUWABCIFF";
        System.out.println(getLetterCount(str));
    }
    public static String getLetterCount(String str) {
        Map<Character, Integer> lettersCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (lettersCount.containsKey(str.charAt(i))) {
                int value = lettersCount.get(str.charAt(i));
                value++;
                lettersCount.put(str.charAt(i), value);
            } else {
                lettersCount.put(str.charAt(i), 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> m : lettersCount.entrySet()) {
            result.append(m.getKey()).append(m.getValue());
        }
        return result.toString();
    }
}