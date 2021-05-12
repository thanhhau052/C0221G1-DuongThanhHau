package commons;

import models.DanhBa;

public class DanhBaException extends Exception {
    public DanhBaException(String message) {
        super(message);
    }

    public static void kiemTraEmail(String input) throws DanhBaException {
        final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$";
        if (input.matches(REGEX_EMAIL) == false) {
            throw new DanhBaException("Nhập sai định dạng "+"\n  String REGEX_EMAIL = \"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\\\\\.[a-zA-Z]{2,6}$\"");
        }

    }
    public  static  void kiemTraSDT(String input) throws DanhBaException{
        final String REGEX_SDT="[0-9]{4}-[0-9]{3}-[0-9]{3}";
        if (input.matches(REGEX_SDT)==false){
            throw new DanhBaException("Nhập sai định dạng "+"\n String REGEX_SDT=\"^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$\"");
        }

    }
}
