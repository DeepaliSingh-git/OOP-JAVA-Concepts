// Find & Replace Words
import java.util.regex.Pattern;

public class code18 {
    public static String replaceWord(String str, String target, String replacement) {
        return str.replaceAll("\\b" + Pattern.quote(target) + "\\b", replacement);
    }
    
    public static void main(String[] args) {
        String input = "hello world, hello everyone";
        System.out.println(replaceWord(input, "hello", "hi"));
    }
}
