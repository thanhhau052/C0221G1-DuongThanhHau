package quan_li_can_bo.models;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String id, String ten, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(id, ten, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
//        return super.toString()+","+"2" +","+ nganhDaoTao ;
        return String.format("%s,2,%s", super.toString(), nganhDaoTao);

    }

    @Override
    public void showInfo() {
        System.out.printf("KySu{" +
                "nganhDaoTao.csv='" + nganhDaoTao + '\'' +
                ", id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}');
    }

}