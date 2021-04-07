package bai6_inheritance.bai_tap.bai_tap1_hinh_tron_hinh_tru;

public class Circle {
    private double radius=5;
    private String color="blue";
    final double PI = Math.PI;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(double radius){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDienTich() {
        return Math.floor(getRadius() * getRadius() * PI);

    }

    public double getChuVi() {
        return Math.floor(2 * PI * getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color=" + getColor() + "}" +
                "\n Dien tich la : " + getDienTich() +
                "\nChu vi la : " + getChuVi() +
                "\n Hinh tron co mau sac la :" + getColor();
    }
}
