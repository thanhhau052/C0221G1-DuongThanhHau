package bai_12_java_collection_framworkk.bai_tap.bai1_quan_li_san_pham;

import static bai_12_java_collection_framworkk.bai_tap.bai1_quan_li_san_pham.QuanLiSanPham.*;

public class MainQuanLiSanPham {
    public static void main(String[] args) {
        SanPham sanPham1 = new SanPham("Nokia", 1, 13000);
        SanPham sanPham2 = new SanPham("SamSum", 2, 8000);
        SanPham sanPham3 = new SanPham("  Oppo", 3, 5000);
        add(sanPham1);
        add(sanPham2);
        add(sanPham3);
        add(new SanPham("Bphone",4,1000));
        display();
        soft();
        remove(2);
        edit(1);
        display();

    }


}
