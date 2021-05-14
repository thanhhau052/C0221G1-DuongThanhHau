package bai_17_io_binary_file_serialization.bai_tap.bai2_coppy_file_nhi_phan;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String source="D:\\C221G1_DuongThanhHau\\Module22\\src\\bai_17_io_binary_file_serialization\\bai_tap\\bai2_coppy_file_nhi_phan\\sourceFile.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source file: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter the target file copy: ");
        String sourceTarget = scanner.nextLine();

        try {
            File file1 = new File(sourceFile);
            FileInputStream fileInputStream = new FileInputStream(file1);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);


            File file2 = new File(sourceTarget);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


            System.out.println(file1.length() + "byte");

            while (true) {
                int data = bufferedInputStream.read();
                if (data == -1) {
                    break;
                } else {
                    bufferedOutputStream.write(data);
                }

            }
            fileInputStream.close();
            fileOutputStream.close();
            bufferedOutputStream.flush();
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("File source not found !");
        }
    }
}

