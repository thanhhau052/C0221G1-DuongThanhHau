
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là
-- tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
use case_study_db;
select * from hop_dong;

select month(hd.ngay_lam_hop_dong) as thang, count(*) as so_luong
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
-- em nhập thông tin là năm 2021 nên em để của năm 2021
where  year(hd.ngay_lam_hop_dong) =2021
group by thang;
