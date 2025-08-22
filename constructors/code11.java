class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println(number);
    }
}

class OctNum extends Num {

    OctNum(int number) {
        super(number);
    }

    @Override
    void shownum() {
        System.out.println(Integer.toOctalString(number));
    }
}

public class Main {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.shownum();

        OctNum octNum = new OctNum(255);
        octNum.shownum();
    }
}
