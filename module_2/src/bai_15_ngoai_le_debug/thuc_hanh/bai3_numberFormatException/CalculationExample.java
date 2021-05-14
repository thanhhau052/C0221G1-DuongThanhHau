package bai_15_ngoai_le_debug.thuc_hanh.bai3_numberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        int x,y;
        do {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
         x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
         y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
        }while (x!=1||y!=1);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}