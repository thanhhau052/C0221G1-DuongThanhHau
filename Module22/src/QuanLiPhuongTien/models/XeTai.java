package QuanLiPhuongTien.models;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }


    @Override
    public String toString() {
        return trongTai +","+
                bienKiemSoat+","+
                hangSanXuat+","+
                namSanXuat+","+
                chuSoHuu;
    }

    @Override
    public String showInfor() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
