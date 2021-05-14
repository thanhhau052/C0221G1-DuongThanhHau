package bai3_array_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int [] arr=GopMang1.nhapMang(scanner.nextInt());
        System.out.println("Nhập phần tử bạn muốn xóa");
        int n = scanner.nextInt();
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == n ){
//                for(int j = i ; j<arr.length -1 ; j++){
//                    arr[j] = arr[j +1 ];
//                }
//            }
//        }
        for (int i = n-1; i <arr.length-1 ; i++) {

            arr[i]=arr[i+1];

        }
       for (int i =0 ; i<arr.length-1; i++){
           System.out.println(arr[i]+" ");
       }
    }
}
