package bai6_inheritance.bai_tap.bai_tap1_hinh_tron_hinh_tru;

public class Cylinder extends Circle {
    private double radius = 5;
    private double h;


    public Cylinder(double h, double radius) {
        super(radius);
        this.h = h;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getTheTich() {
        return Math.floor(h * PI * radius * 2);
    }

    public double getDienTichXungQuanh() {
        return Math.floor(2 * PI * radius * (radius + h));
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", h=" + h +
                '}' +
                "co dien tich va the tich lan luot la :\n" +
                getDienTichXungQuanh() + " (dvdt) \n" + getTheTich() + " (dvtt)";
    }
}