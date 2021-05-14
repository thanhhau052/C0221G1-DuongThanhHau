package bai4_oop_in_java.thuc_hanh.lop_hinh_chu_nhat;

import bai4_oop_in_java.thuc_hanh.lop_hinh_chu_nhat.LopHinhChuNhat;

import java.util.Scanner;

public class HCNMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width=scanner.nextFloat();
        System.out.println("Enter the height:" );
        double height =scanner.nextFloat();
        LopHinhChuNhat hinhChuNhat = new LopHinhChuNhat(width, height);
        System.out.println("Dien tich la : \n"+hinhChuNhat.hienThi());
        System.out.println("Dien tich la : "+ hinhChuNhat.getDienTich());
        System.out.println("Chu vi cua hinh chu nhat la : "+hinhChuNhat.getChuVi());    }
}
