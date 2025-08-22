// Find All Substrings
public class code11 {
    public static void main(String[] args) {
        String str = "abc";
        generateSubstrings(str);
    }

    public static void generateSubstrings(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}
