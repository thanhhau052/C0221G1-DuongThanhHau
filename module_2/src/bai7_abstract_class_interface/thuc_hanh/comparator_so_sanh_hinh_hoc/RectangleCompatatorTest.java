package bai7_abstract_class_interface.thuc_hanh.comparator_so_sanh_hinh_hoc;


import bai6_inheritance.thuc_hanh.bai_thuc_hanh1.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleCompatatorTest {
    private static Rectangle Rectangle;

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(2, 4);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(3, 5);

        System.out.println("Pre-sorted:");
        Rectangle[] rectangles1;
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator rectangleCompatator = new RectangleCompatator();
        Arrays.sort(rectangles, rectangleCompatator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
