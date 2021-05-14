package bai_11_DSA_stack_queue.bai_tap.bai3_dem_tu_trong_chuoi_tree_map;

import java.util.Map;
import java.util.TreeMap;

public class DemTuTrongChuoi {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';


    public static Map<String, Integer> demTu(String input) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        //Trong java, lớp StringBuilder được sử dụng để tạo chuỗi có thể thay đổi (mutable)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                // build một từ

                //public StringBuilder append(String s):
                // được sử dụng để nối thêm các chuỗi được chỉ định với chuỗi này.
                // Các phương thức append() được nạp chồng như append(char), append(boolean),
                // append(int), append(float), append(double), ...
                sb.append(input.charAt(i));
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }


    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}