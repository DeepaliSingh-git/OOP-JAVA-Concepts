//Remove Duplicates
import java.util.LinkedHashSet;

public class code8 {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
