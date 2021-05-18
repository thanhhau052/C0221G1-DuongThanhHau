
use quan_li_sinh_vien;
 
-- Hiển thị tất cả thông tin môn học  có create lớn nhất
select * , max(Credit)  as max
from  subject  
where credit=( select max(credit) from subject);


 
-- Hiển thị  các thông tin môn học có điểm thi lớn nhất
select *
from `subject`
where SubId in ( select SubId from mark 
				where mark = (select max(mark) from mark)
                );

-- Hiển thị các thông tin sinh viên và  điểm trung bình của mỗi sinh viên 
-- Xếp  hạng theo thứ tự giảm dần
select *,avg(m.Mark) as diem_trung_binh
from student  s
left join mark m on m.StudentId = s.StudentId
group by s.StudentName ;

-- fix comment --------
