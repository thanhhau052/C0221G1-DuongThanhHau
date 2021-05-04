package bai_tap_lam_them_phuong_tien_giao_thong.modol;

public abstract class PhuongTien {
    protected static String bienKiemSoat;
    protected static String hangSanXuat;
    protected static String namSanXuat;
    protected static String chuSoHuu;

    public PhuongTien() {
    }


    public PhuongTien(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return bienKiemSoat + "," +
                hangSanXuat + "," +
                namSanXuat + "," +
                chuSoHuu + ","
                ;

    }

public abstract String showInfor();

}
