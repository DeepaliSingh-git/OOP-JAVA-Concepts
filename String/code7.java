//Reverse Words in a String

public class code7 {
    public static void main(String[] args) {
        String str = "Java is fun";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String input) {
        StringBuilder result = new StringBuilder();
        int end = input.length();
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || i == 0) {
                if (i == 0) {
                    result.append(input.substring(i, end));
                } else {
                    result.append(input.substring(i + 1, end)).append(" ");
                }
                end = i;
            }
        }
        return result.toString();
    }
}
