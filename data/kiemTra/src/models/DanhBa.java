package models;

public class DanhBa {
    protected String soDienThoai;
    protected String nhomCuaDanhBa;
    protected String hoTen;
    protected String diaChi;
    protected String ngaySinh;
    protected String email;

    public DanhBa() {
    }

    public DanhBa(String soDienThoai, String nhomCuaDanhBa, String hoTen, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhomCuaDanhBa = nhomCuaDanhBa;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }


    @Override
    public String toString() {
        return soDienThoai + "," +
                nhomCuaDanhBa + "," +
                hoTen + "," +
                diaChi + "," +
                ngaySinh + "," +
                email;

    }

    public String showInfor() {
        return "DanhBa{" +
                "soDienThoai='" + soDienThoai + '\'' +
                ", nhomCuaDanhBa='" + nhomCuaDanhBa + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
