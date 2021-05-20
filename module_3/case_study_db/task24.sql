/*
		24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2
		 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
		 với nguyên tắc không được trùng khóa chính và đảm bảo toàn
		 vẹn tham chiếu đến các bảng liên quan.
*/

use case_study_db;
drop procedure Sp_2;
delimiter //
create procedure Sp_2
( in
	id_hop_dong1 INT ,
    id_nhan_vien1 INT,
    id_khach_hang1 INT  ,
    id_dich_vu1 INT ,
    ngay_lam_hop_dong1 DATE ,
    ngay_ket_thuc1 DATE ,
    tien_dat_coc1 INT,
    tong_tien1 INT
)
begin
insert into hop_dong
values( id_hop_dong1,id_nhan_vien1,id_khach_hang1,id_dich_vu1,ngay_lam_hop_dong1,ngay_ket_thuc1,tien_dat_coc1,tong_tien1);
end ; //
delimiter ;
call Sp_2(6,1,1,1,"2020-11-11","2021-11-11",6000,3000);


