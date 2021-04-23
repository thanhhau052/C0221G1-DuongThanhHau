package bai_15_ngoai_le_debug.bai_tap.bai1_IllegalTriangleException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap 3 canh cua tam giac :  ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                triangle.check();
                break;
            }
            catch (IllegalTriangleException ex) {

                System.err.println(ex);
            }
        } while (true);
    }
}