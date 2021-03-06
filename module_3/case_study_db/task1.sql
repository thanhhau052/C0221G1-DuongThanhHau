-- tạo bảng

-- 1.	Thêm mới thông tin cho tất cả các bảng 
-- có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.

-- SET SQL_SAFE_UPDATES = 0;

drop database  case_study_db;
create database case_study_db;
use case_study_db ;
CREATE TABLE vi_tri (
	id_vi_tri INT AUTO_INCREMENT PRIMARY KEY,
    ten_vi_tri VARCHAR(45)
);

INSERT INTO vi_tri(ten_vi_tri)
VALUES ("bảo vệ"),
	("phục vụ"),
	("lễ tân"),
	("quản lý"),
    ("giám đốc");
    
    
CREATE TABLE trinh_do(
	id_trinh_do INT AUTO_INCREMENT PRIMARY KEY,
    trinh_do VARCHAR(45)
);

insert into trinh_do(trinh_do)
values ("lao động phổ thông "),
("trung cấp "),
("cao đẳng"),
("đại học "),
("sau đại học ");


CREATE TABLE bo_phan(
	id_bo_phan INT AUTO_INCREMENT PRIMARY KEY,
    ten_bo_phan VARCHAR(45)
);

insert into bo_phan(ten_bo_phan)
values ("bảo an"),
	("nhân sự"),
    ("hành chính"),
    ("quản lí"),
    ("giám đốc");
    
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
insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmtnd,luong,sdt,email,dia_chi)
values ("Hau",1,1,1,"1997-02-24","194571756",15000000,"0399191054","thanhhau026@gmail.com","quang binh"),
 ("Nguyen Phuong Nam",2,2,2,"1999-12-12","123456789",10000000,"0333313033","nam11@gmail.com","Da Nang"),
("Dao Thao",3,3,3,"1993-12-12","123456789",10000000,"03932323223","thao22@gmail.com","quang binh"),
("Le Phuoc Sy Phu",4,4,4,"1995-12-12","123400789",15000000,"03932323220","phule@gmail.com","Quang Tri"),
("Nguyen Van cuong",5,5,5,"1997-12-12","10010000100",10000000,"03932323211","thao22@gmail.com","quang binh");

    
    
CREATE TABLE loai_khach_hang(
	id_loai_khach_hang INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_khach_hang VARCHAR(45)
);

insert into loai_khach_hang(ten_loai_khach_hang)
values ("Diamond"),
	("Platinium"),
	("Gold"),
	("Silver"),
    ("Member");
    
    
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

    
insert into khach_hang(id_loai_khach_hang,ho_ten,ngay_sinh,so_cmtnd,sdt,email,dia_chi)
values (1,"Tran Van Nam","1999-11-11","1234","12345678","vannam@gmail.com","hue"),
		(2,"Nguyen Thi Binh","1990-02-02","1235","87654321","thibinh@gmail.com","da nang"),
		(3,"Dao Ngoc Anh","1990-02-02","123000005","87654321","ngocanh@gmail.com","da nang"),
		(4,"Tran Van Long","1991-02-02","123000005","87654321", "vanlong@gmail.com","quang ngai"),
		(5,"Nguyen ANh Tuan","1990-02-02","123000005","87654321","anhtuan@gmail.com","Ha Noi"),
		(5,"Nguyen ANh Tuan","1990-02-02","123000005","87654321","anhtuan@gmail.com","Ha Noi"),
		(5,"Nguyen ANh Tuan","1990-02-02","123000005","87654321","anhtuan@gmail.com","Ha Noi"),
		(5,"Nguyen ANh Tuan","1990-02-02","123000005","87654321","anhtuan@gmail.com","Ha Noi");
CREATE TABLE loai_dich_vu(
	id_loai_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_dich_vu VARCHAR(45)
);

insert into loai_dich_vu(ten_loai_dich_vu)
values ("room"),
	("house"),
    ("villa"),
    ("room vp"),
    ("villa vp");
    

CREATE TABLE kieu_thue(
	id_kieu_thue INT AUTO_INCREMENT  PRIMARY KEY,
    ten_kieu_thue VARCHAR(45),
    gia INT
);

insert into kieu_thue(ten_kieu_thue,gia)
values ("6h",500000),
	("12h",200000),
	("24h",400000),
	("48h",800000),
	("72h",3000000);

CREATE TABLE dich_vu(
	id_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
    ten_dich_vu VARCHAR(45),
    dien_tich INT,
    so_tang INT,
    so_nguoi_toi_da int,
    chi_phi_thue DOUBLE,
    id_kieu_thue INT NOT NULL,
	id_loai_dich_vu INT NOT NULL,
    trang_thai VARCHAR(45),
     FOREIGN KEY (id_kieu_thue) REFERENCES kieu_thue(id_kieu_thue),
     FOREIGN KEY (id_loai_dich_vu) REFERENCES loai_dich_vu(id_loai_dich_vu)
);
insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values ("house",20,2,3,1,1,1,"close"),
	   ("villa1",25,3,3,2,2,2,"open"),
	   ("villa2",26,3,3,2,2,2,"open"),
	   ("villa3",27,3,3,2,2,2,"open"),
	   ("villa5",28,3,3,2,2,2,"open");



 CREATE TABLE dich_vu_di_kem(
		id_dich_vu_di_kem INT AUTO_INCREMENT PRIMARY KEY,
        ten_dich_vu_di_kem VARCHAR(45),
        gia INT,
        don_vi INT,
        trang_thai_kha_dung VARCHAR(45)
    );
    
    insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values ("taxi",1000,5,"hop li"),
	("karaoke",1500,7,"hop li"),
    ("cafe",2000,10,"dep"),
    ("pizza",1200,10,"ngon"),
    ("pizza vp",1700,10,"ngon");
    
    
    
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


insert into hop_dong (id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)
values (1,1,1,"2018-08-11","2019-10-10",5000,10000),
(2,2,2,"2016-11-11","2017-11-11",3000,2000),
(3,3,3,"2021-10-11","2021-11-11",5000,1000),
(4,4,4,"2020-11-11","2022-11-11",15000,5000),
(5,5,5,"2020-11-11","2021-11-11",6000,3000);




    

CREATE TABLE hop_dong_chi_tiet(
	id_hop_dong_chi_tiet INT AUTO_INCREMENT PRIMARY KEY,
    id_hop_dong INT NOT NULL,
    id_dich_vu_di_kem INT NOT NULL,
    so_luong INT,
    FOREIGN KEY (id_hop_dong) REFERENCES hop_dong(id_hop_dong),
    FOREIGN KEY (id_dich_vu_di_kem) REFERENCES dich_vu_di_kem(id_dich_vu_di_kem)
    );
    
 insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
 values (1,1,5),
 	(2,2,3),
 	(3,3,7),
 	(4,4,5),
 	(5,5,9);




--     use case_study_db; 
--     drop database case_study_db;
--     delete from case_study_db;

    
