
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi
-- những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
use case_study_db;

select dvdk.ten_dich_vu_di_kem,dvdk.id_dich_vu_di_kem,dvdk.gia
from khach_hang kh 
join hop_dong hd on kh.id_khach_hang=hd.id_khach_hang
join hop_dong_chi_tiet hdct on hd.id_hop_dong=hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem=dvdk.id_dich_vu_di_kem
join loai_khach_hang lkh on lkh.id_loai_khach_hang=kh.id_loai_khach_hang
where lkh.ten_loai_khach_hang="Diamond" and (kh.dia_chi='Vinh' or kh.dia_chi= 'Quảng Ngãi');


-- select* from loai_khach_hang

-- select * 
-- from dich_vu dv
-- join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
-- join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
-- join loai_khach_hang lkh on kh.id_loai_khach_hang = lkh.id_loai_khach_hang
-- group by dv.ten_dich_vu
-- having lkh.ten_loai_khach_hang="Diamond"  and kh.dia_chi in ("Vinh","Quang Ngai");