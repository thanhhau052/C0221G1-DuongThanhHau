package Case_study_furama_module2.models;

public class House extends Services {
    private String tieuChuan;
    private String tienNghiKhac;
    private int soTang;

    public House() {
    }

    public House(String id, String nameServices, int area, int price, int numberPerson, String type) {
        super(id, nameServices, area, price, numberPerson, type);
    }

    public House(String tieuChuan, String tienNghiKhac, int soTang) {
        this.tieuChuan = tieuChuan;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "House{" +
                "tieuChuan='" + tieuChuan + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", soTang=" + soTang +
                ", id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberPerson=" + numberPerson +
                ", type='" + type + '\'' +
                '}';
    }

}
