class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println(number);
    }
}

class HexNum extends Num {

    HexNum(int number) {
        super(number);
    }

    @Override
    void shownum() {
        System.out.println(Integer.toHexString(number));
    }
}

public class Main {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.shownum();

        HexNum hexNum = new HexNum(255);
        hexNum.shownum();
    }
}
