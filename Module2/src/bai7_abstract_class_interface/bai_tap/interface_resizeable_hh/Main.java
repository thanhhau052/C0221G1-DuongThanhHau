package bai7_abstract_class_interface.bai_tap.interface_resizeable_hh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x,"red",true);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 100);
        }
        System.out.println("\n");
//        System.out.println(shapes);
//        Shape.printShape(shapes);
        System.out.println(Arrays.toString(shapes));
    }
}


