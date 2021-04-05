package bai4_oop_in_java.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class LopHinhChuNhat {
    double width;
    double height;
    public LopHinhChuNhat( double width, double height){
        this.width= width;
        this.height= height;


    }
    public double getDienTich(){
        return this.height*this.width;

    }
    public  double getChuVi(){
        return  (this.height+this.width)*2;
    }
    public String hienThi(){
        return "Dien tich {"+ "height="+height+" width="+width +"}";
    }



}
