// Reverse a String (Without Built-in Methods)
public class code6 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
