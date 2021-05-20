-- 17.	Cập nhật thông tin những khách hàng 
-- có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng 
-- với tổng Tiền thanh toán trong năm 2019
-- là lớn hơn 10.000.000 VNĐ

use case_study_db;

update khach_hang kh
set kh.id_loai_khach_hang = 1
where kh.id_loai_khach_hang =2 and
( select id_khach_hang
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
where year(hd.ngay_lam_hop_dong)=2019
group by hd.id_khach_hang
having sum(dv.chi_phi_thue+ hdct.so_luong* dvdk.gia) > 1000);
select * from khach_hang