
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là
 -- tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
select month(hd.ngay_lam_hop_dong) as thang, count(*) as so_luong
from hop_dong hd
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
where  year(hd.ngay_lam_hop_dong) =2019
group by thang;