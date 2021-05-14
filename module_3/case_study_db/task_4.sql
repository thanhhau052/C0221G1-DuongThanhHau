-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

use case_study_db;

select kh.ho_ten, count(*) as so_lan
from khach_hang kh
join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang 
join loai_khach_hang lkh on lkh.id_loai_khach_hang = kh.id_loai_khach_hang 
where lkh.ten_loai_khach_hang ="Diamond" 
group by hd.id_khach_hang
order by so_lan asc;