package bai6_inheritance.bai_tap.bai_tap3_point_va_moveablePoint;

public class PointMain {
    public static void main(String[] args) {
        Point point=new Point(10,10);
        System.out.println("Point "+point.toString());
        point.setX(20);
        point.setY(20);
        System.out.println("Sau khi set : \n"+point.toString());


        //
         point=new MoveAblePoint(point.getX(), point.getY(),30,30);
        System.out.println("MoveAblePoint :"+point.toString());


        ((MoveAblePoint) point).move();
        System.out.println("move:"+point.toString());


        MoveAblePoint moveAblePoint=new MoveAblePoint(40,40);
        System.out.println("anotherPoint "+moveAblePoint.toString());


        moveAblePoint.move();
        System.out.println("anotherPoint . move"+ moveAblePoint.toString());
    }
}
