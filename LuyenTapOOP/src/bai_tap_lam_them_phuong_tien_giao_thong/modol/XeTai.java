package bai_tap_lam_them_phuong_tien_giao_thong.modol;

import java.util.Scanner;

public class XeTai extends PhuongTien {
    private static Scanner scanner = new Scanner(System.in);
    private static int trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return bienKiemSoat + "," +
                hangSanXuat + "," +
                namSanXuat + "," +
                chuSoHuu + "," +
                trongTai;

    }

    @Override
    public String showInfor() {
        return   "--------------------------------------------------\n"+
                "Bien kiem soat : "+ bienKiemSoat+"\n"+
                "Hang san xuat : " + hangSanXuat+ "\n"+
                "Nam san xuat : " + namSanXuat +"\n"+
                "Chu so huu : " +chuSoHuu + "\n"+
                "Trong tai  : " + trongTai + "\n";
    }
}
