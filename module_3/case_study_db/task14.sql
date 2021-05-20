-- 14. Hiển thị thông tin tất cả các dịch vụ đi kèm  chỉ  mới được sử dụng 
-- một lần duy nhất  . Thông tin hiển thị bao gồm : 
-- IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
use case_study_db;
select   hd.id_hop_dong,
		 ldv.ten_loai_dich_vu, 
		 dvdk.ten_dich_vu_di_kem,
		 (hdct.so_luong) ,count(dvdk.id_dich_vu_di_kem) as "so_lan_su_dung"
from hop_dong hd 
	join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
	join loai_dich_vu ldv on ldv.id_loai_dich_vu = dv.id_loai_dich_vu
	join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
	join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
group by dvdk.id_dich_vu_di_kem
having so_lan_su_dung = 1;

