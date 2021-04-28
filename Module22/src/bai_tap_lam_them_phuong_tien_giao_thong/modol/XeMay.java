package bai_tap_lam_them_phuong_tien_giao_thong.modol;

import java.util.Scanner;

public class XeMay extends PhuongTien {
    private static Scanner scanner = new Scanner(System.in);
    private static float congSuat;

    public XeMay(float congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, float congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return congSuat +
                bienKiemSoat + "," +
                hangSanXuat + "," +
                namSanXuat + "," +
                chuSoHuu + ",";

    }

    public static void nhapXeMay() {
        System.out.println(" Nhap vao cong suat : ");
        congSuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao bien kiem soat : ");
        bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap vao  hang san xuat : ");
        hangSanXuat = scanner.nextLine();
        System.out.println(" Nhap vao chu so huu : ");
        chuSoHuu = scanner.nextLine();
    }
}
