package controlles;

import commons.DocGhiFile;
import models.DanhBa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiChucNang {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuDanhBa() {
        do {
            try {
                System.out.println("CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ\n" +
                        "Chọn chức năng theo số (để tiếp  tục) :\n" +
                        "1.\tXem danh sách\n" +
                        "2.\t2.Thêm mới\n" +
                        "3.\tCập nhật\n" +
                        "4.\tXóa\n" +
                        "5.\tTìm kiếm\n" +
                        "6.\tĐọc từ file\n" +
                        "7.\tGhi vào file\n" +
                        "8.\tThoát\n");
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        xemDanhSach();
                        break;
                    case 2:
                        themMoi();
                        break;
                    case 3:
                        capNhat();
                        break;
                    case 4:
                        xoaDanhBa();
                        break;
                    case 5:
                        timKiem();
                        break;
                    case 6:
                        DocGhiFile.docFile("danhBa.csv");
                        break;
                    case 7:
                        List<DanhBa> danhBaList = new ArrayList<>();
                        DocGhiFile.ghiFile("danhBa.csv",danhBaList,true);
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Vui lòng nhập lại ! ");


                }
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        } while (true);

    }

    private static void timKiem() {
    }

    public static void xoaDanhBa() {
        boolean kiemTra = false;
        int chon = 0;
        List<DanhBa> danhBaList = DocGhiFile.docFile("danhBa.csv");

        while (true) {
            for (int i = 0; i < danhBaList.size(); i++) {
                System.out.println((i + 1) + " : " + danhBaList.get(i));
            }
            System.out.println("Nhập so cần xóa");
            while (true) {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui lòng nhập số");
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < danhBaList.size(); i++) {
                if (chon == i + 1) {
                    danhBaList.remove(i);
                    DocGhiFile.ghiFile("danhBa.csv", danhBaList, false);
                    kiemTra = true;
                    break;

                }

            }
            if (kiemTra) {
                break;
            } else {
                System.out.printf("Vui lòng xóa trong danh sách");
            }
        }
    }

        public static void capNhat () {

        }

        public static void xemDanhSach () {

            List<DanhBa> danhBaList = DocGhiFile.docFile("danhBa.csv");
            for (DanhBa danhBa : danhBaList) {
                danhBa.showInfor();
            }

        }


        public static void themMoi () {
            String soDienThoai = QuanLiNhapLieu.nhapSDT();
            String nhom = QuanLiNhapLieu.nhapNhom();
            String hoTen = QuanLiNhapLieu.nhapHoTen();
            String diaChi = QuanLiNhapLieu.nhapDiaChi();
            String ngaySinh = QuanLiNhapLieu.nhapNgaySinh();
            String email = QuanLiNhapLieu.nhapEmail();
            List<DanhBa> danhBaList = new ArrayList<>();
            DanhBa danhBa = new DanhBa(soDienThoai, nhom, hoTen, diaChi, ngaySinh, email);
            danhBaList.add(danhBa);
            DocGhiFile.ghiFile("daBa.csv", danhBaList, true);


        }
        

    }
