drop database bai_tap_lam_them;
create database if not exists bai_tap_lam_them;
use bai_tap_lam_them;
create table faculty(  -- khoa
faculty_id int primary key,
faculty_name char(30),
phone char(10)
);

insert into faculty()
values
		(1,"toan","001"),
		(2,"li","002"),
		(3,"hoa","003");
        
        
create table instructor(   -- chu nhiem
			instructor_id int primary key,
			instructor_name char(30),
			salary int,
			faculty_id int,
			foreign key (faculty_id) references faculty(faculty_id) 
			);

insert into instructor()
values
(1,"chanh",1000,3),
(2,"trung",900,2),
(3,"Tien",1200,1);

create table student(
student_id int primary key,
student_name varchar(40),
faculty_id int,
date_of_birth date,
place_of_birth char(30),
foreign key (faculty_id) references faculty(faculty_id) 
);

insert into student()
values 
(1,"nam",1,"1998-12-12","Da Nang"),
(2,"Khanh",1,"1990-2-12","Da Nang"),
(3,"Thao",2,"1993-3-12","Da Nang");

create table project(   -- Du an
project_id int primary key,
project_name char(30),
expense int,
place_of_intern char(30)
);

insert into project()
values
(1,"furama",600,"FPT"),
(2,"sql",700,"Code Gym"),
(3,"Nissan",2000,"Nhat Ban");

create table instructor_student(
instructor_student_id int primary key,
student_id int ,
grade int,
project_id int ,
instructor_id int ,
foreign key (student_id) references student(student_id) ,
foreign key (instructor_id) references instructor(instructor_id),
foreign key (project_id) references project(project_id) 

);

insert into instructor_student()	
values
(1,1,1,1,1),
(2,2,2,2,2),
(3,3,3,3,3);