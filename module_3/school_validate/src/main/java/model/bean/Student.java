package model.bean;

public class Student {
    private  int id;
    private  String name;
    private  String gender;
    private  String birthday;
    private  String email;
    private  String address;
    private  double point;

    public Student(int id, String name, String gender, String birthday, String email, String address, double point) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.point = point;
    }

    public Student(String name, String gender, String birthday, String email, String address, double point) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
