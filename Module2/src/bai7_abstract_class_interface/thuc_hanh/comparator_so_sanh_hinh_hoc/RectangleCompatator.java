package bai7_abstract_class_interface.thuc_hanh.comparator_so_sanh_hinh_hoc;

import bai6_inheritance.thuc_hanh.bai_thuc_hanh1.Circle;

import java.util.Comparator;

public class RectangleCompatator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

}
