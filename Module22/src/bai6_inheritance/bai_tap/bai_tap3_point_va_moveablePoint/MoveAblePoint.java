package bai6_inheritance.bai_tap.bai_tap3_point_va_moveablePoint;

public class MoveAblePoint extends Point {
    private double xSpeed = 0;

    private double ySpeed = 0;


    public MoveAblePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public MoveAblePoint() {

    }

//    public MoveAblePoint(double[] a) {
//        super(a[0], a[1]);
//
//    }

    public MoveAblePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public double getxSpeed() {
        return xSpeed;

    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;

    }

    public double getySpeed() {
        return ySpeed;

    }


    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }


    public Point move() {
        this.setxSpeed(this.getX() + this.getxSpeed());
        this.setySpeed(this.getY() + this.getySpeed());
        return this;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public double[] getSpeed() {
        double[] tage = {this.xSpeed, this.ySpeed};
        return tage;
    }

    @Override
    public String toString() {
        return super.toString() + "MoveAblePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }


}
