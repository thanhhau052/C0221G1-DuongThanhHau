-- 2.	Hiển thị thông tin của tất cả nhân viên có trong 
-- hệ thống có tên bắt đầu là một trong các ký tự “H”,
--  “T” hoặc “K” và có tối đa 15 ký tự.


use case_study_db;
select *
from nhan_vien 
where (ho_ten like "h%" or ho_ten like "t%"  or ho_ten like "vk%" ) 
and (length(ho_ten) <=15) ;