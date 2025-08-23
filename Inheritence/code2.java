import java.util.Scanner;
public class code2{
    public static void main(String args[]){
        if (args.length != 10){
            System.out.println("Invalid");
            return;
        }
        int evenCount=0;
        int oddCount=0;
        try{
            for(String arg : args){
                int num= Integer.parseInt(arg);
                if(num%2 ==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            
            System.out.println("The even count is  "+ evenCount);
            System.out.println("The odd count is  "+ oddCount);
            
        }
        catch (NumberFormatException e){
            System.out.println("Please enter valid numbers");
        }
}}