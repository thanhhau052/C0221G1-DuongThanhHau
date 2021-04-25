package bai_17_io_binary_file_serialization.bai_tap.bai2;

import java.io.Serializable;

public class IO_Product {
    public static void main(String args[]) throws Exception {
        ProcessProduct ps = new ProcessProduct();   // tao doi tuong cua lop ProcessProduct
        Product[] product1 = null;
        product1 = ps.create();  // nhap product
        ps.write(product1);     // viet vao file
        Product[] product2 = null;
        product2 = ps.read();   // doc tu file
        ps.show(product2);      //hien thi kq
    }

    static class Product implements Serializable {
        private int id;
        private String name;
        private String hangSanPham;
        private double giaTien;
        private String moTa;

        public Product() {
        }

        public Product(int id, String name, String hangSanPham, double giaTien, String moTa) {
            this.id = id;
            this.name = name;
            this.hangSanPham = hangSanPham;
            this.giaTien = giaTien;
            this.moTa = moTa;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHangSanPham() {
            return hangSanPham;
        }

        public void setHangSanPham(String hangSanPham) {
            this.hangSanPham = hangSanPham;
        }

        public double getGiaTien() {
            return giaTien;
        }

        public void setGiaTien(double giaTien) {
            this.giaTien = giaTien;
        }

        public String getMoTa() {
            return moTa;
        }

        public void setMoTa(String moTa) {
            this.moTa = moTa;
        }
    }
}