package Case_study_furama_module2.models;

public class Room extends Services {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(String id, String nameServices, int area, int price, int numberPerson, String type, String dichVuMienPhiDiKem) {
        super(id, nameServices, area, price, numberPerson, type);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                ", id='" + id + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberPerson=" + numberPerson +
                ", type='" + type + '\'' +
                '}';
    }


}
