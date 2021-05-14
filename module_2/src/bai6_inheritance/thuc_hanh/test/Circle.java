package bai6_inheritance.thuc_hanh.test;

public class Circle extends Geometric {
    private double radius;



    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * Math.PI * radius;
    }

    public double getPerimeter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + "circle is created with the radius is " + radius);


    }

    public String getDiameter() {
        return "diameter";
    }
}
