package bai_16_io_text_file.bai_tap.bai2_sao_chep_file;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) throws IOException {
//        File file = new File("src\\bai_16_io_text_file\\bai_tap\\bai2_sao_chep_file\\file1.txt");

        String path1 = "src\\bai_16_io_text_file\\bai_tap\\bai2_sao_chep_file\\file1.txt";
        String path2 = "src\\bai_16_io_text_file\\bai_tap\\bai2_sao_chep_file\\file2.txt";
        FileReader fileReader = new FileReader(path1);
        FileWriter fileWriter = new FileWriter(path2, true);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.append(line); // ghi theo dong
            bufferedWriter.newLine();  // xuong dong
        }
        bufferedReader.close();
        bufferedWriter.flush(); // xa luong
        bufferedWriter.close();
    }
}
