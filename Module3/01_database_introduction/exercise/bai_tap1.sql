-- tạo db bt1
create database ss1_bai_tap1;
-- đang chỉ đến bt1
use ss1_bai_tap1;
-- tạo bảng class
create table class(
    -- tạo id là khóa chính cho bảng , và id tự tăng
   id int not null primary key auto_increment,
   `name` varchar(100)
);
-- hiển thị bảng class
select *from class;
insert into class(name)
values("hau"),
("nam"),
("cương"),
("khánh");
create table teacher(
    id int not null primary key auto_increment,
    `name` varchar(50),
    age int ,
    country varchar(100)
);




