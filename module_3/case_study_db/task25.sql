
-- 25 .Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong thì hiển thị 
-- tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database
 create table `show`(
		tong_so int
    );



drop trigger tr_1;

DELIMITER //
create trigger tr_1 after delete on hop_dong
for each row
begin 
	declare count_dl int ;
    set count_dl = (select count(*) from hop_dong);
	insert into `show`
    values(count_dl);
end; //
DELIMITER ;
SET FOREIGN_KEY_CHECKS=0;  

delete from hop_dong
where id_hop_dong = 1 ;
select * from `show`;