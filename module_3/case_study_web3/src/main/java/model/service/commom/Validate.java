package model.service.commom;

import java.util.Date;

public class Validate {
    private final String REGEX_CUSTOMER = "^(KH)\\-[0-9]{4}$";
    private final String REGEX_SERVICE = "^(DV)\\-[0-9]{4}$";
    private final String REGEX_PHONE = "^(091|090)-[0-9]{7}$";
    private final String REGEX_ID_CARD = "^([0-9]{9}|[0-9]{12})$";
    private final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
    private final String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";



    public void validateCustomer(String customer) throws Exception {
        if (!customer.matches(REGEX_CUSTOMER)) {
            throw new Exception("Mã Khách hàng có định dạng là KH-XXXX (X là số từ 0-9) ");
        }
    }
    public void validateService(String service) throws Exception {
        if (!service.matches(REGEX_SERVICE)) {
            throw new Exception(" Mã Dịch vụ có định dạng là DV-XXXX (X là số 0-9) ");
        }
    }
    public void validatePhone(String phone) throws Exception {
        if (!phone.matches(REGEX_PHONE)) {
            throw new Exception("Số điện thoại phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx ");
        }
    }
    public void validateIdCard(String idCard) throws Exception {
        if (!idCard.matches(REGEX_ID_CARD)) {
            throw new Exception("Số CMND phải đúng định dạng XXXXXXXXX hoặc XXXXXXXXXXXX  (X là số từ 0-9) ");
        }
    }
    public void validateEmail(String email) throws Exception {
        if (!email.matches(REGEX_EMAIL)) {
            throw new Exception("Phai nhap dung dinh dang email ^[A-Za-z0-9+_.-]+@(.+)$ ");
            //user_name@domain.co.in
            //user-name@domain.co.in
            //user@domaincom
        }
    }

    public void validateDate(String date) throws Exception {
        if (!date.toString().matches(REGEX_DATE)) {
            throw new Exception("theo format DD/MM/YYYY");
        }
    }

    public void validateINumber(int number) throws Exception{
        if(number <0 ){
            throw new Exception("Nhap so lon hon  > 0");
        }
    }

    public void validateDNumber(double number) throws Exception{
        if(number <0 ){
            throw new Exception("Nhap so lon hon  > 0");
        }
    }
}
