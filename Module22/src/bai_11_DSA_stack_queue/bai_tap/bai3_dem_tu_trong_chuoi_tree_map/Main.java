package bai_11_DSA_stack_queue.bai_tap.bai3_dem_tu_trong_chuoi_tree_map;

import java.util.Map;

import static bai_11_DSA_stack_queue.bai_tap.bai3_dem_tu_trong_chuoi_tree_map.DemTuTrongChuoi.demTu;

public class Main {
    public static void main(String[] args) {
        String str = "toi rat            dep trai"
                + "      \n toi rat ngheo .";
        System.out.println("---------------------------------");
        System.out.println(str);
        System.out.println("---------------------------------");
        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
        System.out.println("Số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = demTu(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }
}
