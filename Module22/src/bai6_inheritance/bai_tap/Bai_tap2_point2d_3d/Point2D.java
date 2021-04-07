package bai6_inheritance.bai_tap.Bai_tap2_point2d_3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    this.x=0;
    this.y=0;
    }
//public float[] getXY(){
//        getXY()[0]=getX();
//    return new float[0];
//}
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] tage = {this.x, this.y};
        return tage;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x = " + x +
                ", y = " + y +
                '}'+getXY();
    }
}
