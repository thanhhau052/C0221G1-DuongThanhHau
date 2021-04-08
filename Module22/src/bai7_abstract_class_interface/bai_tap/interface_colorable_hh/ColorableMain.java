package bai7_abstract_class_interface.bai_tap.interface_colorable_hh;

public class ColorableMain {
    public static void main(String[] args) {
        Square square=new Square("blue",false,9);
        System.out.println(square);
        square.howToColor();
        Circle circle=new Circle(2,"red",false);
        System.out.println(circle);
        circle.howToColor();
        Rectangle rectangle=new Rectangle(6,5,"red",true);
        System.out.println(rectangle);

    }

}
