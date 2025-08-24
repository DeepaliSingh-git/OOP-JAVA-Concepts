class Account {
    protected int acc_no;
    protected double balance;

    Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void disp() {
        System.out.println("Account Number: " + acc_no + ", Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;

    Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    void disp() {
        System.out.println("Name: " + name + ", Aadhar No: " + aadhar_no + ", Account Number: " + acc_no + ", Balance: " + balance);
    }
}

public class code3 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person(101, 5000.0, "Alice", "1234-5678-9101"),
            new Person(102, 10000.0, "Bob", "2345-6789-1011"),
            new Person(103, 7500.0, "Charlie", "3456-7890-1112"),
            new Person(104, 15000.0, "David", "4567-8901-1213"),
            new Person(105, 20000.0, "Eve", "5678-9012-1314")
        };

        for (Person person : persons) {
            person.disp();
        }
    }
}
