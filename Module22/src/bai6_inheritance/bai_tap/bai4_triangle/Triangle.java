package bai6_inheritance.bai_tap.bai4_triangle;

import bai6_inheritance.thuc_hanh.bai_thuc_hanh1.Shape;

public class Triangle extends Shape {
    private  double side1=3;
    private  double side2=4;
    private  double side3=5;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){

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
    public double getDienTich(){
        return  getSide1()*getSide2()*getSide3()/3;
    }
    public double getChuVi(){
        return getSide1()*getSide2()/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}' +" co Dien tich va chu vi lan luot la : "+getDienTich()+"\t"+getChuVi();
    }
}
