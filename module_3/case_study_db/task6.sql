-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, 
-- TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng 
-- thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
 
 use case_study_db;

select dv.id_dich_vu, dv.ten_dich_vu,dv.dien_tich,dv.chi_phi_thue,dv.ten_dich_vu
from dich_vu dv
where dv.id_dich_vu not in (select hop_dong.id_dich_vu
						from hop_dong 
                        where (year(ngay_lam_hop_dong)=2019) 
                        and (month(ngay_lam_hop_dong) in (1,2,3))
                       );   
              




-- select  dv.id_dich_vu,
--  dv.ten_dich_vu,
--  dv.dien_tich,
--  dv.chi_phi_thue,
--  ldv.ten_loai_dich_vu,
--  hd.id_hop_dong
-- from dich_vu dv
-- join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
-- join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
-- where year(hd.ngay_lam_hop_dong) =2021
-- and month(hd.ngay_lam_hop_dong) not in (1,2,3) 
-- and  not exists(select ngay_lam_hop_dong
-- 				from hop_dong
-- 				where month(ngay_lam_hop_dong) in (1,2,3) 
--                 and hd.id_dich_vu = id_dich_vu)
-- group by dv.id_dich_vu