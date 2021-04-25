package bai_16_io_text_file.bai_tap.bai1_doc_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static void main(String[] args) throws IOException {
//        File file = new File("src\\bai_16_io_text_file\\bai_tap\\doc_file\\bai1.csv");
        String file="src\\bai_16_io_text_file\\bai_tap\\bai1_doc_file\\bai1.csv";
//        if (!file.exists()){
//            file.createNewFile();
//        }

        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine())!=null){
            String[] strings=line.split(",");
            System.out.println(strings[strings.length-1] );
            // truy xuất trực tiếp
//            String strings=line.split(",")[5];
//            System.out.println(strings);
        }

    }
}
