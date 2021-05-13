create database quan_ly_vat_tu;
use quan_ly_vat_tu;
create table phieu_xuat_vat_tu(
ma_vat_tu int,
so_phieu_xuat int,
don_gia_xuat varchar(50),
so_luong_xuat varchar(50),
primary key (ma_vat_tu,so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat)
);
create table chi_tiet_phieu_nhap(
don_gia_nhap varchar(50),
so_luong_nhap int
);
create table phieu_nhap(
so_pn int primary key ,
ngay_nhap datetime
);

create table don_dat_hang(
so_don_hang int primary key ,
ngay_dat_hang datetime
);
create table nha_cung_cap(
ma_nha_cc int primary key,
ten_nha_cc varchar(50),
dia_chi varchar(50),
so_dien_thoai varchar(50)
);
