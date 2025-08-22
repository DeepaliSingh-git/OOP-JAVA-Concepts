// Find the Most Frequent Character
public class code27 {
    public static String customTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return str.substring(start, end + 1);
    }
    
    public static void main(String[] args) {
        String input = "   Hello World!   ";
        System.out.println("[" + customTrim(input) + "]");
    }
}
