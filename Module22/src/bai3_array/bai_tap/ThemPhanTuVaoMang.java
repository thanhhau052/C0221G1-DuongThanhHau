package bai3_array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {

    public static void main(String[] args) {
        int n;
        int i;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int arr[] = new int[n];
        int arr1[]= new int[n+1];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Bạn muốn thêm  vào vi trí thứ index = ");
        int index=scanner.nextInt();
        System.out.println("Ban muon them phan tu nao vao mang ? ");
        int num=scanner.nextInt();
        for (i=0;i<arr1.length;i++){
            if(i==index){
                arr1[index]=num;
            }else  if(i>index){
                arr1[i]=arr[i-1];
            }else {
                arr1[i]=arr[i];
            }

        }

//        for (i=n-index+1;i<arr1.length;i++){
//            arr1[index+1]=arr[i];
//        }


        for (i=0;i<arr1.length; i++){
            System.out.println("arr1["+i+"] = "+arr1[i]);
        }
    }
}
