package controlles;

import commons.DanhBaException;

import java.util.Scanner;

public class QuanLiNhapLieu {
    private static Scanner scanner = new Scanner(System.in);

    public static String nhapSDT() {
        String soDienThoai = null;
        while (true){
            try {
                System.out.println("Nhap vao so dien thoai :");
                soDienThoai=scanner.nextLine();
                DanhBaException.kiemTraSDT(soDienThoai);
                return soDienThoai;
            } catch (DanhBaException e) {
                System.err.println(e.getMessage());
            }
        }

    }
    public static  String nhapNhom(){
        String nhom=null;
        while (true){
            try {
                System.out.println("Nhap vao nhom: ");
                nhom=scanner.nextLine();
                return nhom;

            }catch (Exception e){
                System.err.println(e.getMessage());

            }
        }
    }
    public static  String nhapHoTen(){
        String hoTen=null;
        while (true){
            try {
                System.out.println("Nhap vao ho ten : ");
                hoTen=scanner.nextLine();
                return hoTen;

            }catch (Exception e){
                System.err.println(e.getMessage());

            }
        }
    }
    public static  String nhapDiaChi(){
        String diaChi=null;
        while (true){
            try {
                System.out.println("Nhap vao Dia chi: ");
                diaChi=scanner.nextLine();
                return diaChi;

            }catch (Exception e){
                System.err.println(e.getMessage());

            }
        }
    }
    public static  String nhapNgaySinh(){
        String ngaySinh=null;
        while (true){
            try {
                System.out.println("Nhap vao ngay sinh : ");
                ngaySinh=scanner.nextLine();
                return ngaySinh;

            }catch (Exception e){
                System.err.println(e.getMessage());

            }
        }
    }
    public static String nhapEmail() {
        String email = null;
        while (true){
            try {
                System.out.println("Nhap vao so email :");
                email=scanner.nextLine();
                DanhBaException.kiemTraEmail(email);
                return email;
            } catch (DanhBaException e) {
                System.err.println(e.getMessage());
            }
        }

    }


}