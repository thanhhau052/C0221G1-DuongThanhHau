create database if not exists case_study_db;
use case_study_db ;
CREATE TABLE vi_tri (
	id_vi_tri INT AUTO_INCREMENT PRIMARY KEY,
    ten_vi_tri VARCHAR(45)
);
CREATE TABLE trinh_do(
	id_trinh_do INT AUTO_INCREMENT PRIMARY KEY,
    trinh_do VARCHAR(45)
);
CREATE TABLE bo_phan(
	id_bo_phan INT AUTO_INCREMENT PRIMARY KEY,
    ten_bo_phan VARCHAR(45)
);
CREATE TABLE nhan_vien(
	id_nhan_vien INT AUTO_INCREMENT PRIMARY KEY,
    ho_ten VARCHAR(45),
    id_vi_tri INT NOT NULL,
    id_trinh_do INT NOT NULL,
    id_bo_phan INT NOT NULL,
    ngay_sinh DATE NOT NULL,
    so_cmtnd VARCHAR(45),
    luong DOUBLE,
    sdt VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45),
    FOREIGN KEY (id_vi_tri) REFERENCES vi_tri(id_vi_tri),
    FOREIGN KEY (id_trinh_do) REFERENCES trinh_do(id_trinh_do),
    FOREIGN KEY (id_bo_phan) REFERENCES bo_phan(id_bo_phan)
);
CREATE TABLE loai_khach_hang(
	id_loai_khach_hang INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_khach_hang VARCHAR(45)
);
CREATE TABLE khach_hang(
	id_khach_hang INT AUTO_INCREMENT PRIMARY KEY,
    id_loai_khach_hang INT NOT NULL,
    ho_ten VARCHAR(45),
    ngay_sinh DATE NOT NULL,
    so_cmtnd VARCHAR(45),
    sdt VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45),
    FOREIGN KEY (id_loai_khach_hang) REFERENCES loai_khach_hang(id_loai_khach_hang)
);

CREATE TABLE loai_dich_vu(
	id_loai_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_dich_vu VARCHAR(45)
);

CREATE TABLE kieu_thue(
	id_kieu_thue INT AUTO_INCREMENT  PRIMARY KEY,
    ten_kieu_thue VARCHAR(45),
    gia INT
);

CREATE TABLE dich_vu(
	id_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
    ten_dich_vu VARCHAR(45),
    dien_tich INT,
    so_tang INT,
    so_nguoi_toi_da VARCHAR(45),
    chi_phi_thue DOUBLE,
    id_kieu_thue INT NOT NULL,
	id_loai_dich_vu INT NOT NULL,
    trang_thai VARCHAR(45),
     FOREIGN KEY (id_kieu_thue) REFERENCES kieu_thue(id_kieu_thue),
     FOREIGN KEY (id_loai_dich_vu) REFERENCES loai_dich_vu(id_loai_dich_vu)
);
 CREATE TABLE dich_vu_di_kem(
		id_dich_vu_di_kem INT AUTO_INCREMENT PRIMARY KEY,
        ten_dich_vu_di_kem VARCHAR(45),
        gia INT,
        don_vi INT,
        trang_thai_kha_dung VARCHAR(45)
    );
CREATE TABLE  hop_dong(
	id_hop_dong INT AUTO_INCREMENT PRIMARY KEY,
    id_nhan_vien INT NOT NULL,
    id_khach_hang INT NOT NULL,
    id_dich_vu INT NOT NULL,
    ngay_lam_hop_dong DATE NOT NULL,
    ngay_ket_thuc DATE NOT NULL,
    tien_dat_coc INT,
    tong_tien INT,
    FOREIGN KEY (id_nhan_vien) REFERENCES nhan_vien(id_nhan_vien),
    FOREIGN KEY (id_khach_hang) REFERENCES khach_hang(id_khach_hang),
    FOREIGN KEY (id_dich_vu) REFERENCES dich_vu(id_dich_vu)
);

CREATE TABLE hop_dong_chi_tiet(
	id_hop_dong_chi_tiet INT AUTO_INCREMENT PRIMARY KEY,
    id_hop_dong INT NOT NULL,
    id_dich_vu_di_kem INT NOT NULL,
    so_luong INT,
    FOREIGN KEY (id_hop_dong) REFERENCES hop_dong(id_hop_dong),
    FOREIGN KEY (id_dich_vu_di_kem) REFERENCES dich_vu_di_kem(id_dich_vu_di_kem)
    );
    

