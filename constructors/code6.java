import java.util.Scanner;

class Commission {
    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        if (sales <= 0) {
            return 0;  
        } else if (sales <= 1000) {
            return sales * 0.05;  
        } else if (sales <= 5000) {
            return sales * 0.07;  
        } else {
            return sales * 0.1;  
        }
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sales;

        System.out.print("Enter the sales amount: ");
        sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commissionObj = new Commission(sales);
            System.out.println("The commission is: " + commissionObj.commission());
        }
    }
}
