use case_study_db;

INSERT INTO vi_tri(ten_vi_tri)
VALUES ("bảo vệ"),
	("phục vụ"),
	("lễ tân"),
	("quản lý"),
    ("giám đốc");
    
insert into trinh_do(trinh_do)
values ("lao động phổ thông "),
("trung cấp "),
("cao đẳng"),
("đại học ");

insert into bo_phan(ten_bo_phan)
values ("bảo an"),
	("nhân sự"),
    ("hành chính"),
    ("quản lí");

insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmtnd,luong,sdt,email,dia_chi)
values ("hau",1,1,1,"1234-12-12","123456789",11111111,"11111111","thanhhau026@gmaul.com","quang binh"),
 ("nam",2,2,2,"4567-12-12","123456789",222222222,"2222222","nam11@gmaul.com","quang binh"),
("thao",3,3,3,"789-12-12","123456789",33333333,"333333333","thao22@gmaul.com","quang binh");

 
insert into loai_khach_hang(ten_loai_khach_hang)
values ("Diamond"),
	("Platinium"),
	("Gold"),
	("Silver"),
    ("Member");
    
insert into khach_hang(id_loai_khach_hang,ho_ten,ngay_sinh,so_cmtnd,sdt,email,dia_chi)
values (1,"Tran Van A","1111-11-11","1234","12345678","tranvana@gmail.com","hue"),
		(2,"Nguyen Thi B","2222-02-02","1235","87654321","khanhnamnguyenthib@gmail.com","danang"),
		(3,"Nguyen Thi C","2222-02-02","1235","87654321","thic@gmail.com","danang");


insert into kieu_thue(ten_kieu_thue,gia)
values ("gio",1000),
	("ngay",50);
    
insert into loai_dich_vu(ten_loai_dich_vu)
values ("room"),
	("house"),
    ("villa");
    
insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values ("house",1,2,3,4,3,"close"),
	   ("villa",3,3,3,3,3,"open");

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values ("taxi",1000,5,"hop li"),
	("karaoke",1500,7,"hop li"),
    ("cafe",2000,10,"dep"),
    ("pizza",1200,10,"ngon");
    
insert into hop_dong (id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)
values (1,1,1,"1111-11-11","1112-10-10",5000,10000),
(2,2,2,"2222-11-11","2223-11-11",3000,7000);


insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values (1,"an",5),
	(2,"uong",7);
--     use case_study_db; 
--     drop database case_study_db;
--     delete from case_study_db;
