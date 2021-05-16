
use quan_li_sinh_vien;
 
-- Hiển thị tất cả thông tin môn học  có create lớn nhất
select * , max(Credit)  as max
from  subject  s
having max(Credit) >= all(select max(Credit) from subject ) ;


-- Hiển thị các thông tin môn học có điểm thi lớn nhất
select s.sub_name,s.credit,s.`Status`, max(m.mark) as "Điểm cao nhất"
from `subject` as s 
join mark as m on s.sub_id = m.sub_id;

select *, max(m.mark) as ' diem cao nhat '
from student s
join mark m on s.SubId =m.SubId ;

