package bai_tap_lam_them_phuong_tien_giao_thong.commons;

import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeMay;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeOTo;
import bai_tap_lam_them_phuong_tien_giao_thong.modol.XeTai;

import java.util.Scanner;

public class NhapDauVao {
    static Scanner scanner = new Scanner(System.in);

    public static XeTai nhapXeTai() {
        do {
            try {
                String bienKiemSoat = Validate.biemKiemSoatXeTai();
                System.out.println("Nhap vao  hang san xuat : ");
                String hangSanXuat = scanner.nextLine();
                System.out.println("Nhap vao nam san xuat : ");
                String namSanXuat = scanner.nextLine();
                System.out.println(" Nhap vao chu so huu : ");
                String chuSoHuu = scanner.nextLine();
                System.out.println(" Nhap vao trong tai : ");
                int trongTai = Integer.parseInt(scanner.nextLine());
                return new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);


    }

    public static XeMay nhapXeMay() {
        do {
            try {
                String bienKiemSoat = Validate.biemKiemSoatXeMay();
                System.out.println("Nhap vao  hang san xuat : ");
                String hangSanXuat = scanner.nextLine();
                System.out.println("Nhap vao nam san xuat : ");
                String namSanXuat = scanner.nextLine();
                System.out.println(" Nhap vao chu so huu : ");
                String chuSoHuu = scanner.nextLine();
                System.out.println(" Nhap vao cong suat : ");
                int congSuat = Integer.parseInt(scanner.nextLine());
                return new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        } while (true);


    }

    //t
    public static XeOTo nhapOTo() {
        do {
            try {
                String bienKiemSoat =Validate.biemKiemSoatOto();
                System.out.println("Nhap vao  hang san xuat : ");
                String hangSanXuat = scanner.nextLine();
                System.out.println("Nhap vao nam san xuat : ");
                String namSanXuat = scanner.nextLine();
                System.out.println(" Nhap vao chu so huu : ");
                String chuSoHuu = scanner.nextLine();
                System.out.println("Nhap vao cho ngoi ");
                int soCho = Integer.parseInt(scanner.nextLine());
                String kieuXe;
               if (bienKiemSoat.contains("A")){
                   kieuXe="Du lich";

               }
               else {
                   kieuXe="Xe khach ";
               }
                return new XeOTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soCho, kieuXe);
            } catch (Exception e) {
                System.err.println(e.getCause());

            }
        } while (true);


    }
}
