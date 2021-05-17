-- 14. Hiển thị thông tin tất cả các dịch vvuj đi kèm  chỉ  mới được sử dụng 
-- một lần duy nhất  . Thông tin hiển thị bao gồm : 
-- IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

use case_study_db;
select *
from  hop_dong hd 
join dich_vu dv on hd.id_dich_vu =dv.id_dich_vu
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by hdct.id_dich_vu_di_kem
having count(hdct.id_dich_vu_di_kem)=1;

