package bai6_inheritance.thuc_hanh.bai_thuc_hanh1;


public class Circle extends Shape {
    private  double radius=1;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle( double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPrerimeter(){
        return 2*radius*Math.PI;

    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
