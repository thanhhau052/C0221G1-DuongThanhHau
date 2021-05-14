package bai7_abstract_class_interface.bai_tap.interface_colorable_hh;

import bai6_inheritance.thuc_hanh.bai_thuc_hanh1.Shape;

public class Square extends Shape implements Colorable {
    private double side = 0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        setShape(color, filled);
        this.side = side;
    }


    private void setShape(String color, boolean filled) {
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("hình vuông: tô 4 cạnh");
    }

//    @Override
//    public void howToColor() {
//        System.out.println("hinh vuong to 4 canh ");
//    }
}
