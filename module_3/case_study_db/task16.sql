-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 
-- đến năm 2019.

use case_study_db;

delete nhan_vien
	from nhan_vien nv
    join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
	where nv.id_nhan_vien not in (  select id_nhan_vien
									from  hop_dong hd  
									where year(hd.ngay_lam_hop_dong) between 2017 and 2019
									group by hd.id_nhan_vien);