use case_study_db;
select *
from nhan_vien 
where (ho_ten like "h%" or ho_ten like " t%"  or ho_ten like "vk%" ) 
and (length(ho_ten) <=15) ;