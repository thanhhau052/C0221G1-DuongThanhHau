package case_study_furama_resort.modol;

public class Customer{
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services service;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String customerType, String address, Services service) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.service = service;
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String splitDatum, String splitDatum1, String splitDatum2, String splitDatum3, String splitDatum4, String splitDatum5, String splitDatum6, String splitDatum7, String splitDatum8, String splitDatum9, String splitDatum10, String splitDatum11, String splitDatum12, String splitDatum13) {
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public String showInfor() {
        return "-----------------CUSTOMER----------------"
                +"\nName: " + name
                +"\nBirthday: " + birthday
                +"\nGender: " + gender
                +"\nID Card: " + idCard
                +"\nPhone Number: " + phoneNumber
                +"\nEmail: " + email
                +"\nType of Customer: " + customerType
                +"\nAddress: " + address;
    }

}