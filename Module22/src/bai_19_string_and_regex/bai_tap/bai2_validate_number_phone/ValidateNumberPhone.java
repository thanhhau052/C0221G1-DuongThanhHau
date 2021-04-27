package bai_19_string_and_regex.bai_tap.bai2_validate_number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static final String NUMBER_PHONE_REGEX = "^[(]{1}\\d{2}[)]{1}[-]{1}[(]{1}\\d{9}[)]{1}$";
    private static Pattern pattern;
    private Matcher matcher;
    public ValidateNumberPhone() {
        pattern = pattern.compile(NUMBER_PHONE_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
