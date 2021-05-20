

/*
		 23.Tạo Store procedure Sp_1 Dùng để xóa thông tin 
		 của một Khách hàng nào đó với Id Khách
		 hàng được truyền vào như là 1 tham số của Sp_1
 */
 use case_study_db;
delimiter //
create  procedure  xoa_khach_hang(in d_id int )
begin
delete from khach_hang 
where khach_hang.id_khach_hang=d_id;

end; //
delimiter ;
call xoa_khach_hang(6)  ;
