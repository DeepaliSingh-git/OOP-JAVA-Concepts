//Palindrome Check (Ignoring Case & Non-Alphanumeric Characters)

public class code19 {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return new StringBuilder(cleaned).reverse().toString().equals(cleaned);
    }
    
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        System.out.println(isPalindrome(input));
    }
}