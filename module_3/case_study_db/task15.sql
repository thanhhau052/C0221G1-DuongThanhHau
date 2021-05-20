-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm
-- IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai,
-- DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018
-- đến 2019

use  case_study_db;
select  nv.id_nhan_vien, 
nv.ho_ten,
 td.trinh_do, 
 bp.ten_bo_phan,
 nv.sdt,
 nv.dia_chi,
 count(hd.id_nhan_vien)  as dem_hd
from nhan_vien nv
join bo_phan bp  on nv.id_bo_phan = bp.id_bo_phan
join trinh_do td on nv.id_trinh_do = td.id_trinh_do
join hop_dong  hd on nv.id_nhan_vien = hd.id_nhan_vien
where (year(hd.ngay_lam_hop_dong)in (2018,2019))
group by hd.id_nhan_vien
having dem_hd   <= 3 
order by dem_hd ;