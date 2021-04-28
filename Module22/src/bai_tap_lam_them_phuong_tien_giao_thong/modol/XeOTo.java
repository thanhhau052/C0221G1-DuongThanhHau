package bai_tap_lam_them_phuong_tien_giao_thong.modol;

import java.util.Scanner;

public class XeOTo extends PhuongTien {
    private static Scanner scanner = new Scanner(System.in);
    private  int soCho;
    private static String kieuXe;

    public XeOTo() {
    }

    public XeOTo(int soCho, String kieuXe) {
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public XeOTo(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, int soCho, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return
                 kieuXe + "," +
                 bienKiemSoat + "," +
                 hangSanXuat + "," +
                 namSanXuat + "," +
                 chuSoHuu + "," ;

    }
    public static void nhapOTo() {
        System.out.println("Nhap vao kieu xe  : ");
        kieuXe = scanner.nextLine();
        System.out.println("Nhap vao bien kiem soat : ");
        bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap vao  hang san xuat : ");
        hangSanXuat = scanner.nextLine();
        System.out.println("Nhap vao nam san xuat : ");
        namSanXuat=scanner.nextLine();
        System.out.println(" Nhap vao chu so huu : ");
        chuSoHuu = scanner.nextLine();
    }
}
