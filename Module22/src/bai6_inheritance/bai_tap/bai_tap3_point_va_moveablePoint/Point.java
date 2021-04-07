package bai6_inheritance.bai_tap.bai_tap3_point_va_moveablePoint;

public class Point {
    private double x=0;
    private double y=0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public  Point(){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY(){
        double[] tage={this.x,this.y};
        return tage;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }
}
