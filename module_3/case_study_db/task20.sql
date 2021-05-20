/*
20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có
 trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang),
 HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
*/

  
use case_study_db;

select  nv.id_nhan_vien, nv.ho_ten  , nv.email, nv.sdt, nv.ngay_sinh, nv.dia_chi
from nhan_vien  nv
union all
select kh.id_khach_hang,kh.ho_ten,  kh.email, kh.ngay_sinh, kh.dia_chi
from khach_hang kh;