package commons;

import models.DanhBa;

public class DanhBaException extends Exception {
    public DanhBaException(String message) {
        super(message);
    }

    public static void kiemTraEmail(String input) throws DanhBaException {
        final String REGEX_EMAIL = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+\\.[A-Za-z0-9_]+$";
        if (input.matches(REGEX_EMAIL) == false) {
            throw new DanhBaException("Nhập sai định dạng "+"\n ^[A-Za-z0-9_]+@[A-Za-z0-9_]+\\.[A-Za-z0-9_]+$");
        }

    }
    public  static  void kiemTraSDT(String input) throws DanhBaException{
        final String REGEX_SDT="[0-9]{4}-[0-9]{3}-[0-9]{3}";
        if (input.matches(REGEX_SDT)==false){
            throw new DanhBaException("Nhập sai định dạng "+"\n String REGEX_SDT=\"^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$\"");
        }

    }
}
