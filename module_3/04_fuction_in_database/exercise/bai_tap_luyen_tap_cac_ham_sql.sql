
use quan_li_sinh_vien;
 
-- Hiển thị tất cả thông tin môn học  có create lớn nhất
select * , max(Credit)  as max
from  subject  s
having max(Credit) >= all(select max(Credit) from subject ) ;

 select * from mark;
 
-- Hiển thị  các thông tin môn học có điểm thi lớn nhất
select *
from `subject`
join mark on mark.SubId =subject.subId
group by subject.subId
having mark.mark >= all(select mark from mark);

-- Hiển thị các thông tin sinh viên và  điểm trung bình của mỗi sinh viên 
-- Xếp  hạng theo thứ tự giảm dần
select *,avg(Mark) as diem_trung_binh
from student  s
join mark m on m.StudentId= s.StudentId
group by s.studentId
order by m.mark desc;