	 -- 7.	Hiển thị thông tin IDDichVu,
	 -- TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue,
	 -- TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 
	 -- 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
use case_study_db;
select   dv.id_dich_vu,
		 dv.ten_dich_vu, 
		 dv.dien_tich,
		 dv.so_nguoi_toi_da ,
		 dv.chi_phi_thue,
		 ldv.ten_loai_dich_vu
from dich_vu dv
inner join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
inner join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong) = 2021
and not exists(select ngay_lam_hop_dong 
			from hop_dong 
			where year(ngay_lam_hop_dong)=2019 
			and hd.ngay_lam_hop_dong=ngay_lam_hop_dong 
			and hd.id_hop_dong <> id_hop_dong );