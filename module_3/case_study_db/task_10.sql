-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
 -- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc,
 -- SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
 
   
use case_study_db;

select hd.id_hop_dong,
 hd.ngay_lam_hop_dong,
 hd.ngay_ket_thuc, 
hd.tien_dat_coc,
 sum(hdct.so_luong) as so_luong_dv_dk
from hop_dong hd
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
group by hd.id_hop_dong;