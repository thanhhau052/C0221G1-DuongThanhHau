-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, 
-- TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng 
-- thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

  SELECT * FROM case_study_db.dich_vu;
  use case_study_db;
  select  dich_vu.id_dich_vu,
   dich_vu.ten_dich_vu,
   dich_vu.chi_phi_thue,
   loai_dich_vu.ten_loai_dich_vu
  from dich_vu
 inner join loai_dich_vu  on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu	
 inner join hop_dong  on dich_vu.id_dich_vu = hop_dong.id_dich_vu
 group by id_dich_vu, ngay_lam_hop_dong
 having month(hop_dong.ngay_lam_hop_dong) not in (1,2,3) and year(hop_dong.ngay_lam_hop_dong) =2019;