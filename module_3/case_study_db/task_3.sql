use case_study_db;
select *
from khach_hang
where (year(curdate()) - year(ngay_sinh) between 18 and 50) and (dia_chi in ("Da Nang","Quang Tri"));