/*
20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có
 trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang),
 HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
*/

  
use case_study_db;

select  id_nhan_vien, ho_ten, email, sdt, ngay_sinh, dia_chi
from nhan_vien 
union all
select id_khach_hang, ho_ten, email, sdt, ngay_sinh, dia_chi
from khach_hang