package bai_tap_lam_them_phuong_tien_giao_thong.modol;

import java.util.Scanner;

public class XeMay extends PhuongTien {
    private static Scanner scanner = new Scanner(System.in);
    private static int congSuat;

    public XeMay() {

    }

    public XeMay(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return bienKiemSoat + "," +
                hangSanXuat + "," +
                namSanXuat + "," +
                chuSoHuu + "," +
                congSuat;

    }

    @Override
    public String showInfor() {
        return "--------------------------------------------------\n"+
                "Bien kiem soat : "+ bienKiemSoat+"\n"+
                "Hang san xuat : " + hangSanXuat+ "\n"+
                "Nam san xuat : " + namSanXuat +"\n"+
                "Chu so huu : " +chuSoHuu + "\n"+
                "Cong suat : " + congSuat + "\n";
    }
}
