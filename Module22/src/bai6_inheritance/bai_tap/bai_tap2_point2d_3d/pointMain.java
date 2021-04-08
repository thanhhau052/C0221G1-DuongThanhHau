package bai6_inheritance.bai_tap.bai_tap2_point2d_3d;

public class pointMain {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(1,2);

        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(3,4,5);

        System.out.println(point3D.toString());
        //
        point2D.setX(10);
        point2D.setY(10);
        System.out.println("Sau khi set :  \n"+point2D.toString());
        point3D.setZ(10);
        System.out.println("sau khi set :  \n"+point3D.toString());


    }

}
