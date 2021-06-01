
use demo;
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