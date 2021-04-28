package bai_tap_lam_them_phuong_tien_giao_thong.modol;

import java.util.Scanner;

public class XeTai extends PhuongTien {
    private  static Scanner scanner = new Scanner(System.in);
    private static float trongTai;

    public XeTai(float trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, float trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return trongTai +
                bienKiemSoat + "," +
                hangSanXuat + "," +
                namSanXuat + "," +
                chuSoHuu + ",";

    }

    public static void nhapXeTai() {
        System.out.println(" Nhap vao trong tai : ");
        trongTai=scanner.nextInt();
        System.out.println("Nhap vao bien kiem soat : ");
        bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap vao  hang san xuat : ");
        hangSanXuat = scanner.nextLine();
        System.out.println(" Nhap vao chu so huu : ");
        chuSoHuu = scanner.nextLine();
    }

}
