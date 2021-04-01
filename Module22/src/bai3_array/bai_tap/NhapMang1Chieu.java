package bai3_array.bai_tap;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NhapMang1Chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang :");
        int n=scanner.nextInt();
        int arr[];
        arr = new int[n];
        int i = 0;
        while (i < arr.length) {
            System.out.print(" Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }



    }



}
