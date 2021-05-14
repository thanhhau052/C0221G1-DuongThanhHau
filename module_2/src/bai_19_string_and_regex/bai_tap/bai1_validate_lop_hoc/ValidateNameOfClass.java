package bai_19_string_and_regex.bai_tap.bai1_validate_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameOfClass {
    private static final String NAME_REGEX = "^[CAP][0-9]{4}[G-M]$";

    public ValidateNameOfClass() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();
    }
}