--   8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống,
--   với yêu cầu HoThenKhachHang không trùng nhau.
--   Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

use case_study_db;


select kh.ho_ten
from khach_hang kh
group by ho_ten;

select  distinct ho_ten
from khach_hang;


select kh1.ho_ten
from khach_hang kh1
where not exists(
	select kh2.ho_ten
    from khach_hang kh2
    where kh1.ho_ten = kh2.ho_ten and kh1.id_khach_hang > kh2.id_khach_hang
    );
    
    
    select kh.ho_ten from khach_hang kh
    union 
    select kh.ho_ten from khach_hang kh
    