-- tạo database
CREATE DATABASE lession1;
USE lession1;
CREATE TABLE students(
id int not null primary key auto_increment ,
`name` VARCHAR(50),
birthday date
);
select * from students;

insert into students(name, birthday)
values ( "hau","2020-2-24"),
( "hau1","2020-2-24"),
( "hau2","2020-2-24");
update students
set `name`="nam"
where id ="3";
delete from students 
where id ="5";

