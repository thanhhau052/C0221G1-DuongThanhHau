package Case_study_furama_module2.models;

public abstract class Services {
    protected String id;
    protected String nameServices;
    protected int area;
    protected int price;
    protected int numberPerson;
    protected String type;

    public Services() {
    }

    public Services(String id, String nameServices, int area, int price, int numberPerson, String type) {
        this.id = id;
        this.nameServices = nameServices;
        this.area = area;
        this.price = price;
        this.numberPerson = numberPerson;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public abstract  String showInfor();


}
