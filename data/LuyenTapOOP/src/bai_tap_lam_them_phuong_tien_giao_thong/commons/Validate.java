package bai_tap_lam_them_phuong_tien_giao_thong.commons;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    private static Scanner scanner = new Scanner(System.in);
    public  static String biemKiemSoatOto(){
     String regex="[0-9]{2}[AB]-[0-9]{3}.[0-9]{2}";
     do {
        try {
            System.out.println("Nhap vao bien kiem soat");
            String  bienKiemSoat=scanner.nextLine();
           if (!Pattern.matches(regex,bienKiemSoat)){
               throw new Exception("Hãy nhập theo nguyên tắc sau : " +
                       "\nÔtô: XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)");
           }
            return bienKiemSoat;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
     }while (true);
    }
    public  static  String biemKiemSoatXeMay(){
        String regex="[0-9]{2}-[A-Z][0-9A-Z]-[0-9]{3}.[0-9]{2}";
        do {
            try {
                System.out.println("Nhập vào biển kiểm soát  :");
                String bienKiemSoat=scanner.nextLine();
                if (!Pattern.matches(regex,bienKiemSoat)){
                    throw  new  Exception("Vui lòng nhập theo nguyên tắc sau : \n" +
                            "Xe máy: XX-YZ-XXX.XX (X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa)");
                }
                return bienKiemSoat;
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (true);

    }
    public static  String biemKiemSoatXeTai() {
        String regex="[0-9]{2}C-[0-9]{3}.[0-9]{2}";
        do {
            try {
                System.out.println("Nhập vào biển kiểm soát : ");
                String bienKienSoat= scanner.nextLine();
                if (!Pattern.matches(regex,bienKienSoat)){
                    throw  new  Exception("Vui lòng nhập lại theo nguyên tắc sau  : \n" +
                            "Xe tải: XXC-XXX.XX (X : 0÷9)");

                }
                return  bienKienSoat;

            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (true);
    }

}
