package bai_17_io_binary_file_serialization.thuc_hanh.coppy_file_binary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private  static  void copyFileUsingJava7Files(File source , File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private  static  void copyFileUsingStream( File source , File dest) throws  IOException{
        InputStream inputStream= null;
        OutputStream outputStream=null;
        try {
            inputStream = new FileInputStream(source);
            File file = new File("D:\\C221G1_DuongThanhHau\\Module22\\src\\bai_17_io_binary_file_serialization\\thuc_hanh\\coppy_file_binary\\test.txt");
            outputStream= new FileOutputStream(dest);
            System.out.println(file.length());
            byte[] buffer = new byte[(int)file.length()];
            int length =0 ;
            while ((length=inputStream.read(buffer))>0){
                outputStream.write(buffer, 0,length/2);

//                outputStream.write();
            }

        }finally {
            inputStream.close();
            outputStream.close();
        }

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter source file : ");
        String sourcePath="D:\\C221G1_DuongThanhHau\\Module22\\src\\bai_17_io_binary_file_serialization\\thuc_hanh\\coppy_file_binary\\test.txt";
        System.out.println("Enter destination  file : "); // dia chi file coppy den
        String desPath="D:\\C221G1_DuongThanhHau\\Module22\\src\\bai_17_io_binary_file_serialization\\thuc_hanh\\coppy_file_binary\\fileCoppy";
        File sourceFile= new File(sourcePath);
        File desFile = new File(desPath);
        try {
            copyFileUsingStream(sourceFile,desFile);
            System.out.println("Da hoan thanh coppy file ! ");
        } catch (IOException e) {
            System.err.println("Can't coppy that file ");
            System.out.println(e.getMessage());

        }

    }



}
