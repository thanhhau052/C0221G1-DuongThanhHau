package ThucHanh;

import java.util.Scanner;

public class BaiThucHanh3 {
    public static void main(String[] args){
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Width : ");
        width=scanner.nextFloat();
        System.out.print("Enter Height : ");
        height=scanner.nextFloat();
        float area = width*height;
        System.out.println("Dien tich la :20"+area);
    }
}
