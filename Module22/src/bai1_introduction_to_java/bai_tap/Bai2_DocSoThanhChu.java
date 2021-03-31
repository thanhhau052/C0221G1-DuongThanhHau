package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Bai2_DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nhap;
        String doc = "";
        System.out.print("nhap vao so can doc : ");
        nhap = Integer.parseInt(scanner.nextLine());
        switch (nhap) {
            case 1:
                doc = "mot";
                break;
            case 2:
                doc = "hai";
                break;
            case 3:
                doc = "ba";
                break;
            case 4:
                doc = "bon";
                break;
            case 5:
                doc = "nam";
                break;
            case 6:
                doc = "sau";
                break;
            case 7:
                doc = "bay";
                break;
            case 8:
                doc = "tam";
                break;
            case 9:
                doc = "chin";
                break;
            case 10:
                doc = "muoi";
                break;
            case 11:
                doc = "muoi mot ";
                break;
            case 12:
                doc = "muoi hai";
                break;
            case 13:
                doc = "muoi ba";
                break;
            case 14:
                doc = "muoi bon";
                break;
            case 15:
                doc = "muoi lam";
                break;
            case 16:
                doc = "muoi sau";
                break;
            case 17:
                doc = "muoi bay";
                break;
            case 18:
                doc = "muoi tam";
                break;
            case 19:
                doc = "muoi chin";
                break;
            case 20:
                doc = "hai chuc";
                break;
            default:
                doc = "hay nhap vao so nho hon 20";


        }
        System.out.println(doc);

    }
}
