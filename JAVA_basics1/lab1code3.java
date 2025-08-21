//to print week days using switch case

import java.util.Scanner;
public class lab1code3{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the day no. Monday:1, tuesday:2, etc: ");
        int day_no = scanner.nextInt();
        switch(day_no){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            }
            scanner.close();
        }


}
