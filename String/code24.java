//Compare == vs .equals()
public class code24 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        String str3 = "world";
        String str4 = "world";
        
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
