//Validate Email

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class code16 {
    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        String email1 = "test@example.com";
        String email2 = "invalid-email";
        System.out.println(isValidEmail(email1));
        System.out.println(isValidEmail(email2));
    }
}