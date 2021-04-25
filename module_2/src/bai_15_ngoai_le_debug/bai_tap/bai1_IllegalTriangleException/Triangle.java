package bai_15_ngoai_le_debug.bai_tap.bai1_IllegalTriangleException;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
    public void check() throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 && side1 < 0 && side2 < 0 && side3 < 0)
            throw new IllegalTriangleException();
        System.out.println("hello");
        double chuVi=getSide1()+getSide2()+getSide3();
        System.out.println("chu vi la :"+chuVi);

    }

}