package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Bai3ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tienViet;
        double tienDo;
        System.out.println("nhap vao so tien ban can chuyen doi (Dola)");
        tienViet=Float.parseFloat(scanner.nextLine());
        tienDo=tienViet*23;
        System.out.println("ket qua La :"+tienDo+"(nghin dong)");

    }
}
