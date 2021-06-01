drop database demo;
CREATE DATABASE demo;
USE demo;
create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');























DELIMITER //
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END//
DELIMITER ;




-- showAll-- 

DELIMITER //
CREATE PROCEDURE select_user()
BEGIN
    SELECT *

    FROM users;

    END//
DELIMITER ;

call select_user();

-- Update
DELIMITER //
CREATE PROCEDURE update_user(in  p_id int, in p_name varchar(120),in p_email varchar(220) ,in p_country varchar(120))
BEGIN
    update users 
	set  name=p_name,
		 email =p_email,
         country= p_country
         where id= p_id;

    END//
DELIMITER ;
call update_user(1,"nam","abc","a");


-- delete
DELIMITER //
CREATE PROCEDURE delete_user(in  p_id int)
BEGIN
   delete from  users
   where id=p_id;
    END//
DELIMITER ;


call delete_user(2);



-- insert_user
DELIMITER //
CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END//

DELIMITER ;






-- bai thuc hanh 2 (ss13)
create table Permision(

id int(11) primary key,

name varchar(50)

);

 

create table User_Permision(

permision_id int(11),

user_id int(11)

);