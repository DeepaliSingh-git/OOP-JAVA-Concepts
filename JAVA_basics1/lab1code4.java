//to check if a no. is palindrome or not

import java.util.Scanner;

public class lab1code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= scanner.nextInt();
        int dig,rev=0;
        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
            
        }
        System.out.print(rev);
        if (rev==num){
            System.out.print("Palindome number");
        }
        else{
            System.out.print("not a palindrome no.");
        }
        scanner.close();
    }
}