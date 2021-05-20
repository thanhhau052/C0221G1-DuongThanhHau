-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi 
-- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
use case_study_db;
select kh.ho_ten, kh.ngay_sinh, kh.dia_chi
from khach_hang kh
where (year(curdate()) - year(ngay_sinh) between 18 and 50) 
and (dia_chi in ("Da Nang","Quang Tri"));