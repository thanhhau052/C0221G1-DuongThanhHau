
use case_study1;
INSERT INTO `position`(position_name)
VALUES ("bảo vệ"),
	("phục vụ"),
	("lễ tân"),
	("quản lý"),
    ("giám đốc");
    
    insert into education_degree(education_degree_name)
values ("lao động phổ thông "),
("trung cấp "),
("cao đẳng"),
("đại học "),
("sau đại học ");

insert into division(division_name)
values ("bảo an"),
	("nhân sự"),
    ("hành chính"),
    ("quản lí"),
    ("giám đốc");
    
    insert into employee(  employee_name,position_id,education_degree_id,division_id,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,username )
values ("Duong Thanh Hau",1,1,1,"1997-02-24","194571756",15000000,"0399191054","thanhhau026@gmail.com","quang binh",null),
 ("Nguyen Phuong Nam",2,2,2,"1999-12-12","123456789",10000000,"0333313033","nam11@gmail.com","Da Nang",null),
("Dao Thao",3,3,3,"1993-12-12","123456789",10000000,"03932323223","thao22@gmail.com","quang binh",null),
("Le Phuoc Sy Phu",4,4,4,"1995-12-12","123400789",15000000,"03932323220","phule@gmail.com","Quang Tri",null),
("Nguyen Van cuong",5,5,5,"1997-12-12","10010000100",10000000,"03932323211","thao22@gmail.com","quang binh",null);



insert into customer_type(customer_type_name)
values ("Diamond"),
	("Platinium"),
	("Gold"),
	("Silver"),
    ("Member");
    
    
    insert into service_type(service_type_name)
values  ("room"),
		("house"),
		("villa"),
		("room vp"),
		("villa vp");
        
        insert into rent_type(rent_type_name,rent_type_cost)
values ("6h",500000),
	("12h",200000),
	("24h",400000),
	("48h",800000),
	("72h",3000000);
    
        
    insert into attach_service(attach_service_name,
								attach_service_cost,
								attach_service_until,
								attach_service_status)
	values ("taxi",1000,5,"hop li"),
			("karaoke",1500,7,"hop li"),
			("cafe",2000,10,"dep"),
			("pizza",1200,10,"ngon"),
			("pizza vp",1700,10,"ngon");
            
            
            