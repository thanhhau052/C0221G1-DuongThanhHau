package bai_19_string_and_regex.bai_tap.bai1_validate_lop_hoc;

public class Main {
    public static void main(String[] args) {
        final String[] validName = new String[]{"C0221G1", "C0333G", "A00000"};

        ValidateNameOfClass validateNameOfClass = new ValidateNameOfClass();
        for (String string : validName) {
            boolean isValidate = validateNameOfClass.validate(string);
            System.out.println("Class Name : " + string + " is : " + isValidate);
        }
    }
}
