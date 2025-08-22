//Interning Behavior

public class code5 {
    public static void main(String[] args) {
        String str1 = new String("Hello").intern();
        String str2 = new String("Hello");
        String str3 = "Hello";
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));
    }
}
