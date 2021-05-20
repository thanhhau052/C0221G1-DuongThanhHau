/*
	21.	Tạo khung nhìn có tên là V_NHANVIEN để lấy
    được thông tin của tất cả các nhân viên có địa 
    chỉ là “da nang” và đã từng lập hợp đồng cho
    1 hoặc nhiều Khách hàng 
    bất kỳ  với ngày lập hợp đồng là “2021-11-11”
*/
use case_study_db;
drop view if exists v_nhan_vien;
create view v_nhan_vien as
select nv.*
from nhan_vien as nv
join hop_dong as hd on nv.id_nhan_vien= hd.id_nhan_vien
where nv.dia_chi="da nang" 
and hd.ngay_lam_hop_dong="2021-11-11";
select * from v_nhan_vien;


select * from hop_dong