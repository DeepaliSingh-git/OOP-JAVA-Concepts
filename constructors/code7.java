// Base class Staff
class Staff {
    String code;
    String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("Staff Code: " + code);
        System.out.println("Name: " + name);
    }
}

// Derived class Teacher
class Teacher extends Staff {
    String subject;
    String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

// Derived class Officer
class Officer extends Staff {
    String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

// Derived class Typist
class Typist extends Staff {
    int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Speed: " + speed + " words per minute");
    }
}

// Derived class RegularTypist
class RegularTypist extends Typist {
    double remuneration;

    public RegularTypist(String code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Remuneration: " + remuneration);
    }
}

// Derived class CasualTypist
class CasualTypist extends Typist {
    double dailyWages;

    public CasualTypist(String code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class StaffDatabaseTest {
    public static void main(String[] args) {
        // Create objects for different staff categories
        Teacher teacher = new Teacher("T001", "John Doe", "Mathematics", "ABC Publications");
        Officer officer = new Officer("O001", "Jane Smith", "Grade A");
        RegularTypist regularTypist = new RegularTypist("R001", "Mark Lee", 60, 5000.0);
        CasualTypist casualTypist = new CasualTypist("C001", "Emma Brown", 50, 200.0);

        // Display details for each employee
        System.out.println("Teacher Details:");
        teacher.display();
        System.out.println();

        System.out.println("Officer Details:");
        officer.display();
        System.out.println();

        System.out.println("Regular Typist Details:");
        regularTypist.display();
        System.out.println();

        System.out.println("Casual Typist Details:");
        casualTypist.display();
    }
}
