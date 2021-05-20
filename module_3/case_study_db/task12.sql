/*
			12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang,
			SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết),
			TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 
			tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
*/
use case_study_db;

select hd.id_hop_dong,
 nv.ho_ten as ten_nv, 
 kh.ho_ten as ten_kh,
 kh.sdt, dv.ten_dich_vu,
 hdct.so_luong,
 hd.tien_dat_coc 
from dich_vu dv
join hop_dong hd  on dv.id_dich_vu = hd.id_dich_vu
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
join nhan_vien nv on hd.id_nhan_vien = nv.id_nhan_vien
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
where ((year(hd.ngay_lam_hop_dong) = 2019 and month(hd.ngay_lam_hop_dong)>=10)
		and hd.id_dich_vu not in (select hd.id_dich_vu
								from hop_dong hd
								where (year(hd.ngay_lam_hop_dong)= 2019 AND month(hd.ngay_lam_hop_dong)<= 6)))
group by hdct.id_hop_dong;