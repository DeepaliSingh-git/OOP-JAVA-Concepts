import java.util.Scanner;
public class code1{
    public static void main(String args[]){
       if(args.length !=3){
        System.out.println("Invalid");
        return;
       }
       try{
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        int num3= Integer.parseInt(args[2]);
        
        if(num1> num2 && num1 > num3){
            System.out.println("The largest number is "+ num1);
            
        }
        else if(num2> num1 && num2> num3){
            System.out.println("The largest number is "+ num2);
        }
        else{
            System.out.println("The largest number is "+ num3);
        }

       }  
       catch (NumberFormatException e){
            System.out.println("Please enter valid numbers.");
       }
    
    }
}