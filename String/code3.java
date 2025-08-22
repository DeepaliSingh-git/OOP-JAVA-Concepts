//String Memory Usage
public class code3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        String str3 = "Hello";
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        str2 = "World";
        System.out.println("After modifying str2:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2: " + (str1 == str2));
    }
}