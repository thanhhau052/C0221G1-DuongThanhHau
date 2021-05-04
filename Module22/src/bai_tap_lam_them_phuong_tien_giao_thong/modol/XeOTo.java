package bai_tap_lam_them_phuong_tien_giao_thong.modol;

import java.util.Scanner;

public class XeOTo extends PhuongTien {
    private static Scanner scanner = new Scanner(System.in);
    private int soCho;
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
        return bienKiemSoat + "," +
                hangSanXuat + "," +
                namSanXuat + "," +
                chuSoHuu + "," +
                soCho + "," +
                kieuXe ;

    }

    @Override
    public String showInfor() {
        return "--------------------------------------------------\n"+
                "Bien kiem soat : "+ bienKiemSoat+"\n"+
                "Hang san xuat : " + hangSanXuat+ "\n"+
                "Nam san xuat : " + namSanXuat +"\n"+
                "Chu so huu : " +chuSoHuu + "\n"+
                "So cho  : " + soCho + "\n"+
                "Kieu xe : " + kieuXe+"\n";
    }

}
