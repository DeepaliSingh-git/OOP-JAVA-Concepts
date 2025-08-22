//Find First Non-Repeating Character
import java.util.LinkedHashMap;
import java.util.Map;

public class code9 {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(findFirstNonRepeatingCharacter(str));
    }

    public static char findFirstNonRepeatingCharacter(String input) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
