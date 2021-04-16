package Case_study_furama_module2.models;

public class Villa extends House {
    private float dienTichHoBoi;

    public Villa() {
    }

    public Villa(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String id, String nameServices, int area, int price, int numberPerson, String type, float dienTichHoBoi) {
        super(id, nameServices, area, price, numberPerson, type);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String tieuChuan, String tienNghiKhac, int soTang, float dienTichHoBoi) {
        super(tieuChuan, tienNghiKhac, soTang);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String showInfor() {
        return "Villa{" +
                "dienTichHoBoi=" + dienTichHoBoi +
                ", id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberPerson=" + numberPerson +
                ", type='" + type + '\'' +
                '}';
    }
}
