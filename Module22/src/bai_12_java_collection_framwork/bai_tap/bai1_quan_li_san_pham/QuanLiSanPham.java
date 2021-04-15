package bai_12_java_collection_framwork.bai_tap.bai1_quan_li_san_pham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLiSanPham {
     static List<SanPham> sanPhams = new ArrayList<>();

    public static void add(SanPham sanPham) {
        sanPhams.add(sanPham);
    }


    public static void edit(int id) {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getId() == id) {
                sanPham.setId(1);
                sanPham.setName("Iphone");
                sanPham.setPrice(8000);
                return;
            }
        }

    }

    public static SanPham remove(int id) {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getId() == id) {
                sanPhams.remove(sanPham);
                return sanPham;
            }
        }

        return null;
    }

    public static void display() {
        System.out.println(" Danh sach cac san pham  : ");
        System.out.println("_____________________________________________");
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham);
            System.out.println("_____________________________________________");

        }
    }

    public static void soft() {
        Comparator<SanPham> comparator = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };
        sanPhams.sort(comparator);
    }


}

