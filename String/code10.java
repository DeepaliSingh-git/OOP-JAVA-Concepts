//Custom toLowerCase() and toUpperCase()

public class code10 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(toLowerCase(str));
        System.out.println(toUpperCase(str));
    }
    public static String toLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }}
        return result.toString();
    }
    public static String toUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32));
            } else {
                result.append(c);
            }}
        return result.toString();
    }}
