package bai_15_ngoai_le_debug.bai_tap.bai1_IllegalTriangleException;


public class IllegalTriangleException extends Exception {
    protected double side1;
    protected double side2;
    protected double side3;

    public IllegalTriangleException() {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public IllegalTriangleException(double side1, double side2, double side3) {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}