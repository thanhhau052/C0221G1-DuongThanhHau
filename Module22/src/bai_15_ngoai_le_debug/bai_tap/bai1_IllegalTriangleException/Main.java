package bai_15_ngoai_le_debug.bai_tap.bai1_IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap 3 canh cua tam giac :  ");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                triangle.check();
                break;
            } catch (IllegalTriangleException ex) {
                System.err.println(ex);
            } catch (InputMismatchException e) {
                System.out.println("ko dc nhap chu");
            }
        } while (true);
    }
}