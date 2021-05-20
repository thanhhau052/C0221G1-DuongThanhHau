
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là
-- tương ứng với mỗi tháng trong năm 2020 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
use case_study_db;
select * from hop_dong;

select month(hd.ngay_lam_hop_dong) as thang, sum(dv.chi_phi_thue) as doanh_thu
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
where  year(hd.ngay_lam_hop_dong) =2020
group by thang;
