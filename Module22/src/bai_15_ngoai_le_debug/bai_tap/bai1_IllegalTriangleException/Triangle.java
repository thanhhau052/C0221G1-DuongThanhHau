package bai_15_ngoai_le_debug.bai_tap.bai1_IllegalTriangleException;

public class Triangle extends IllegalTriangleException {
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 && side1 < 0 && side2 < 0 && side3 < 0)
            throw new IllegalTriangleException(side1, side2, side3);
        System.out.println("loi");

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}