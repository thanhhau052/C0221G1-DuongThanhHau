package bai_16_io_text_file.bai_tap.bai2_sao_chep_file;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) throws IOException {

        try {
            //        File file = new File("src\\bai_16_io_text_file\\bai_tap\\bai2_sao_chep_file\\file1.txt");

            String path1 = "src\\bai_16_io_text_file\\bai_tap\\bai2_sao_chep_file\\file1.txt";
            String path2 = "src\\bai_16_io_text_file\\bai_tap\\bai2_sao_chep_file\\file2.txt";


            FileReader fileReader = new FileReader(path1);
            FileWriter fileWriter = new FileWriter(path2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
//            bufferedWriter.append(line); // ghi theo dòng append là true;
                bufferedWriter.write(line);
                bufferedWriter.newLine();  // xuống dòng
//            bufferedWriter.append("\n"); // cách 2 của xuống dòng
//            bufferedReader.
            }
            bufferedReader.close();
            bufferedWriter.flush(); // xã luồng
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("loi");
        }
    }
}
