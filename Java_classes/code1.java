class Plate {
    private double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate Constructor: length = " + length + ", width = " + width);
    }
}

class Box extends Plate {
    private double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box Constructor: height = " + height);
    }
}

class WoodBox extends Box {
    private double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox Constructor: thickness = " + thickness);
    }
}

public class code1 {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(10.0, 5.0, 8.0, 0.5);
    }
}
