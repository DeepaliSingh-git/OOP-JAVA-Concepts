//Extract Numbers from a String

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class code17 {
    public static List<Integer> extractNumbers(String str) {
        List<Integer> numbers = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        return numbers;
    }
    
    public static void main(String[] args) {
        String input = "abc123def456";
        System.out.println(extractNumbers(input));
    }
}
