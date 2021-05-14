use quan_li_sinh_vien;
--  hiển thị các sinh viên có tên bắt đầu bằng chữ "h"
select *
from student
where StudentName like "H%" or StudentName like "%H%";
-- hiển thị thông tin các lớp có thời gian bắt đầu vào tháng 12
select *
from class
where month(StartDate) =12;
-- hiển thị các thông tin bắt đầu trong khoảng từ 3-5
select * 
from subject
where Credit between 3 and 5;

SET SQL_SAFE_UPDATES = 0;
-- thay đổi mã lớp (classID)  của sinh viên có tên là hung  là 2
update student
set ClassID = 2
where StudentName="Hung";

-- hiển thị các thông tin studentName , subname ,mark . Dữ liệu 
-- sắp xếp theo điểm thi giảm dần . nếu trùng sắp xếp theo tên tăng dần
select s.StudentName, sub.SubName, m.*
from student s join mark m on s.StudentId = m.StudentId 
join subject sub on m.SubId = sub.SubId
order by m.Mark desc, s.StudentName asc;
SET SQL_SAFE_UPDATES = 0;