package bai_19_string_and_regex.bai_tap.bai2_validate_number_phone;

public class Main {
    private static ValidateNumberPhone validateNumberPhone;
    public static final String [] isphoneNumber = new String[] {"(84)-(399191054)", "(8a)-(799009023)", "((84)-(123456)"};

    public static void main(String[] args) {
        validateNumberPhone = new ValidateNumberPhone();

        for (String phone : isphoneNumber) {
            boolean isvalid = validateNumberPhone.validate(phone);
            System.out.println("Phone Number is " + phone + " is valid: " + isvalid);
        }
    }
}
